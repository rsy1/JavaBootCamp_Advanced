package bk3_06UsingObjectAndClassClasses;

public class TestEquality2 {
	public static void main(String[] args) {
		Employee2 emp1 = new Employee2("Martinez", "Anthony");
		Employee2 emp2 = new Employee2("Martinez", "Anthony");
		if (emp1.equals(emp2))
			System.out.println("These employees are the same.");
		else
			System.out.println("These are different employees.");
	}
}

class Employee2 {
	private String lastName;
	private String firstName;

	public Employee2(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public boolean equals(Object obj) {
// an object must equal itself
		if (this == obj)
			return true;
// no object equals null
		if (this == null)
			return false;
// objects of different types are never equal
		if (this.getClass() != obj.getClass())
			return false;
// cast to an Employee, then compare the fields
		Employee2 emp = (Employee2) obj;
		return this.lastName.equals(emp.getLastName()) && this.firstName.equals(emp.getFirstName());
	}
}

/*
 * →33 Returns true if the same object instances are being compared. This meets
 *     the first equality test: that an object must always be equal to itself. 
 * 
 * →36 Returns false if the object being compared is null. This meets the last
 *     equality test: that nothing is equal to null.. 
 * 
 * →39 Returns false if the object being compared isn’t of the correct type. 
 *     This helps ensure the symmetry test: that if x equals y, y must equal x.
 * 
 * →42 Having slid through the other tests, you can assume that you’re comparing two different Employee objects,
 *     so the next step is to cast the other object to an Employee.
 *  
 * →43 Having cast the other object to an Employee, the two fields (last Name and firstName) are
 *     compared, and the result of the compound comparison is returned.
 */






