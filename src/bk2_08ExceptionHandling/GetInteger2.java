package bk2_08ExceptionHandling;

//Illustration: Handling Exceptions with a Preemptive Strike
//No need for try/catch block because of validation

import java.util.Scanner;

public class GetInteger2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		int i = GetAnInteger();
		System.out.println("You entered " + i);
	}

	public static int GetAnInteger() {
		while (!sc.hasNextInt()) { //int validation (hasNextInt method of the Scanner checks whether the next value is an integer)
			sc.nextLine();
			System.out.print("That's not " + "an integer. Try again: ");
		}
		return sc.nextInt();
	}
}
