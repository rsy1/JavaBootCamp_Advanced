package bk2_05UsingLoops;

//Illustration: The use of the 'break statement' to terminate a loop. 

public class Dodecaphobia {
	public static void main(String[] args) {
		int number = 2;
		while (number <= 20) {
			if (number == 12)
				break;
			System.out.print(number + " ");
			number += 2;
		}
		System.out.println("Done....");
	}
}
