package DS5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * a program which create a concordance of characters occurring in a string (i.e
 * which characters occur where in a string). Read the string from the command
 * line
 * 
 * @author Chetna Sharma
 *
 */
public class ConcordanceString {

	public static void main(String args[]) {
		String string[] = { "hello", "world" };
		String stringWithoutSpace = "";

		for (int i = 0; i < string.length; i++) {
			stringWithoutSpace += string[i]; // string array to string
												// conversion
		}
		System.out.println(stringWithoutSpace);
		char charArrayOfString[] = stringWithoutSpace.toCharArray();
		Set<Character> set = new HashSet<Character>(); // hashset to store
														// letters

		for (int i = 0; i < charArrayOfString.length; i++) {
			set.add(charArrayOfString[i]);
		}
		Object[] newArray = set.toArray();

		for (int i = 0; i < set.size(); i++) {
			System.out.print(newArray[i] + "=");
			List<Integer> list = new ArrayList<Integer>();
			char c = (Character) newArray[i];

			for (int j = 0; j < charArrayOfString.length; j++) {
				if (c == charArrayOfString[j]) {
					list.add(j);
				}
			}
			System.out.print(list + "\n");

		}

	}

}
