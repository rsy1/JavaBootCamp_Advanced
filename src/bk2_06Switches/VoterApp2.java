package bk2_06Switches;

import java.util.Scanner;

//llustration: Switch Statement//
//==>:switch statement is useful when you need to select one of several alternatives based on the value of an 
//integer or character type variable
//==>:The expression must evaluate to an int, short, byte, or char. It can’t be a long or a floating-point type.
//==>:The last line of each case group is a break statement, which causes the entire switch statement to end.
//==>:default statement is executed only if none of the previous case constants match the switch expression.
//==>:A break statement causes control to skip to the end of the switch statement if the condition is tru and executed.

public class VoterApp2 {

	public VoterApp2() {
		// TODO Auto-generated constructor stub
	}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the voting machine " + "error code decoder.\n\n"
				+ "If your voting machine generates " + "an error code,\n" + "you can use this program to determine "
				+ "the exact\ncause of the error.\n");
		System.out.print("Enter the error code: ");

		int err = sc.nextInt();
		String msg;
		switch (err) {
		case 1:
			msg = "Voter marked more than one " + "candidate.\nBallot rejected.";
			break;
		case 2:
			msg = "Box checked and write-in candidate " + "entered.\nBallot rejected.";
			break;
		case 3:
			msg = "Entire ballot was blank.\n" + "Ballot filled in according to " + "secret plan.";
			break;
		case 4:
			msg = "Nothing unusual about the ballot.\n" + "Voter randomly selected for tax audit.";
			break;
		case 5:
			msg = "Voter filled in every box.\n" + "Ballot counted twice.";
			break;
		case 6:
			msg = "Voter drooled in voting machine.\n" + "Beginning spin cycle.";
			break;
		case 7:
			msg = "Voter lied to pollster after voting.\n" + "Voter's ballot changed " + "to match polling data.";
			break;
		default:
			msg = "Voter filled out ballot correctly.\n" + "Ballot discarded anyway.";
			break;
		}
		System.out.println(msg);
	}
}
