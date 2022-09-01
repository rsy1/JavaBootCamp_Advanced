package bk2_05UsingLoops;

//Illustration: Omitting the initialization expression

import java.util.Scanner;

public class LoopOmitingExpression {

	public LoopOmitingExpression() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Where should I start? ");
		int a = sc.nextInt();
		for (; a >= 0; a--) //initialization omited
			System.out.println(a);
	}
	
	/*public static void main(String[] args) {
		for(;;)
			System.out.println("Oops");
	}*/

}
