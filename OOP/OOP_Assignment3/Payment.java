package reservation;

import java.util.Scanner;

public class Payment {
	Scanner sc = new Scanner(System.in);

	public void creditCard() {
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your credit card number");
		int ccNo = sc.nextInt();
		System.out.println("Enter your cvv number");
		int cvv = sc.nextInt();
		System.out.println(name + "your payment through credit card number"
				+ ccNo + "has been successfully done");
	}

	public void wallet() {
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter payable amount");
		int amount = sc.nextInt();
		System.out.println(name + "your payment of payable amount " + amount
				+ "has been successfully done");

	}

	public void netBanking() {
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter password");
		int pwd = sc.nextInt();
		System.out.println("Enter name of bank");
		String bName = sc.next();
		System.out.println(name + "your payment has been successfully done");
	}

}
