package com.metacube.jdbc.example;

public class Title {
	String title_nm;
	String title_id;
	/**
	 * @return the title_nm
	 */
	public String getTitle_nm() {
		return title_nm;
	}
	/**
	 * @param title_nm the title_nm to set
	 */
	public void setTitle_nm(String title_nm) {
		this.title_nm = title_nm;
	}
	/**
	 * @return the title_id
	 */
	public String getTitle_id() {
		return title_id;
	}
	/**
	 * @param title_id the title_id to set
	 */
	public void setTitle_id(String title_id) {
		this.title_id = title_id;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Title [title_nm=" + title_nm + "]";
	}
	

}
