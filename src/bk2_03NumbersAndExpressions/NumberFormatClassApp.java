package bk2_03NumbersAndExpressions;

//Illustration of Formatting Numbers
//-: Returns a string that contains the formatted number

import java.text.NumberFormat;

public class NumberFormatClassApp {
	static NumberFormat cf = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {
		printMyAllowance();
		printCostOfPaintBallGun();
	}

	public static void printMyAllowance() {
		double myAllowance = 5.00;
		cf = NumberFormat.getCurrencyInstance();
		System.out.println("My allowance: " + cf.format(myAllowance));
	}

	public static void printCostOfPaintBallGun() {
		double costOfPaintBallGun = 69.95;
		cf = NumberFormat.getCurrencyInstance();
		System.out.println("Cost of Paint Ball Gun: " + cf.format(costOfPaintBallGun));
	}
}

//Methods of the NumberFormat Class
//======================================
/*
 * getCurrencyInstance() A static method that returns a NumberFormat object that
 * formats currency values
 * 
 * getPercentInstance() A static method that returns a NumberFormat object that
 * formats percentages
 * 
 * getNumberInstance() A static method that returns a NumberFormat object that
 * formats basic numbers
 * 
 * setMinimumFractionDigits(int) Sets the minimum number of digits to display to
 * the right of the decimal point
 * 
 * setMaximumFractionDigits(int) Sets the maximum number of digits to display to
 * the right of the decimal point
 */
