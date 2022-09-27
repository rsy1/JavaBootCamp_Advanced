package bk4_05CreatingGenericCollectionClasses;

public class GenQueueTest {
	public static void main(String[] args) {
		GenQueue<Employee> empList;
		empList = new GenQueue<Employee>();
		GenQueue<HourlyEmployee> hList;
		hList = new GenQueue<HourlyEmployee>();
		hList.enqueue(new HourlyEmployee("Trump", "Donald"));
		hList.enqueue(new HourlyEmployee("Gates", "Bill"));
		hList.enqueue(new HourlyEmployee("Forbes", "Steve"));
		empList.addItems(hList);
		while (empList.hasItems()) {
			Employee emp = empList.dequeue();
			System.out.println(emp.firstName + " " + emp.lastName);
		}
	}
}

class Employee {
	public String lastName;
	public String firstName;

	public Employee() {
	}

	public Employee(String last, String first) {
		this.lastName = last;
		this.firstName = first;
	}

	public String toString() {
		return firstName + " " + lastName;
	}
}

class HourlyEmployee extends Employee {
	public double hourlyRate;

	public HourlyEmployee(String last, String first) {
		super(last, first);
	}
}

/*
 * This program begins by creating a GenQueue object that can hold Employee
 * objects. This queue is assigned to a variable named empList. Next, the
 * program creates another GenQueue object. This one can hold HourlyEmployee
 * objects (HourlyEmployee is a subclass of Employee) and is assigned to a
 * variable named hList. Then three rookie employees are created and added to
 * the hList queue. The addItems method of the empList queue is then called to
 * transfer these employees from the hList queue to the empList queue. Because
 * HourlyEmployee is a subclass of Employee, the addItems method of the empList
 * queue accepts hList as a parameter. Finally, a while loop is used to print
 * the employees that are now in the empList queue.
 * 
 * Thus the addItems method successfully transferred the employees from the hlist
 * queue, which held HourlyEmployee objects, to the empList queue, which holds
 * Employee objects.
 */


