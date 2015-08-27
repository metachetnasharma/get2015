package DataStructure2;

import java.util.Scanner;

/**
 * @author Chetna
 *
 */
public class MainClass {

	public static void main(String[] args) {
		InfixToPostfix infixToPostfix = new InfixToPostfix();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Infix : ");
		String infix = scanner.next();
		System.out.println("Postfix : "
				+ infixToPostfix.convertToPostfix(infix));
		scanner.close();
	}

}
