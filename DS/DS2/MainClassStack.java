package DataStructure2;

import java.util.Scanner;

/** Main class for stack
 * @author Chetna
 *
 */
public class MainClassStack {
	
		public static void main(String[] args) {
			Stack stack = new Stack();
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
		System.out.println("enter 1 for push in stack");
		System.out.println("enter 2 for pop in stack");
		System.out.println("enter 3 for display in stack");
		System.out.println("enter 4 for exit");
		System.out.println("enter your choice");
		choice = sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("enter number to be pushed");
				int data = sc.nextInt();
				stack.push(data);
				System.out.println("Stack after pushing  is ");
				stack.display();
				break;
			case 2:	
				stack.pop();
				System.out.println("Stack after poping is ");
				stack.display();
				break;
			case 3:
				System.out.println("Stack elements are");
				stack.display();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Enter correct choice");
			}
		}while(choice != 4);
		sc.close();
		}

	}


