package bk4_04UsingLInkedLists;

//Illustration : Updating Linked List
import java.util.LinkedList;

public class UpdatingLinkedList {
	public static void main(String[]args) {
		LinkedList<String> officers = new LinkedList<String>();
		// add the original officers
		officers.add("Blake");
		officers.add("Burns");
		officers.add("Tuttle");
		officers.add("Houlihan");
		officers.add("Pierce");
		officers.add("McIntyre");
		System.out.println(officers);
		// replace Tuttle with Murdock
		officers.set(4, "Murdock");
		System.out.println("\nTuttle is replaced:");
		System.out.println(officers);
	}
}
