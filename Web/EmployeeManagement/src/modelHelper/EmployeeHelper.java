package modelHelper;

import model.Employee;

public class EmployeeHelper {

	/*Method to set values of employee field*/
	public static Employee createEmployee(int id, String name, int age,
			String dor, String email) {

		Employee employee = new Employee();
		employee.setEmployeeId(id);
		employee.setName(name);
		employee.setAge(age);
		employee.setDor(dor);
		employee.setEmail(email);
		return employee;
	}

	/*Method to update values of employee field*/
	public static void updateEmployee(Employee employee, String name, int age,
			String dor, String email) {

		employee.setName(name);
		employee.setAge(age);
		employee.setDor(dor);
		employee.setEmail(email);
	}

}
