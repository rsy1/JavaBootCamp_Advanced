package bk2_05UsingLoops;

//Illustration: Using break statement in a for loop & terminate

public class ForDodecaphobia {

	public ForDodecaphobia() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		for (int number = 2; number <= 20; number += 2) {
			if (number == 12)
				break;
			System.out.print(number + " ");
		}
		System.out.println();
	}

}
