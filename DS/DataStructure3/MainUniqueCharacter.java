package DS6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Chetna Sharma
 *
 */
public class MainUniqueCharacter {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		int flag=0;
		try{
		do{
		System.out.println("Enter String");
		String str = scanner.next();
		UniqueCharacterInString object = new UniqueCharacterInString();
		System.out.print(object.findUniqueCharacters(str));
		System.out.print("\nEnter 1 for continue");
		flag=scanner.nextInt();
		} while(flag == 1);
		}
		catch(InputMismatchException e)
		{
			System.out.print("Please enter correct choice");
		}

	}
}
