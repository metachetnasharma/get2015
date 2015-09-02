package DS7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Chetna Sharma
 *
 */
public class MainBinaryClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 0, max = 0, min = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		size = scanner.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter array element");
			array[i] = scanner.nextInt();
		}
		Arrays.sort(array);
		max = size - 1;
		System.out.println("Enter searching element");
		int searchingElement = scanner.nextInt();
		BinarySearch object = new BinarySearch();
		
		int result=object.binarySearch(searchingElement,0,max,array);
		if(result==-1)
		{
			System.out.println("searching element doesn't found");
		
		}else {
			System.out.println("searching element Left occurrence is: "+object.leftOccurrenceOfElement(searchingElement, result, array));
		}
		scanner.close();

	}

}
