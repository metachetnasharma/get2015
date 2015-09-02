package DS6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass {
	public static void main(String args[]) {
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(51, "ram", "kukas"));
		employee.add(new Employee(15, "ramesh", "jaipur"));
		employee.add(new Employee(9, "mahesh", "sitapura"));
		NameComparator nameComparator = new NameComparator();
        System.out.println("\nsort in natural order");
		Collections.sort(employee);
		System.out.println(employee);
		System.out.println("\nsorting based on employees name");
		Collections.sort(employee, nameComparator);
		System.out.print(employee);
		Set<Employee> set = new HashSet<Employee>(employee);
		employee.add(new Employee(51, "ram", "kukas"));
		employee.add(new Employee(51, "ram", "kukas"));
		System.out.println("\n\nsorting by list collection");
		Collections.sort(employee);
		System.out.println(employee);
		System.out.println("\n by set collection");
		System.out.println(set);
		
	}
}
