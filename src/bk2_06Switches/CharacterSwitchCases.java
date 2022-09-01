package bk2_06Switches;

//Illustration: Creating character cases

public class CharacterSwitchCases {

	private static char salesClass ='g';
	
	public static void main(String[] args) {
		double commissionRate;
		switch (salesClass) {
		case 'A':
		case 'a':
			commissionRate = 0.02;
			System.out.println("Executed case: " + salesClass);
			break;
		case 'B':
		case 'b':
			commissionRate = 0.035;
			System.out.println("Executed case: " + salesClass);
			break;
		case 'C':
		case 'c':
			commissionRate = 0.05;
			System.out.println("Executed case: " + salesClass);
			break;
		default:
			commissionRate = 0.0;
			System.out.println("Executed case: " + "Default");
			break;
		}
	}
}