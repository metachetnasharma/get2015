package DS8;

import java.util.ArrayList;
import java.util.Iterator;

public class Sort {

	/**
	 * @param input
	 *            array that to be sorted
	 * @param maximum
	 *            value
	 * @return sorted array
	 */
	public int[] countingSort(int array[]) {
		int max = this.maximumValue(array);
		int temp[] = new int[max + 1];
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			temp[array[i]] += 1;
		}
		for (int i = 0; i < temp.length; i++) {
			while (temp[i] != 0) {
				array[count++] = i;
				temp[i]--;
			}

		}
		return array;
	}

	/**
	 * function for bubble sorting
	 * 
	 * @param input
	 *            array that to be sorted
	 * @return sorted array
	 */
	public int[] bubbleSort(int array[]) {
		int size = array.length;
		int temp = 0;
		while (size != 0) {
			for (int i = 0; i < size - 1; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
			size--;
		}
		return array;
	}

	/**
	 * function for radix sorting
	 * 
	 * @param input
	 *            array that to be sorted
	 * @return sorted array
	 */
	public int[] radixSort(int array[]) {
		int temp = 0, i = 0, temp1, n = 0;
		int no_Of_digit = this.noOfDigit(array);
		ArrayList<Integer>[] arraylist = new ArrayList[10];
		for (int j = 0; j < 10; j++) {
			arraylist[j] = new ArrayList<Integer>();
		}

		while (n != no_Of_digit) {
			for (i = 0; i < array.length; i++) {
				temp1 = array[i] / (int) Math.pow(10, n);
				temp = temp1 % 10;
				arraylist[temp].add(array[i]);
			}

			for (int k = 0, j = 0; k < arraylist.length; k++) {
				Iterator iterator = arraylist[k].iterator();
				while (iterator.hasNext()) {
					array[j++] = (int) iterator.next();
				}
				arraylist[k].clear();
			}

			n++;
		}

		return array;

	}

	/**
	 * function to find maximum value in input array
	 * 
	 * @param input
	 *            array that to be sorted
	 * @return maximum value
	 */
	public int maximumValue(int array[]) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	/**
	 * function to find max number of digit
	 * 
	 * @param input
	 *            array that to be sorted
	 * @return number of digits
	 */
	public int noOfDigit(int array[]) {
		int max = this.maximumValue(array);
		int no_Of_Digit = 0;
		while (max != 0) {
			max = max / 10;
			no_Of_Digit++;
		}
		return no_Of_Digit;
	}

	/**
	 * function for Quick sorting
	 * 
	 * @param startIndex
	 * @param endIndex
	 * @param input
	 *            array that to be sorted
	 * @return
	 */
	public int[] quickSort(int startIndex, int endIndex, int[] array) {
		if (startIndex <= array.length - 1 && endIndex >= 0
				&& startIndex < endIndex) {
			int pivotIndex = startIndex;
			int storeIndex = pivotIndex + 1;
			for (int count = pivotIndex + 1; count <= endIndex; count++) {
				if (array[count] < array[pivotIndex]) {
					// swapping
					swap(count, storeIndex, array);
					storeIndex++;
				}
			}
			swap(pivotIndex, storeIndex - 1, array);
			for (int count = 0; count < array.length; count++)
				quickSort(startIndex, storeIndex - 2, array);
			quickSort(storeIndex, endIndex, array);
		}
		return array;
	}

	/**
	 * function to swap numbers
	 * 
	 * @param x
	 *            index
	 * @param y
	 *            index
	 * @param input
	 *            array
	 */
	public void swap(int x, int y, int[] array) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}

}
