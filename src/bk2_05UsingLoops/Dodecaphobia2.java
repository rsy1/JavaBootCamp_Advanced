package bk2_05UsingLoops;

//Illustration : How to break an infinite loop.
// -: use a break statement.

public class Dodecaphobia2 {
	public static void main(String[] args) {
		int number = 2;
		while (true) {
			if (number == 12)
				break;
			System.out.print(number + " ");
			number += 2;
		}
		System.out.println("Done.....");
	}
}
