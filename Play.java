package snakeAndLadder;

public class Play {

	// CONSTANTS
	public static final int START = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to THE SNAKE AND LADDER game.\n");

		// VARIABLES
		int position = START;
		int dice;

		// INITIAL POSITION OF PLAYER
		System.out.println("Player begins at position " + position + "\n");

		// DISPLAYING NUMBER ON THE DICE
		dice = (int) (Math.abs(Math.ceil(Math.random() * 6)));
		System.out.println("Die rolls to give a " + dice);
	}
}