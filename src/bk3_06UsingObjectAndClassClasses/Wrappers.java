package bk3_06UsingObjectAndClassClasses;

public class Wrappers {
	public static void main(String[] args) {
		int x = 50;
		//using concatination to create an object from a primitive
		String s = "" + x;
		System.out.println("String value : " + s.toString());
		
		//using wrapper class to create an integer object
		String y = Integer.valueOf(x).toString();		
		System.out.println("String value : " + y);
	}

}
