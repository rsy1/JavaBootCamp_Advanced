package bk3_06UsingObjectAndClassClasses;

public class TestEquality1 {
	public static void main(String[] args) {
		Employee1 emp1 = new Employee1("Martinez", "Anthony");
		Employee1 emp2 = new Employee1("Martinez", "Anthony");
		
		//Equality test with (==) operator
		//------------------------------------
		if (emp1 == emp2)
			System.out.println("These employees are the same.");
		else
			System.out.println("These are different employees.");

		//Equality test with equals() method
		//------------------------------------
		if (emp1.equals(emp2))
			System.out.println("These employees are the same.");
		else
			System.out.println("These are different employees.");
	}
}

class Employee1 {
	private String lastName;
	private String firstName;

	public Employee1(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}
	
	//Comparing values in the Objects than comparing object identity....
	//----------------------------------------------------------------------
	public boolean equals(Employee1 emp) {
		if (this.getLastName().equals(emp.getLastName()) && this.getFirstName().equals(emp.getFirstName()))
			return true;
		else
			return false;
	}
}
