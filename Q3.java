package Assignment_2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		System.out.println("Enter Total Number of students");
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		String[] Email;
		String[] name;
		String[] Address;
		String[] phone;
		String[] status;

		Email = new String[number];
		name = new String[number];
		Address = new String[number];
		phone = new String[number];
		status = new String[number];
		for (int i = 0; i < number; i++) {
			System.out.println("enter email");

			Email[i] = sc.next();

			System.out.println("enter name");
			name[i] = sc.next();
			System.out.println("enter address");

			Address[i] = sc.next();
			System.out.println("enter phone");

			phone[i] = sc.next();
			System.out.println("enter status");

			status[i] = sc.next();

		}

		System.out.println("Please enter which student detail you are looking for");
		int k = sc.nextInt();

		if (sc.match() != null) {
			System.out.println(Email[k]);
			System.out.println(name[k]);
			System.out.println(Address[k]);
			System.out.println(phone[k]);
			System.out.println(status[k]);

		}

	}
}
