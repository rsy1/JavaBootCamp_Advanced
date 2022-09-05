package bk3_04UsingSubClassesAndInterfaces;

public class BetterPlayer extends Player{
	public int move() {
		System.out.println("\nThe better player says:");
		System.out.println("I'm looking for a good move...");
		return findBestMove();
	}

	private int findBestMove() {
		int square = 0;
		// code to find the best move goes here
		return square;
	}
}
