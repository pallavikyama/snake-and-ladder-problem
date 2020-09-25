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

		// INITIAL POSITION OF PLAYER
		System.out.println("Player begins at position " + position + "\n");

		// COMPUTING PLAYER POSITION ON THE BOARD
		while (position < END) {
			dice = (int) (Math.abs(Math.ceil(Math.random() * 6)));
			System.out.println("Die rolls to give a " + dice);
			choice = (int) (Math.ceil(Math.random() * 10) % 3);
			if (dice > 0) {
				switch (choice) {
				case LADDER: {
					position += dice;
					if (position > END)
						position -= dice;
					break;
				}
				case SNAKE: {
					position -= dice;
					if (position < START)
						position = START;
					break;
				}
				default:
					break;
				}
			}
		}
		System.out.println("Player finally is at position " + position + " exactly.");
	}
}