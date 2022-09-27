package bk4_05CreatingGenericCollectionClasses;

public class GenStackTest {
	public static void main(String[] args) {
		GenStack<String> gs = new GenStack<String>();
		System.out.println("Pushing four items onto the stack.");
		gs.push("One");
		gs.push("Two");
		gs.push("Three");
		gs.push("Four");
		System.out.println("There are " + gs.size() + " items in the stack.\n");
		System.out.println("The top item is: " + gs.peek() + "\n");
		System.out.println("There are still " + gs.size() + " items in the stack.\n");
		System.out.println("Popping everything:");
		while (gs.hasItems())
			System.out.println(gs.pop());
		System.out.println("There are now " + gs.size() + " items in the stack.\n");
		System.out.println("The top item is: " + gs.peek() + "\n");
	}
}

/*Noticethat when the program pops the items off the stack, they come out in
reverse order in which they were pushed onto the stack. That’s normal behavior
for stacks. In fact, stacks are sometimes called Last-In, First-Out lists, or LIFO lists, for this very reason.*/