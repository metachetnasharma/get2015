package DataStructure2;

import java.util.Scanner;

public class MainClassQueue {
	public static void main(String args[]) {
		System.out.println("Enter size of queue");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Queue queue = new Queue(size);
		int choice;
		do {
			System.out.println("enter 1 for enqueue");
			System.out.println("enter 2 for dequeue");
			System.out.println("enter 3 for exit");
			System.out.println("enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter number to be enqueue");
				String data = sc.next();
				queue.enqueue(data);
				System.out.println("Queue after enqueue  is ");
				queue.display();
				break;
			case 2:
				queue.dequeue();
				System.out.println("Queue after dequeue is ");
				queue.display();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Enter correct choice");
			}
		} while (choice != 4);
		sc.close();
	}

}
