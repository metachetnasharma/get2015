package DS5;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * a program to insert a number in sorted LinkList
 * 
 * @author Chetna Sharma
 *
 */
public class SortedLinkedList {

	public static void main(String args[]) {
		int size = 0, choice = 0, item = 0;
		LinkedList<Integer> lList = new LinkedList<Integer>();
		SortedLinkedListOperation object = new SortedLinkedListOperation();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of linked list");
		size = object.checkingInteger(size);
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter elements");
			item = scanner.nextInt();
			lList.add(item);
			
		}
		lList.sort(null);

		while (choice != 3) {
			System.out.println("-----Menu-----");
			System.out.println("1.To insert element");
			System.out.println("2.Display");
			System.out.println("3.exit");
			choice = object.checkingInteger(choice);
			switch (choice) {
			case 1:
				System.out.println("Enter element that you want to add");
				item = object.checkingInteger(item);
				object.insertElement(item, lList);
				break;
			
			case 2:
				System.out.println("elements in list are:");
				object.display(lList);
				break;
			
			case 3:
				System.exit(0);
				break;

			
			default:
				System.out.println("Enter correct choice");
				break;
			}
		}
		scanner.close();

	}

}
