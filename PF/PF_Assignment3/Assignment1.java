package recursion;

import java.util.Scanner;

//class for assignment1 that includes three function remainder,gcd and largest element
/**
 * @author Chetna Sharma
 *
 */
public class Assignment1 {
	int count = 0;

	
	/**function to find remainder
	 * @param x=dividend
	 * @param y= divisor
	 */
	public int rem(int x, int y)
	{
		if (x >= 0 && y > 0) {
			if (x >= y) {
				int d = x - y;
				return rem(d, y);
			} else
				return x;
		} else
			return -1;
	}

	
	/**
	 * function to find gcd
	 * @param v1=value1
	 * @param v2=value2
	 */
	public int gcd(int v1, int v2) // v1 is for value1 and v2 for value2
	{
		if (v2 > v1) {
			int r = v2 % v1;
			if (r == 0)
				return v1;
			return gcd(r, v1);
		} else {
			int r = v1 % v2;
			if (r == 0)
				return v2;
			return gcd(r, v2);
		}
	}

	/**
	 * @param digit=input value
	 */
	public int largestDigit(int digit) {

		int temp;
		if (digit != 0) {
			temp = digit % 10;
			if (count < temp) {
				count = temp; // for swapping
			}
			return largestDigit(digit / 10);
		}
		return count;
	}

	public static void main(String args[]) {
		int dividend, divisor;
		int value1, value2;
		int digit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dividend");
		dividend = sc.nextInt();
		System.out.println("Enter divisor");
		divisor = sc.nextInt();
		int remainder = 0;
		Assignment1 obj = new Assignment1();
		remainder = obj.rem(dividend, divisor);
		System.out.println("remainder is" + remainder);
		System.out.println("Enter value1");
		value1 = sc.nextInt();
		System.out.println("Enter value2");
		value2 = sc.nextInt();
		int gcdValue = 0;
		gcdValue = obj.gcd(value1, value2);
		System.out.println("gcd of two values is" + gcdValue);
		System.out.println("Enter digit");
		digit = sc.nextInt();
		int largestdigit = 0;
		largestdigit = obj.largestDigit(digit);
		System.out.println("largest digit of is" + largestdigit);
		sc.close();
	}

}
