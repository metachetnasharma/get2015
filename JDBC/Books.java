package com.metacube.jdbc.example;

public class Books {
	private String status;
	private int accession_no;
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the accession_no
	 */
	public int getAccession_no() {
		return accession_no;
	}
	/**
	 * @param accession_no the accession_no to set
	 */
	public void setAccession_no(int accession_no) {
		this.accession_no = accession_no;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Books [status=" + status + ", accession_no=" + accession_no
				+ "]";
	}
	

	
	

}
