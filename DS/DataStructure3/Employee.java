package DS6;

/**
 * @author Chetna Sharma
 *
 */
public class Employee implements Comparable {
	
	private int employeeId;
	private String name;
	private String address;

	/**
	 * @param employeeId
	 * @param name
	 * @param address
	 */
	public Employee(int employeeId, String name, String address) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.address = address;
	}


	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
   
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return getEmployeeId().compareTo(((Employee) o).getEmployeeId());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return employeeId+" "+name+" "+address;
	}

}
