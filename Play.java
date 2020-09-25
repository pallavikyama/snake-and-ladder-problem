package snakeAndLadder;

public class Play {

	// CONSTANTS
	public static final int START = 0;
	public static final int END = 100;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;

	public static void main(String[] args) {
		System.out.println("Welcome to THE SNAKE AND LADDER game.\n");

		// VARIABLES
		int position = START;
		int dice;
		int choice;
		int diceCount = 0;

		// INITIAL POSITION OF PLAYER
		System.out.println("Player begins at position " + position + "\n");

		// COMPUTING PLAYER POSITION ON THE BOARD
		while (position < END) {
			dice = (int) (Math.abs(Math.ceil(Math.random() * 6)));
			choice = (int) (Math.ceil(Math.random() * 10) % 3);
			if (dice > 0) {
				switch (choice) {
				case LADDER: {
					System.out.println("Hurray!Got a Ladder!");
					System.out.println("Die rolls to give a " + dice);
					position += dice;
					if (position > END)
						position -= dice;
					break;
				}
				case SNAKE: {
					System.out.println("Alas!Got a Snake.");
					System.out.println("Die rolls to give a " + dice);
					position -= dice;
					if (position < START)
						position = START;
					break;
				}
				default: {
					System.out.println("NO PLAY");
					break;
				}
				}
				++diceCount;
				System.out.println("Player is at position " + position + "\n");
			}
		}
		System.out.println("The dice was rolled " + diceCount + " times to win the game.");
	}
}