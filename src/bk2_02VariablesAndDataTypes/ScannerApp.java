package bk2_02VariablesAndDataTypes;

import java.util.Scanner;

public class ScannerApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		int x = sc.nextInt();
		System.out.println("You entered " + x + ".");
	}
}
/*Method Explanation
boolean nextBoolean() Reads a boolean value from the user.
byte nextByte() Reads a byte value from the user.
double nextDouble() Reads a double value from the user.
float nextFloat() Reads a float value from the user.
int nextInt() Reads an int value from the user.
String nextLine() Reads a String value from the user.
long nextLong() Reads a long value from the user.
short nextShort() Reads a short value from the user.*/