package bk3_06UsingObjectAndClassClasses;

public class CloneTest {
	public static void main(String[] args) {
		Employee3 emp1 = new Employee3("Martinez", "Anthony");
		emp1.setSalary(40000.0);
		Employee3 emp2 = (Employee3) emp1.clone();
		emp1.setLastName("Smith");
		System.out.println(emp1);
		System.out.println(emp2);
	}
}

class Employee3 {
	private String lastName;
	private String firstName;
	private Double salary;

	public Employee3(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
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
		Employee3 emp;
		emp = new Employee3(this.lastName, this.firstName);
		emp.setSalary(this.salary);
		return emp;
	}

	public String toString() {
		return this.getClass().getName() + "[" + this.firstName + " " + this.lastName + ", " + this.salary + "]";
	}
}

/*
 * →48 Overrides the clone method. Notice that its return type is Object, not Employee. 
 * →50 Creates a new Employee object, using the last name and first name from the current object. 
 * →51 Sets the new employee’s salary to the current object’s salary. 
 * →52 Returns the cloned Employee object.
 */

/*
 * Note:: The clone() method defined by the Object class returns an Object type
 * because the Object class doesn’t know the type of the class in which you’ll
 * be overriding the clone method. Whenever you call the clone() method for a
 * class that overrides clone(), you must cast the result to the desired object
 * type.
 */

class Employee4 implements Cloneable {
// Fields and methods omitted...
	public Object clone() {
		Employee4 emp;
		try {
			emp = (Employee4) super.clone();
		} catch (CloneNotSupportedException e) {
			return null; // will never happen
		}
		return emp;
	}
}
/*
 * the clone method manually creates a copy of the original object and returns
 * it.using the clone method of the Object class directly in your own clone
 * method. The clone method of the Object class can automatically create a copy
 * of your object that contains duplicates of all the fields that are primitive
 * types (such as int and double)as well as copies of immutable reference types
 * — most notably, strings. So if all the fields in your class are either
 * primitives or strings, you can use the clone method provided by the Object
 * class to clone your class.
 */




