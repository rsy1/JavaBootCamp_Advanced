package bk2_04MakingChoices;

//Iustartion = comparing strings
//
public class ComparingStrings {
	public static void main(String[] args) {
		
		String answer = "yes";
		
		//Won't work, strings are reference types, not primitive types
		//when you use the == operator with reference types, Java compares the references to the objects
		//Instead, it tests whether the "answer string" and the literal string "Yes" point to the same string object in memory
		//In many cases, they do — but sometimes they don’t, and the results are difficult to predict
		if (answer == "Yes")
			System.out.println("The answer is Yes.");
		
		
		//The correct way to test a string for a given value is to use the equals() method of the String class:
		/*This method actually compares the value of the string object referenced by the
			variable with the string you pass as a parameter and returns a Boolean result to
			indicate whether the strings have the same value.*/
		
		if (answer.equals("Yes")) {
			System.out.println("The answer is Yes.");
		}
		
		//Ignose case, best when expecting user input
		if (answer.equalsIgnoreCase("yes")) {
			// end the program
		}

	}
}
