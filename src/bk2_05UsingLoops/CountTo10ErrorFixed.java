package bk2_05UsingLoops;

//Illustration : Scoping out the counter variable

public class CountTo10ErrorFixed {
	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 10; i++) //?? - why is i still incremented to 11 when it is already equal to 10
			System.out.println(i);
		System.out.println("The final value of i is " + i);
	}
}
