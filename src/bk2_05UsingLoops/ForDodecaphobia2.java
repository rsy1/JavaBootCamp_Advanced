package bk2_05UsingLoops;
//Illustration: Using continue statement in a for loop

public class ForDodecaphobia2 {

	public ForDodecaphobia2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		for (int number = 2; number <= 20; number += 2) {
			if (number == 12)
				continue;
			System.out.print(number + " ");
		}
		System.out.println();
	}
}
