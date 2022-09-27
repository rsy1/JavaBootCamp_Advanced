package bk5_03Recursion;

import java.text.NumberFormat;

public class Factorials {

	public static void main(String[] args) {
		int n = 5;
		//long factorial = factorial(n);
		
		long rfactorial = recursiveFactorial(n);

		System.out.println("Factorial value of " + n + " : " + NumberFormat.getInstance().format(rfactorial));

	}

	private static long factorial(int n) {
		long f = 1;
		for (int i = 1; i <= n; i++) {
			f = f * i;
			System.out.println(i);
			System.out.println("The product >>: " + f);
		}
		return f;
	}

	private static long recursiveFactorial(int n) {
		if (n == 1)
			return 1;
		else
			return n * recursiveFactorial(n - 1);
	}
}
