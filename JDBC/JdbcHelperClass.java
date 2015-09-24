package com.metacube.jdbc.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*class containing all methods*/
public class JdbcHelperClass {

	/*
	 * Fetch all the books published by author, given the name of the author.
	 * Return the books data
	 */

	public void fetchingBookNameByAuthorName() {
		// System.out.println("\nFetching data using PreparedStatement ....");
		Scanner scanner = new Scanner(System.in);
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		String query = "SELECT t.title_nm from title t INNER JOIN title_author ta ON ta.title_id=t.title_id "
				+ "      INNER JOIN authors a ON a.author_id=ta.author_id WHERE a.author_nm=?";
		String name = "";
		System.out.println("Enter author name");
		name = scanner.nextLine();

		try {
			System.out.println(name);
			ps = con.prepareStatement(query);
			/* set variable in prepared statement */
			ps.setString(1, name);
			rs = ps.executeQuery();
			Title title = new Title();
			while (rs.next()) {
				title.setTitle_nm(rs.getString(1));
				System.out.println(title);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			try {
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	/*
	 * Given the name of the book, to be issued by an existing member Return
	 * flag to indicate whether the the book has been issued or not
	 */

	public void bookIssued() {
		Scanner scanner = new Scanner(System.in);
		Connection con = null;
		PreparedStatement ps = null, ps1 = null;
		ResultSet rs = null, rs1 = null;
		Statement stmt = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		String query = "select b.status, b.accession_no from books b INNER JOIN title t ON b.title_id = t.title_id WHERE t.title_nm = ?";
		String name = "";
		String member_name = "";
		System.out.println("Enter TITLE name");
		name = scanner.nextLine();

		try {
			ps = con.prepareStatement(query);
			/* set variable in prepared statement */
			ps.setString(1, name);
			rs = ps.executeQuery();
			while (rs.next()) {
				Books books = new Books();
				Member members = new Member();
				books.setStatus(rs.getString("status"));
				books.setAccession_no(rs.getInt("accession_no"));
				System.out.println(books);
				if (books.getStatus().equalsIgnoreCase("NOT_ISSUED")) {
					stmt = con.createStatement();
					System.out.println("Enter member name");
					member_name = scanner.nextLine();
					ps1 = con
							.prepareStatement("SELECT member_id FROM member WHERE member_name =  ?");
					ps1.setString(1, member_name);
					rs1 = ps1.executeQuery();
					while (rs1.next()) {
						members.setMember_id(rs1.getString("member_id"));
					}
					if (!rs1.next()) {
						System.out.println("member doesn't exist in database ");
						return;
					} else {
						rs1.beforeFirst();
						int flag = stmt
								.executeUpdate("INSERT INTO book_issue (accession_no,member_id) VALUES("
										+ "'"
										+ books.getAccession_no()
										+ "'"
										+ ","
										+ "'"
										+ members.getMember_id()
										+ "'" + ")");
						System.out.println("FLAG= " + flag);
						books.setStatus("ISSUED");
						stmt.executeUpdate(" UPDATE books SET status= 'ISSUED' WHERE accession_no ="
								+ books.getAccession_no() + ";");
						System.out.println("FLAG= " + flag);
						break;
					}
				} else {
					System.out.println("book is already issued");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			try {
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	/*
	 * Delete all those books which were not issued in last 1 year. Return the
	 * number of books deleted
	 */

	public void deleteBooks() {
		Connection con = null;
		PreparedStatement ps = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		String query = "DELETE from books WHERE accession_no NOT IN (SELECT accession_no FROM book_issue "
				+ "WHERE issue_dt BETWEEN NOW() - INTERVAL 365 DAY AND NOW());  ";

		try {
			ps = con.prepareStatement(query);
			int flag = ps.executeUpdate(query);
			System.out.println("Flag" + flag);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			try {
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
