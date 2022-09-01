package bk2_02VariablesAndDataTypes;

public class DeclaringVariables {

	static String classVariable;
	
	String instanceVariable;

	public static void main(String[] args) {
		DeclaringVariables var = new DeclaringVariables();
		var.declaringTwoOrMoreVariables();
		var.declaringClassVariables();
		var.declaringInstaceVariables();
		var.declaringLocalVariables();
	}

	private void declaringTwoOrMoreVariables() {
		//==:not recommended because of poor readability
		int x, y, z;
	}

	private void declaringClassVariables() {
		//==:declared within body of the class, not method
		//==: any method in the class can access the variable including static methods
		//==:rules 1.declaration is done within the class body, not any method.
		//       2.Must include the word static in the declaration

		classVariable = "Hellow World===>";
		System.out.println(classVariable);
	}

	private void declaringInstaceVariables() {
		//==:same as class var, but does not specify static
		//==:associated with class instances, used only at instance creation
		//==:can not use instance var in a static method including main.
		
		instanceVariable = "Best Greetings............>>>>";
		System.out.println(instanceVariable);
	}
	
	private void declaringLocalVariables() {
		//==:declared within body of a method
		//==:used only within the method its declared, not visible to other methods
		//==:can not be declared static & must be declared first bz

		String localVariable;
		localVariable = "Hello, World out there......";
		System.out.println(localVariable);
	}
}
