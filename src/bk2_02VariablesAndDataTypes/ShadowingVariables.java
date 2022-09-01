package bk2_02VariablesAndDataTypes;

public class ShadowingVariables {
	// shadowing is a common source of errors, must be avoided as much as possible
	
	static int x; //scope is whole class, line 6 to 16
	
	public static void main(String[] args) {
		x = 5;//assigned value 5
		System.out.println("x = " + x);//class var x with value 5 printed to console, not yet shadowed
		int x; //local var x declared, SHADOWS class var x, all reference to var x NOW referes to local var rather than class var. 
		x = 10; //loca var x initialized, comes into scope until method ends @ line 15  
		System.out.println("x = " + x);//println statement in line 13 prints the value of the local variable x which is 10
		System.out.println("ShadowingVariables.x = " + ShadowingVariables.x);//while "class var x" is shadowed, access it by specifying the class name 
	}//when main method ends here, class var x is no longer SHADOWED.......
}//The shadowing begins when the local variable is declared,local variable’s scope doesn’t begin until the variable is initialized.