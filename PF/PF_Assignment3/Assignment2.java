package PF_Assignment4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/** a program to print permutation of string
 * @author chetna
 *
 */
public class Assignment2 {
	static List<String> result = new ArrayList();

	public static void main(String[] args) {
		Assignment2 permutation = new Assignment2();
		result = new ArrayList<String>();
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		result = permutation.generatePermutations("", str);
		Iterator<String> itr = result.iterator();// getting Iterator from
													// arraylist to traverse
													// elements
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		sc.close();

	}

	/**
	 * @param prefix 
	 * @param input is string input
	 * @return a list to print permutation
	 */
	List<String> generatePermutations(String prefix, String input) {
		int n = input.length();
		if (n == 0)
			result.add(prefix);
		else {
			for (int i = 0; i < n; i++)
				generatePermutations(prefix + input.charAt(i),
						input.substring(0, i) + input.substring(i + 1, n));
		}
		return result;

	}
}
