package bk2_04MakingChoices;

//Ilustration -: It’s a ternary operator
//it works with three operands.
//
public class ConditionalOperator {
public static void main(String[] args) {
	
	int salesTotal= 12000;
	int appleCount = 0;
	
	int tier = salesTotal > 10000.0 ? 1 : 0;
	
	int tier1 = (salesTotal > 10000.0) ? 1 : 0;
	
	String msg = "You have " + appleCount + " apple"
			+ ((appleCount>1) ? "s." : ".");
}
}
