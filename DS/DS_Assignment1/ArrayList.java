package DS1;

import java.util.Arrays;

public class ArrayList {
	Object myArray[];
	private int size = 0;

	public ArrayList() {
		myArray = new Object[10];
	}

	public ArrayList(int capacity) {
		myArray = new Object[capacity];
	}

	/*Adding an item into array list and check if list is full, then resizing
	 that arraylist*/

	public Object[] addElement(Object item) {

		if (size < myArray.length) {
			myArray[size] = item;
			size++;
		} else {
			Object newArray[] = Arrays.copyOf(myArray, size + 5);
			newArray[size] = item;
			size++;
			myArray = newArray;
		}

		return myArray;

	}

	// Adding an item into array list at the given particular location i
	public Object[] addElementAtPosition(int index, Object item) {
		for (int i = size; i > index; i--) {
			myArray[i] = myArray[i - 1];
		}
		myArray[index] = item;
		size++;
		return myArray;
	}

	// Retrieving the first index of particular item in the arraylist
	public int retrievingPosition(Object obj) {
		for (int i = 0; i < size; i++) {
			if (myArray[i] == obj) {
				return i;
			}
		}
		return -1;
	}

	// Retrieving the first occurrence of an item based on its given location
	public int retrievingPositionBasedOnLocation(Object obj, int position) {
		for (int i = position; i < size; i++) {
			if (myArray[i] == obj) {
				return i;
			}
		}
		return -1;
	}

	// Removing an item based on particular location
	public Object[] removeAtIndex(int index) {
		for (int i = index; i < size; i++) {
			myArray[i] = myArray[i + 1];
		}
		size--;
		return myArray;
	}

	// Remove given particular item from the arraylist
	public Object[] removeItem(Object item) {
		for (int i = 0; i < size; i++) {
			if (myArray[i] == item) {
				for (int j = i; j < size - 1; j++) {
					myArray[j] = myArray[j + 1];
				}
			}
		}
		size--;
		return myArray;
	}

	// to display list
	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(myArray[i]);
		}
	}

	// Reverse the arraylist
	public Object[] reverseArrayList() {
		for (int i = 0; i < size / 2; i++) {
			Object temp = myArray[i];
			myArray[i] = myArray[size - 1 - i];
			myArray[size - 1 - i] = temp;
		}
		return myArray;
	}

	public void clearList() {
		for (int i = 0; i < size; i++) {
			myArray[i] = null;
		}
		size = 0;
	}

	//to return size
	public int size() {
		return size;
	}

	//add another list list2 to the first list.
	public Object[] addList(ArrayList list1, ArrayList list2) {
		int newSize = list1.size() + list2.size();
		Object newElement[] = myArray;
		myArray = new Object[newSize];
		for (int i = 0, k = 0; i < newSize; i++) {
			if (i < list1.size()) {
				list1.myArray[i] = newElement[i];
			} else {
				list1.myArray[i] = list2.myArray[k++];
			}
		}
		size = newSize;
		return list1.myArray;
	}
}
