package bk3_02MakingOwnClasses;

//Illustration: Using Initializers

import java.util.Scanner;

public class PrimeClass {
	private Scanner sc = new Scanner(System.in);
	public int x;
	{
		System.out.print("Enter the starting value for x: ");
		x = sc.nextInt();
	}
}
