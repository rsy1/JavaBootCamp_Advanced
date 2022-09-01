package bk2_05UsingLoops;

//Iustration : Continue statement (gentler version of break statement)
//continue statement sends control right back to the top of the loop, where the expression is immediately evaluated again.

public class Dodecaphobia3 {
	public static void main(String[] args) {
		int number = 0;
		while (number < 20) {
			number += 2;
			if (number == 12)
				continue;
			System.out.print(number + " ");
		}
		System.out.println();
	}

}
