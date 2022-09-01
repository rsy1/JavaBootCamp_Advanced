package bk2_06Switches;

//Illustration: Switch statements combined with is statements
//==>:use apostrophes, not quotation marks, to create character literals

public class Switch_If_Combined {

	private static int salesClass = 2;
	private static double salesTotal = 1300;

	public static void main(String[] args) {
		double commissionRate;
		switch (salesClass) {
		case 1:
			if (salesTotal < 10000.0)
				commissionRate = 0.01;
			else
				commissionRate = 0.02;
			System.out.println("Executed case: " + salesClass);
			break;
		case 2:
			if (salesTotal < 10000.0)
				commissionRate = 0.025;
			else
				commissionRate = 0.035;
			System.out.println("Executed case: " + salesClass);
			break;
		case 3:
			if (salesTotal < 10000.0)
				commissionRate = 0.04;
			else
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
