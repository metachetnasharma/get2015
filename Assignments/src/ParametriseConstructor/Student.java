package ParametriseConstructor;

/**
 * @author Chetna
 *
 */
public class Student {
	private int rollNo;
	private String name;
	private String fatherName;
	private int phoneNo;
		
	/**
	 * @param rollNo
	 * @param name
	 */
	public Student(int rollNo,String name){
	  this.rollNo = rollNo;
	  this.name = name;
	}


	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}


	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}


	/**
	 * @param fatherName the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	/**
	 * @return the phoneNo
	 */
	public int getPhoneNo() {
		return phoneNo;
	}


	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", fatherName="
				+ fatherName + ", phoneNo=" + phoneNo + "]";
	}

}
