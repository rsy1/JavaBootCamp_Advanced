package bk2_03NumbersAndExpressions;
//Illustaration
//-:Working with arithmatic operations
//-:addition,subtraction,multiplication,division,remainder(modulus),Increment,decrement
//-:dividing Integers (5/4=1, 3/4=0) or (5/4=1.25, 3/4=0.75)use float or double

import java.util.Scanner;

public class MarblesApp {
	static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
// declarations →9
		int numberOfMarbles;
		int numberOfChildren;
		int marblesPerChild;
		int marblesLeftOver;
// get the input data →15
		System.out.println("Welcome to the marble divvy-upper.");
		System.out.print("Number of marbles: ");
		numberOfMarbles = sc.nextInt();
		System.out.print("Number of children: ");
		numberOfChildren = sc.nextInt();
// calculate the results
		marblesPerChild = numberOfMarbles / numberOfChildren;
		marblesLeftOver = numberOfMarbles % numberOfChildren;
// print the results →26
		System.out.println("Give each child " + marblesPerChild + " marbles.");
		System.out.println("You will have " + marblesLeftOver + " marbles left over.");
	}
}