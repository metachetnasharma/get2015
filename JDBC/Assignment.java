package com.metacube.jdbc.example;

import java.util.Scanner;

/**
 * main class to perform all queries
 * 
 * @author Chetna Sharma
 *
 */
public class Assignment {

	public static void main(String[] args) {
		int choice = 0;
		JdbcHelperClass helper = new JdbcHelperClass();
		Scanner scanner = new Scanner(System.in);
		while (choice != 4) {
			System.out
					.println("Menu \n 1.Fetch all the books published by author, given the name of the author Return the books data \n "
							+ "2.to indicate whether the the book has been issued or not \n 3.Delete all those books which were not issued in last 1 year \n 4.exit");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				helper.fetchingBookNameByAuthorName();
				break;
			case 2:
				helper.bookIssued();
				break;
			case 3:
				helper.deleteBooks();
				break;
			case 4:
				System.exit(0);
				scanner.close();
				break;

			default:
				System.out.println("Enter correct choice");
				break;
			}
		}
	}

}
