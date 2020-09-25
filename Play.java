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
		int position1 = START;
		int position2 = START;
		int dice;
		int choice;

		// INITIAL POSITION OF PLAYERS
		System.out.println("Players begin at position " + START);

		// COMPUTING PLAYER POSITIONS ON THE BOARD
		while (position1 < END || position2 < END) {
			dice = (int) (Math.abs(Math.ceil(Math.random() * 6)));
			choice = (int) (Math.ceil(Math.random() * 10) % 3);
			if (dice > 0) {
				System.out.println("\nPlayer1:");
				switch (choice) {
				case LADDER: {
					System.out.println("Hurray!Got a Ladder!");
					System.out.println("Die rolls to give a " + dice);
					position1 += dice;
					if (position1 > END)
						position1 -= dice;
					do {
						dice = (int) (Math.abs(Math.ceil(Math.random() * 6)));
					} while (dice <= 0);
					System.out.println("Got an extra chance.");
					System.out.println("Die rolls to give a " + dice);
					position1 += dice;
					if (position1 > END)
						position1 -= dice;
					break;
				}
				case SNAKE: {
					System.out.println("Alas!Got a Snake.");
					System.out.println("Die rolls to give a " + dice);
					position1 -= dice;
					if (position1 < START)
						position1 = START;
					break;
				}
				default: {
					System.out.println("NO PLAY");
					break;
				}
				}
				System.out.println("Player1 is at position " + position1 + "\n");
				if (position1 == END) {
					System.out.println("PLAYER1 WINS!");
					break;
				}

				dice = (int) (Math.abs(Math.ceil(Math.random() * 6)));
				choice = (int) (Math.ceil(Math.random() * 10) % 3);
				if (dice > 0) {
					System.out.println("\nPLAYER2:");
					switch (choice) {
					case LADDER: {
						System.out.println("Hurray!Got a Ladder!");
						System.out.println("Die rolls to give a " + dice);
						position2 += dice;
						if (position2 > END)
							position2 -= dice;
						do {
							dice = (int) (Math.abs(Math.ceil(Math.random() * 6)));
						} while (dice <= 0);
						System.out.println("Got an extra chance.");
						System.out.println("Die rolls to give a " + dice);
						position2 += dice;
						if (position2 > END)
							position2 -= dice;
						break;
					}
					case SNAKE: {
						System.out.println("Alas!Got a Snake.");
						System.out.println("Die rolls to give a " + dice);
						position2 -= dice;
						if (position2 < START)
							position2 = START;
						break;
					}
					default: {
						System.out.println("NO PLAY");
						break;
					}
					}
					System.out.println("Player2 is at position " + position2 + "\n");
					if (position2 == END) {
						System.out.println("PLAYER2 WINS!");
						break;
					}
				}
			}
		}
	}
}