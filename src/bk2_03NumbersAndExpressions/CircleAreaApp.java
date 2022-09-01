package bk2_03NumbersAndExpressions;

//Illustration the Maths class functions
//-:Use of the only two mathematical constants of the Maths Class
//-:'PI' The constant pi (π), the ratio of a circle’s radius and diameter 3.141592653589793
//-:'E' The base of natural logarithms 2.718281828459045

import java.util.Scanner;

public class CircleAreaApp {
	static Scanner sc = new Scanner(System.in);
	
	private int age;
	
	public static void main(String[] args) {
		System.out.println("Welcome to the circle area calculator.");
		System.out.print("Enter the radius of your circle: ");
		double r = sc.nextDouble();
		double area = Math.PI * (r * r);
		System.out.println("The area is " + area);
	}
}
