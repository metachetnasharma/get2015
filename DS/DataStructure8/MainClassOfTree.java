package DS8;

import java.util.Scanner;

/**
 * @author Chetna Sharma
 *
 */
public class MainClassOfTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfStudent = 0, rollNo = 0;
		AscendingSeriesUsingTreeSort treeSort = new AscendingSeriesUsingTreeSort();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of students");
		numberOfStudent = scanner.nextInt();

		do {
			System.out.println("Enter roll no. of number of students");
			rollNo = scanner.nextInt();
			treeSort.insert(rollNo);
			numberOfStudent--;
		} while (numberOfStudent != 0);

		System.out
				.println(" roll numbers of n students in  ascending series : ");
		treeSort.inorderTraversal();
		scanner.close();

	}

}
