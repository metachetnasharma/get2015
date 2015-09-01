package DS4;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * 
 * @author Chetna Sharma Description: This class contains function to allot
 *         noOfRooms and main function
 */
public class MainClassForAllocatingRooms {

	static Guests guest = new Guests();
	static Scanner sc;
	static Hashtable<Integer, String> hTable = new Hashtable<Integer, String>();

	/**
	 * main function
	 */
	public static void main(String args[]) {
		int noGuests = 0;
		int noOfRooms = 0;
		sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter no of noOfRooms:");
			noOfRooms = sc.nextInt();
			if (!checkPrime(noOfRooms)) {
				System.out.println("Enter a prime no.:");
				continue;
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("Enter no of guests:");
			noGuests = sc.nextInt();
			if (noOfRooms < noGuests) {
				System.out
						.println("enter no of guests less than no of noOfRooms.");
				continue;
			} else {
				break;
			}
		}

		String guestsNames[] = new String[noGuests]; //array of guest names
		int age[] = new int[noGuests]; //array of guest age
		guest.setNoOfGuests(noGuests);
		for (int i = 0; i < guest.getNoOfGuests(); i++) {
			System.out.println("Enter name of guest:");
			guestsNames[i] = sc.next();
			System.out.println("Enter age:");
			age[i] = sc.nextInt();
		}

		guest.setGuestsNames(guestsNames);
		guest.setAge(age);

		guest.display();

		roomAllotment(noOfRooms);
		System.out.println("Room Allotment is:");
		System.out.println(hTable);

	}

	/**
	 * function to check whether given no n is prime or nor
	 */
	static public boolean checkPrime(int n) {
		for (int i = 2; i < n / 2; i++) {
			for (int j = 2; j <= i; j++) {
				if (n % j == 0) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * function to allot noOfRooms to guests according to their age
	 * 
	 * @param noOfRooms
	 *            : no of noOfRooms
	 */
	static public void roomAllotment(int noOfRooms) {
		for (int i = 0; i < guest.noOfGuests; i++) {
			int roomNo = guest.getAge()[i] % noOfRooms;
			if (roomNo == 0) {
				roomNo++;
				if (roomNo > noOfRooms) {
					roomNo = 1;
				}
			}
			while (hTable.containsKey(roomNo)) {
				roomNo++;
				if (roomNo > noOfRooms) {
					roomNo = 1;
				}
			}
			hTable.put(roomNo, guest.getGuestsNames()[i]);
		}
	}

}
