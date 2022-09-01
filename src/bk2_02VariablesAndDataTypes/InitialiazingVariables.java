package bk2_02VariablesAndDataTypes;

public class InitialiazingVariables {
	//Initializing Variables
	//=======================
	//==:You don't have to assign initial values to class & instance variables, they get default values
	//==:Numerics are initialized to zero, String types to empty string..
		
	public static void main(String[] args) {
		
		InitialiazingVariables var = new InitialiazingVariables();
		
		var.initializeVariablesWithAssignmentsStatements();
		
		var.initializeVariablesWithInitializers();
	}
	
	private void initializeVariablesWithAssignmentsStatements() {
		//==:must initialize local variables b4 using them
		int i;
		i = 0;
		System.out.println("i is ... " + i);
	}
	
	private void initializeVariablesWithInitializers() {
		//==:Can initialize variables with initializers
		int x = 0;
		String lastName = "Lowe";
		double radius = 15.4;
		
		//declare more than one variable in a single statement, each variable can have its own initializer
		//initialializer does not apply to both variables.
		int f, y = 5, z = 10;
	}
}
