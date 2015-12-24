package ParametriseConstructor;

/**
 * @author Chetna
 *
 */
public class DemoStudent {

	public static void main(String[] args) {
		Student student = new Student(1, "xyz");
		student.setFatherName("abc");
		System.out.println(student);
	}

}
