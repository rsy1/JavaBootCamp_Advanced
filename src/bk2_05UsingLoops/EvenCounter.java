package bk2_05UsingLoops;

//Illustration : continue looping while some condition is still true.
//             : Exit the loop when condition is now false.

public class EvenCounter {
	public static void main(String[] args) {
		int number = 2;
		while (number <= 20) {
			System.out.print(number + " ");
			number += 2;
		}
		System.out.println("Done");
	}
}
