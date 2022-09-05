package bk3_02MakingOwnClasses;

//Illustration: Inner classes
//An inner class is a class that’s defined within the body of another class and is available
//only from within that class.

public class DiceGame {

	public DiceGame() throws Exception {
		throw new Exception();
	}

	public static void main(String[] args) {
		Dice d = new Dice();
		d.roll();

		Dice2 d2 = new Dice2();
		d2.roll2();

		Dice3 d3 = new Dice3();
		d3.roll3();

		try {
			DiceGame game = new DiceGame();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class Dice {
	public void roll() {
		System.out.println("Roll the dice............");
	}
}

class Dice2 {
	public void roll2() {
		System.out.println("Roll the dice again..............");
	}
}

class Dice3 {
	public void roll3() {
		Dice d = new Dice();
		d.roll();
		System.out.println("Roll the dice again & again................");
	}
}
