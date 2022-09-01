package bk2_05UsingLoops;

//Ilustration : do-while loop
//The condition that stops the loop isn’t tested until after the statements in the loop have executed.
//The while keyword and the expression aren’t coded until after the body of the loop
//As with a while loop, the body for a do-while loop can be a single statement or a block of statements enclosed in braces.
//The expression is followed by a semicolon. do-while is the only looping statement that ends with a semicolon.

public class EvenCounter2 {

	public static void main(String[] args) {
		int number = 2;
		do {
			System.out.print(number + " ");
			number += 2;
		} while (number <= 20);
		System.out.println();
	}
}

/*do
statement
while (expression);
*/