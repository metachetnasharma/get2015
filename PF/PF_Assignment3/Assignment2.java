package recursion;

import java.util.Scanner;

/**
 * @author Chetna Sharma
 *
 */
public class Assignment2 {
	int i = -1;

	/**
	 * function for linear searching
	 * @param arr=input array for searching
	 * @param n =searching element
	 */
	public int LinearSearch(int arr[], int n) {
		i++;
		if (i < 10) {
			if (arr[i] == n) {
				return 1;
			} else
				return LinearSearch(arr, n);
		} else
			return 0;
	}

	/**function for binary searching
	 * @param barr=input array for searching
	 * @param n1=searching element
	 * @param max= index of last element
	 * @param min=index of first element
	 */
	public int BinarySearch(int barr[], int n1, int max, int min) {
		int temp = 0;
		int mid = (max + min) / 2;
		if (barr[mid] == n1) // comparison with middle element
			return 1;
		if (min > max) {
			return 0;
		}
		if (barr[mid] > n1) {
			temp = BinarySearch(barr, n1, mid - 1, min);
		} else if (barr[mid] < n1)
			temp = BinarySearch(barr, n1, max, mid + 1);
		return temp;

	}

	public static void main(String args[]) {
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements for linear search");
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter searching element");
		int n = sc.nextInt();
		Assignment2 obj = new Assignment2();
		int element = obj.LinearSearch(a, n);
		if (element == 1) {
			System.out.println("serching element is founded");
		} else {
			System.out.println("serching element is not founded");
		}
		int b[] = new int[10];
		System.out.println("Enter sorted array elements for binary search");
		for (int i = 0; i < 10; i++) {
			b[i] = sc.nextInt();
		}
		System.out.println("Enter binary searching element");
		int n1 = sc.nextInt();
		int max = b.length - 1;
		int min = 0;
		Assignment2 obj1 = new Assignment2();
		int Belement = obj1.BinarySearch(b, n1, max, min);
		if (Belement == 1) {
			System.out.println("serching element is founded");
		} else {
			System.out.println("serching element is not founded");
		}
		sc.close();
	}

}
