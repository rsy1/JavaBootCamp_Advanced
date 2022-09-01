package bk2_05UsingLoops;

//Illustration : Scoping out the counter variable
//uncoment line 9 for illustration

public class CountTo10Error {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++)
			System.out.println(i);
		//System.out.println("The final value of i is " + i); //i is out of scope
	}
}
