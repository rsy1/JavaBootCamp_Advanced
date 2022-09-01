package bk2_05UsingLoops;

//Illustration: Ascending & descending counting
//		In the initialization expression, you can’t declare variables if you use more
//		than one expression. That’s why I declared the a and b variables before the
// 		for statement in the CountBothWays example.

public class CountBothWays {
	public static void main(String[] args) {
		int a, b;
		for (a = 1, b = 10; a <= 10; a++, b--)
			System.out.println(a + " " + b);
	}
}
