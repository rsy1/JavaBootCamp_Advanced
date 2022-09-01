package bk2_08ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetInteger {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		int i = getAnInteger();
		System.out.println("You entered " + i);
	}

	public static int getAnInteger() {
		while (true) {
			try {
				return sc.nextInt();
			} catch (InputMismatchException e) {
				//e.printStackTrace();
				//System.out.println(e.getMessage());
				//System.out.println(e.toString());
				//System.out.println(e.getCause());
				//System.out.println(System.out);
				sc.next();
				System.out.print("That's not " + "an integer. Try again: ");
			}
		}
	}
}


/*The next() method in line 20 must be called in the catch block to dispose of the user’s
invalid input because the nextInt method leaves the input value in the
Scanner’s input stream if an InputMismatchException is thrown. If you omit
the statement that calls next, the while loop keeps reading it, throws an
exception, and displays an error message in an infinite loop. If you don’t
believe me, look at Figure 8-2. I found this error out the hard way. (The only
way to make it stop is to close the console window.)*/