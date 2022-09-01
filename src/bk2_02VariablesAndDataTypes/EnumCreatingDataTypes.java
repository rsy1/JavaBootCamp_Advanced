package bk2_02VariablesAndDataTypes;

public class EnumCreatingDataTypes {
	public enum CardSuit {
		HEARTS, SPADES, CLUBS, DIAMONDS
	}

	public static void main(String[] args) {
		CardSuit suit;
		suit = CardSuit.DIAMONDS;
		System.out.println("The suit is " + suit);
	}
}
