package bk4_05CreatingGenericCollectionClasses;

import java.util.LinkedList;

///The class declaration specifies the formal type parameter <E>. Thus users of this class can specify the type for the stack’s elements.
public class GenStack<E> {  
	
	//This class uses a private LinkedList object list to keep the items stored in the stack. The LinkedList is declared with the same type as the
	//GenStack class itself. Thus, if the E type parameter is Employee, the type
	private LinkedList<E> list = new LinkedList<E>();

	//The push method accepts a parameter of type E. It uses the linked list’s addFirst method to add the item to the beginning of the list.
	public void push(E item) {
		list.addFirst(item);
	}

	//The pop method returns a value of type E. It uses the linked list’s poll method, which removes and returns the first element in the linked list.
	//If the list is empty, the poll method — and therefore the pop method — returns null.
	public E pop() {
		return list.poll();
	}

	//The peek method also returns a value of type E. It simply returns the result of the linked list’s peek method.
	public E peek() {
		return list.peek();
	}

	//The hasItems method returns the opposite of the linked list’s isEmpty method.
	public boolean hasItems() {
		return !list.isEmpty();
	}

	//The size method simply returns the result of the linked list’s size method.
	public int size() {
		return list.size();
	}
}
