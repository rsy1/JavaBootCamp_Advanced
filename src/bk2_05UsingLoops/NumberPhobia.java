package bk2_05UsingLoops;

import java.util.Scanner;

//Illustration : User deciding when to exit the loop.

public class NumberPhobia {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int number = 2;
		String input;
		while (true) {
			System.out.println(number + " ");
			System.out.print("Do you want to keep counting?" + " (Y or N)");
			input = sc.next();
			if (input.equalsIgnoreCase("N")) //Only testing for 'N', any other letters will pass..........
				break;
			number += 2;
		}
		System.out.println("\nWhew! That was close.\n");
	}

}
