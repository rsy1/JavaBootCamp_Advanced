package bk3_06UsingObjectAndClassClasses;

//Illustration: Using clone to create deep copies
//------------------------------------------------
//The main method in the CloneTest2 class creates an Employee object and sets its
//name, salary, and address. Then it creates a clone of this object and prints the data
//contained in both objects. Next, it changes the last name and address of the second
//employee and prints the data again.

//Refer to book for further explanation details. page 336-337

public class CloneTest2 {
	public static void main(String[] args) {
		Employee5 emp1 = new Employee5("Martinez", "Anthony");
		emp1.setSalary(40000.0);
		emp1.address = new Address("1300 N. First Street", "Fresno", "CA", "93702");
		Employee5 emp2 = (Employee5) emp1.clone();
		System.out.println("**** after cloning ****\n");
		printEmployee(emp1);
		printEmployee(emp2);
		emp2.setLastName("Smith");
		emp2.address = new Address("2503 N. 6th Street", "Fresno", "CA", "93722");
		System.out.println("**** after changing emp2 ****\n");
		printEmployee(emp1);
		printEmployee(emp2);
	}

	private static void printEmployee(Employee5 e) {
		System.out.println(e.getFirstName() + " " + e.getLastName());
		System.out.println(e.address.getAddress());
		System.out.println("Salary: " + e.getSalary());
		System.out.println();
	}
}

class Employee5 implements Cloneable {
	private String lastName;
	private String firstName;
	private Double salary;
	public Address address;

	public Employee5(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = new Address();
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Double getSalary() {
		return this.salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Object clone() {
		Employee5 emp;
		try {
			emp = (Employee5) super.clone();
			emp.address = (Address) address.clone();
		} catch (CloneNotSupportedException e) {
			return null; // will never happen
		}
		return emp;
	}

	public String toString() {
		return this.getClass().getName() + "[" + this.firstName + " " + this.lastName + ", " + this.salary + "]";
	}
}

class Address implements Cloneable {
	private String street;
	private String city;
	private String state;
	private String zipCode;

	public Address() {
		this.street = "";
		this.city = "";
		this.state = "";
		this.zipCode = "";
	}

	public Address(String street, String city, String state, String zipCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null; // will never happen
		}
	}

	public String getAddress() {
		return this.street + "\n" + this.city + ", " + this.state + " " + this.zipCode;
	}
}
