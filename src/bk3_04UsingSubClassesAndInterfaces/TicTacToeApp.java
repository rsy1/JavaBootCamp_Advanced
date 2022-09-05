package bk3_04UsingSubClassesAndInterfaces;

//This class contains a method named playTheGame that accepts two Player objects.
//It calls the move method of the first player and then calls the move method of the second player:

public class TicTacToeApp {
	public static void main(String[] args) {
		Player p1 = new Player();
		Player p2 = new BetterPlayer();
		playTheGame(p1, p2);
	}

	public static void playTheGame(Player p1, Player p2) {
		p1.move();
		p2.move();
	}
}

/*When the move method for p1 is called, the move method of the Player class is
executed. But when the move method for p2 is called, the move method of the
BetterPlayer class is called.
*/