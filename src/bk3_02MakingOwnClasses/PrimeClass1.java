package bk3_02MakingOwnClasses;

//Illustration: Using Initializers

import java.util.Scanner;

public class PrimeClass1 {
	private Scanner sc = new Scanner(System.in);
	public int x = getX();

	private int getX() {
		System.out.print("Enter the starting value " + "for x: ");
		return sc.nextInt();
	}
}
