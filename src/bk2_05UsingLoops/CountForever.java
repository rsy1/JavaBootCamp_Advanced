package bk2_05UsingLoops;

//Illustration : Infinite Loop

public class CountForever {
	public static void main(String[] args) {
		int number = 2;
		while (true) {
			System.out.println(number + " ");
			number += 2;
		}
	}
}
