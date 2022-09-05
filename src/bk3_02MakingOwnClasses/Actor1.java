package bk3_02MakingOwnClasses;

//Illustration: Constructor Calling other constructors
//A constructor can call another constructor of the same class by using the special keyword "this" as a method call
//This technique is commonly used when you have several constructors that build on one another

public class Actor1 {
	private String lastName;
	private String firstName;
	private boolean goodActor;

	public Actor1(String last, String first) {
		lastName = last;
		firstName = first;
	}

	public Actor1(String last, String first, boolean good) {
		goodActor = good;
		this(last, first);

	}
}
