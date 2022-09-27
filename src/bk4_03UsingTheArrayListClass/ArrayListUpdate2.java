package bk4_03UsingTheArrayListClass;

//Ilustration : Updating an ArrayList
//Because array lists contain references to objects, not the objects themselves, any
//changes made to an object in an array list are automatically reflected in the list.

import java.util.ArrayList;

public class ArrayListUpdate2 {
	public static void main(String[] args) {
		ArrayList<Employee> emps = new ArrayList<Employee>();
		// add employees to array list
		emps.add(new Employee("Addams", "Gomez"));
		emps.add(new Employee("Taylor", "Andy"));
		emps.add(new Employee("Kirk", "James"));
		// print array list
		System.out.println(emps.toString());
		// change one of the employee's names
		Employee e = emps.get(1);
		e.changeName("Petrie", "Robert");
		// print the array list again
		System.out.println(emps.toString());

	}
}

class Employee {

	private String fName;
	private String sName;

	Employee(String fName, String sName) {
		this.fName = fName;
		this.sName = sName;
	}

	private void setfName(String fName) {
		this.fName = fName;
	}

	private void setsName(String sName) {
		this.sName = sName;
	}
	
	public void changeName(String fName, String sName) {
		this.setfName(fName);
		this.setsName(sName);
	}
	
	public String toString() {
		return this.fName + "  " + sName;
	}
}

/*
 * Notice that the second employee’s name was changed, even though the program
 * doesn’t use the set method to replace the changed Employee object in the
 * collection. That’s because the array list merely stores references to the
 * Employee objects
 */