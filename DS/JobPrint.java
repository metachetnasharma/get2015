package DS4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Chetna Sharma
 *
 */
public class JobPrint {

	public static int counter = 0;

	public static void addData(Queue priorityQueue) {
		int temp, i;
		if (counter <= 0) {
			return;
		} else {
			temp = counter;
			Person[] array = new Person[temp];
			i = 0;
			while (temp != 0) {
				array[i] = (Person) priorityQueue.remove();
				i++;
				temp--;
			}
			HeapSort.sort(array);
			for (int j = array.length - 1; j >= 0; j--) {
				priorityQueue.add((Person) array[j]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Person> priorityQueue = new LinkedList<Person>();
		String priorityNo = "-1";
		String name = "";
		String department = "";

		String choice;
		String regix = "[0-9]+";
		while (true) {
			System.out.println("Enter 1 for send data to print ");
			System.out.println("Enter 2 for show printer allocation sequence");
			System.out.println("Enter 3 for exit");
			choice = sc.nextLine();
			switch (choice) {
			case "1":
				do {
					System.out
							.println("Enter user type(1 for UG, 2 for PG, 3 for Prof., 4 for charirman)");
					priorityNo = sc.nextLine();
				} while (!(priorityNo.matches(regix)));

				int priority = Integer.parseInt(priorityNo);

				while (!(priority > 0 && priority <= 4)) {
					System.out
							.println("Please enter values (1/2/3/4) as input");
					priority = sc.nextInt();
				}

				if (priority == 1) {
					department = "UG";
				} else if (priority == 2) {
					department = "PG";
				} else if (priority == 3) {
					department = "Professors";
				} else {
					department = "Chairman";
				}
				System.out.println("Enter Enter your name ");
				name = sc.nextLine();
				Person node = new Person(priority, name, department);
				priorityQueue.add(node);
				counter++;
				addData(priorityQueue);
				break;

			case "2":
				System.out
						.println("---------------Printing data---------------");
				if (counter <= 0) {
					System.out.println("\nNo current request on printer\n");
				} else {
					System.out.println(priorityQueue.remove());
					counter--;
				}

				break;

			case "3":
				return;

			default:
				System.out.println("\nPlease enter right input\n");

			}
		}

	}

}
