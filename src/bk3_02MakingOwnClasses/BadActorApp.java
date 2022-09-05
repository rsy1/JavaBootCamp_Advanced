package bk3_02MakingOwnClasses;

//Illustration: No explicitly provide default constructor for the Actor class 
// Errors are because there are declared constructors

public class BadActorApp {
	public static void main(String[] args) {
		Actor a = new Actor(); // error: won't compile
	}
}

class Actor {
	private String lastName;
	private String firstName;
	private boolean goodActor;

	public Actor(String last, String first) {
		lastName = last;
		firstName = first;
	}

	public Actor(String last, String first, boolean good) {
		lastName = last;
		firstName = first;
		goodActor = good;
	}
}