package bk2_02VariablesAndDataTypes;

public class UnderstandingScope {
	// -var scope refers to which part of a class the var exist.
	// -every var exist only within the block the var is declared.
	// -Also within any blocks that are contained within that block
	// e.g class & instance var.

	// A block marked by a matching pair of braces marks the scope boundaries for
	// the scope boundaries of vars declared within it.

	static int x; //class var (scope from line 12=>31)
	
	public static void main(String[] args) {
		x = 5;
		System.out.println("main: x = " + x);
		myMethod();
	}

	public static void myMethod() {
		int y;
		y = 10; //var y is local var, init in line 22, scope from 22 to 30 
		if (y == x + 5) //var z is local var declared & init in "if" statement block.
		{               //scope of z starts when init in line 26 to 28
			int z;
			z = 15;
			System.out.println("myMethod: z = " + z);
		}
		System.out.println("myMethod: x = " + x);
		System.out.println("myMethod: y = " + y);
	}
}