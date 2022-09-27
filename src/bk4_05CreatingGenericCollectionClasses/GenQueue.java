package bk4_05CreatingGenericCollectionClasses;

import java.util.*;

//The class declaration specifies the formal type parameter <E>. Thus, users of this class can specify the type for the elements of the queue.
public class GenQueue<E> {
	
	//This class uses a private LinkedList object list to keep its items.
	private LinkedList<E> list = new LinkedList<E>();

	//The enqueue method accepts a parameter of type E. It uses the linked list’s addLast method to add the item to the end of the queue.
	public void enqueue(E item) {
		list.addLast(item);
	}
	
	//The dequeue method returns a value of type E. Like the pop method of 	the GenStack class, this method uses the linked list’s poll method to return the first item in the list.
	public E dequeue() {
		return list.poll();
	}

	//The hasItems method returns the opposite of the linked list’s isEmpty method.
	public boolean hasItems() {
		return !list.isEmpty();
	}

	//The size method returns the result of the linked list’s size method.
	public int size() {
		return list.size();
	}

	//The addItems method accepts a parameter that must be another GenQueue object whose element type is either the same type as this GenQueue object’s elements 
	//or a subtype of this GenQueue object’s element type. This method uses a while loop to remove all the items from the q parameter and add them to this queue.
	public void addItems(GenQueue<? extends E> q) {
		while (q.hasItems())
			list.addLast(q.dequeue());
	}
}