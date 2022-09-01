package bk2_02VariablesAndDataTypes;

public class ConvertingAndCastingNumericData {
	public static void main(String[] args) {
		ConvertingAndCastingNumericData cConvert = new ConvertingAndCastingNumericData();
		cConvert.automaticConversions();
		cConvert.typeCasting();
		
	}

	private void automaticConversions() {
		//Mathematical operation on two values not of same type
		//======================================================
		//»»If one of the values is a double, the other value is converted to a double.
		//»»If neither is a double but one is a float, the other is converted to a float.
		//»»If neither is a double nor a float but one is a long, the other is converted to a long.
		//»»If all else fails, both values are converted to int.
	}
	
	private void typeCasting() {
		//Used to perfom a type conversion.
		//There risk of losing information when casting from double to int....
		
		double pi = 3.1314;
		int iPi;
		iPi = (int) pi;
		System.out.println("Casting double to an int: ==> " + iPi);
		
		double price = 9.99;
		int iPrice = (int) price;
		System.out.println("Lose of accuracy......" + iPrice);
	}

}
