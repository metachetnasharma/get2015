package DS4;

/**
 * @author Chetna
 *
 */
public class Person {
	
	public int priority;
	public String name;
	public String department;


	/**constructor
	 * @param priority
	 * @param name
	 * @param department
	 */
	public Person(int priority, String name, String department) {
		this.priority = priority;
		this.name = name;
		this.department = department;
	}

	public String toString() {
		return "	" + name + "	" + department ;
	}
}
