package bk2_03NumbersAndExpressions;

//Ilustration of the Rounding function
//-:Rounding Methods of the Math Class

public class RoundingApp {	
	
	//The Math class has four methods that round or truncate float or double values.

	public static void main(String[] args) {
		double x = 29.5;
		double y = 93.5;
		double z = -19.3;
		
		//Returns the integer that is closest to the argument. If the argument is a double, it returns a long. If the argument is a float, it returns an int.
		System.out.println("round(x) = " + Math.round(x));
		System.out.println("round(y) = " + Math.round(y));
		System.out.println("round(z) = " + Math.round(z));
		System.out.println();
		
		//Returns the smallest double value that is an integer and is greater than or equal to the value of the argument.
		System.out.println("ceil(x) = " + Math.ceil(x));
		System.out.println("ceil(y) = " + Math.ceil(y));
		System.out.println("ceil(z) = " + Math.ceil(z));
		System.out.println();
		
		//Returns the largest double value that is an integer and is less than or equal to the Svalue of the argument.
		System.out.println("floor(x) = " + Math.floor(x));
		System.out.println("floor(y) = " + Math.floor(y));
		System.out.println("floor(z) = " + Math.floor(z));
		System.out.println();
		
		//Returns the double value that is an integer and is closest to the value of the argument. If two integer values are equally close, 
		//it returns the one that is even. If the argument is already an integer, it returns the argument value.
		System.out.println("rint(x) = " + Math.rint(x));
		System.out.println("rint(y) = " + Math.rint(y));
		System.out.println("rint(z) = " + Math.rint(z));
	}
}
