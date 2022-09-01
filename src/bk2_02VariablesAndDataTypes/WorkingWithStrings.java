package bk2_02VariablesAndDataTypes;

public class WorkingWithStrings {
	String instanceVariable;
	static String classVariable;

	public static void main(String[] args) {
		WorkingWithStrings wString = new WorkingWithStrings();

		wString.declaringAndInitializingStrings();
		wString.combiningString();
		wString.convertingStringsToPrimitives();
		wString.convertingPrimitivesToString();
	}

	private void declaringAndInitializingStrings() {
		String s;
		s = "Hello, World";

		// String declaration can include initializer
		String s1 = "Hello, World";

		// String class variable are initialized to empty string by default
		classVariable = "Hellow World===>";
		System.out.println(classVariable);

		// String instance variable are initialized to empty string by default
		instanceVariable = "Best Greetings............>>>>";
		System.out.println(instanceVariable);

		// local string variables must be initialized to ""
		String localVariable = "";

	}

	private void combiningString() {
		// plus sign is used to concatenate/combine two strings
		// if space need between combined strings, first string must end with the space
		// or second string begins with a space.

		String hello = "Hello, ";
		String world = "World!";
		String greeting = hello + world;
		System.out.println(greeting);

		// you can concatenate a string literal along with the string variables
		String hello1 = "Hello";
		String world1 = "World!";
		String greeting1 = hello1 + ", beutifull " + world1;
		System.out.println(greeting1);
	}

	private void convertingStringsToPrimitives() {
		// Use a parse() method of the appropriate wrapper class for each primitive
		// In real world, use it to convert string values entered by the user to
		// primitive types.

		// int
		String s = "100";
		int x = Integer.parseInt(s);
		System.out.println("String to int: ==> " + x);

		// short
		String s1 = "100";
		short x1 = Short.parseShort(s1);
		System.out.println("String to short: ==> " + x1);

		// long
		String s2 = "120";
		long x2 = Long.parseLong(s2);
		System.out.println("String to long: ==> " + x2);

		// byte
		String s3 = "78";
		byte x3 = Byte.parseByte(s3);
		System.out.println("String to byte: ==> " + x3);

		// float
		String s4 = "19.95";
		float x4 = Float.parseFloat(s4);
		System.out.println("String to float: ==> " + x4);

		// double
		String s5 = "176.89";
		double x5 = Double.parseDouble(s5);
		System.out.println("String to double: ==> " + x5);

		// boolean
		String s6 = "false";
		boolean x6 = Boolean.parseBoolean(s6);
		System.out.println("String to boolean: ==> " + x6);

		// Character
		// don’t need a parse method to convert a String to a Character
	}

	private void convertingPrimitivesToString() {
		int val1 = 5;
		char val2 = 'z';
		float val3 = 9.56F;
		double val4 = 8.34D;

		String str1 = String.valueOf(val1);
		String str2 = String.valueOf(val2);
		String str3 = String.valueOf(val3);
		String str4 = String.valueOf(val4);

		System.out.println("\nConverted primitive types to string...");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}
