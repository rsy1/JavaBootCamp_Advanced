package bk3_06UsingObjectAndClassClasses;

//Illustration : Using the object toString() method without overiding.

public class TestToString {
	public static void main(String[] args) {
		Employee emp = new Employee("Martinez", "Anthony");		
		System.out.println(emp.toString());
	}
}

class Employee {

	private String lastName;
	private String firstName;
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Employee(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
}
