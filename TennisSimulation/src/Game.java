import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Game {

	static Random random = new Random();
	
	public static void game(Player playerOne, Player playerTwo, String[] array, int index, int min, int max) throws InterruptedException {
		String[] gameArray = array;
		int playerOnePoint = 0;
		int playerOneSet = 0;
		int playerTwoSet = 0;
		int playerTwoPoint = 0;
		int endOfset = 6;
		int i = 1;
		do {
			System.out.format("\n---------- %d szett ----------\n\n", i);
			do {
				int pointOne = random.nextInt(2);
				int pointTwo = random.nextInt(2);
				if (pointOne == pointTwo) {
					continue;
				} else {
					if (pointOne == 0) {
						playerOnePoint++;
					} else {
						playerTwoPoint++;
					}
					System.out.println(gameArray[0] + " " + playerOnePoint + " | "
							+ gameArray[1] + " " + playerTwoPoint);
				}
				if (playerOnePoint == endOfset || playerTwoPoint == endOfset) {
					if (playerOnePoint == endOfset) {
						if (playerOnePoint - 1 == playerTwoPoint) {
							endOfset++;
						} else {
							break;
						}
					} else {
						if (playerTwoPoint - 1 == playerOnePoint) {
							endOfset++;
						} else {
							break;
						}
					}
				}
			} while (playerOnePoint != endOfset && playerTwoPoint != endOfset);
			if (playerOnePoint > playerTwoPoint) {
				playerOneSet++;
			} else {
				playerTwoSet++;
			}
			if (playerOnePoint > playerTwoPoint) {
				System.out.println("\n " + gameArray[0] + " nyerte a szettet.");
				Player.winners[index] = gameArray[0];
				Player.losers[index] = gameArray[1];
			} else {
				System.out.println("\n " + gameArray[1] + " nyerte a szettet.");
				Player.winners[index] = gameArray[1];
				Player.losers[index] = gameArray[0];
			}
			playerOnePoint = 0;
			playerTwoPoint = 0;
			endOfset = 6;
			i++;
			if(i == 5) {
				System.out.println("\nRoppant kiélezett a küzdelem, mindkét játékos maximális erőbedobással küzd a győzelemért.");
			}
			TimeUnit.SECONDS.sleep(2);
		} while (playerOneSet < 3 && playerTwoSet < 3);
		Printer.printWinner(playerOne, playerTwo, playerOneSet, playerTwoSet, gameArray, index, min, max);
	}
	
	public static void letsPlay(Player playerOne, Player playerTwo, String[] playersArray, int min, int max) throws InterruptedException {
		String[] players = playersArray;
		for (int i = 0; i < players.length / 2; i++) {
			String[] array = null;
			switch (i) {
			case 0:
				array = Player.firstPair;
				break;
			case 1:
				array = Player.secondPair;
				break;
			case 2:
				array = Player.thirdPair;
				break;
			case 3:
				array = Player.fourthPair;
				break;
			}
			Printer.players(playerOne, playerTwo, array);
			Game.game(playerOne, playerTwo, array, i, min, max);
		}
	}
}
