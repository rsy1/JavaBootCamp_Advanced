package bk4_04UsingLInkedLists;

import java.util.ArrayList;

//Illustration: Adding items to a Linked List using add() & addFirst() & inserting an object into a specific position into the list

import java.util.LinkedList;
import java.util.List;

public class AddingItemsToLinkedList {

	public static void main(String[] args) {
		LinkedList<String> officers = new LinkedList<String>();
		officers.add("Blake");
		officers.add("Burns");
		officers.add("Houlihan");
		officers.add("Pierce");
		officers.add("McIntyre");
		for (String s : officers)
			System.out.println(s);

		// adding first
		System.out.println();
		addFirst();

		// inserting obj.
		System.out.println();
		insertIntoLinkedList();	
	}

	private static void addFirst() {
		LinkedList<String> officers = new LinkedList<String>();
		officers.addFirst("Blake");
		officers.addFirst("Burns");
		officers.addFirst("Houlihan");
		officers.addFirst("Pierce");
		officers.addFirst("McIntyre");
		for (String s : officers)
			System.out.println(s);
	}

	private static void insertIntoLinkedList() {
		LinkedList<String> officers = new LinkedList<String>();
		officers.add("Blake");
		officers.add("Burns");
		officers.add("Houlihan");
		officers.add("Pierce");
		officers.add("McIntyre");
		officers.add(2, "Tuttle");
		for (String s : officers)
			System.out.println(s);
	}
}




