package bk2_08ExceptionHandling;

//Illustration: Exception try catch block

public class DivideByZero {
	public static void main(String[] args) {
		int a = 5;
		int b = 0; // you know this won't work
		try {
			int c = a / b; // but you try it anyway
		} catch (ArithmeticException e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			//System.out.println(e.getCause());
			System.out.println("Oops, you can't " + "divide by zero.");
		}
	}
}
