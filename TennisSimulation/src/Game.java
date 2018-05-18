import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Game {

	static Random random = new Random();
	private static int arrayIndex;

	public static int getArrayIndex() {
		return arrayIndex;
	}

	public static void setArrayIndex(int number) {
		arrayIndex = number;
	}

	/**
	 * Játékmenet
	 * 
	 * @param playerOne
	 * @param playerTwo
	 * @param array
	 * @param index
	 * @param min
	 * @param max
	 * @param gameIndex
	 * @throws InterruptedException
	 * 
	 *             A playerOne és playerTwo játéka. A játékosok az átadott tömbből
	 *             kerülnek ki. A min és max értékkel kapja meg a metódus a
	 *             megnyerhető pontokat. A gameIndex vezérli a nyertes és vesztes
	 *             játékosok nevének letárolását.
	 * 
	 */
	public static void game(Player playerOne, Player playerTwo, String[] array, int index, int min, int max,
			int gameIndex) throws InterruptedException {
		String[] gameArray = array;
		int playerOnePoint = 0;
		int playerOneSet = 0;
		int playerTwoSet = 0;
		int playerTwoPoint = 0;
		int endOfSet = 6;
		int i = 1;
		do {
			System.out.format("\n---------- %d szett ----------\n\n", i);
			System.out
			.println(gameArray[0] + " " + playerOnePoint + " | " + gameArray[1] + " " + playerTwoPoint);
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
					System.out
							.println(gameArray[0] + " " + playerOnePoint + " | " + gameArray[1] + " " + playerTwoPoint);
				}
				/*
				 * Tie Break még nincs kész!
				 * 
				 * if(playerOnePoint == 6 && playerTwoPoint == 6) {
				 * System.out.println("Tie Break."); playerOnePoint = 0; playerTwoPoint = 0;
				 * endOfSet = 6; }
				 */
				if (playerOnePoint == endOfSet || playerTwoPoint == endOfSet) {
					if (playerOnePoint == endOfSet) {
						if (playerOnePoint - 1 == playerTwoPoint) {
							endOfSet++;
						} else {
							break;
						}
					} else {
						if (playerTwoPoint - 1 == playerOnePoint) {
							endOfSet++;
						} else {
							break;
						}
					}
				}
			} while (playerOnePoint != endOfSet && playerTwoPoint != endOfSet);
			if (playerOnePoint > playerTwoPoint) {
				playerOneSet++;
			} else {
				playerTwoSet++;
			}
			if (playerOnePoint > playerTwoPoint) {
				System.out.println("\n " + gameArray[0] + " nyerte a szettet.");
			} else {
				System.out.println("\n " + gameArray[1] + " nyerte a szettet.");
			}
			playerOnePoint = 0;
			playerTwoPoint = 0;
			endOfSet = 6;
			i++;
			if (i == 5) {
				System.out.println(
						"\nRoppant kiélezett a küzdelem, mindkét játékos maximális erőbedobással küzd a győzelemért.");
			}
			 //TimeUnit.SECONDS.sleep(2);
		} while (playerOneSet < 3 && playerTwoSet < 3);
		fillWinnersAndLosersArrays(gameIndex, gameArray, playerOneSet, playerTwoSet, arrayIndex);
		Printer.printAndFillPlayerArrays(playerOne, playerTwo, playerOneSet, playerTwoSet, gameArray, index, min, max);
	}

	/**
	 * Győztes és vesztes játékosok tárolása tömbökben
	 * 
	 * @param gameIndex
	 * @param gameArray
	 * @param playerOneSet
	 * @param playerTwoSet
	 * @param arrayIndex
	 * 
	 *            A gameIndex paraméter vezérli, hogy mikor melyik tömbben tárolja a
	 *            program az adatokat. 
	 *            0 = 4 győztes - 4 vesztes tömbök töltése; 
	 *            1 = A 4 vesztes játékos tovább versenyeztetése után további 2 vesztes
	 *            és 2 győztes tömbbe töltése; 
	 *            2 = A 4 győztes játékos tovább versenyeztetése után további 2 vesztes 
	 *            és 2 győztes tömbbe töltése.
	 * 
	 */
	private static void fillWinnersAndLosersArrays(int gameIndex, String[] gameArray, int playerOneSet,
			int playerTwoSet, int arrayIndex) {
		if (playerOneSet > playerTwoSet) {
			switch (gameIndex) {
			case 0:
				Player.winners[getArrayIndex()] = gameArray[0];
				Player.losers[getArrayIndex()] = gameArray[1];
				break;
			case 1:
				Player.losersWinner[getArrayIndex()] = gameArray[0];
				Player.losersLosers[getArrayIndex()] = gameArray[1];
				break;
			case 2:
				Player.winnersWinners[getArrayIndex()] = gameArray[0];
				Player.winnersLosers[getArrayIndex()] = gameArray[1];
				break;
			default:
				break;
			}
		} else {
			switch (gameIndex) {
			case 0:
				Player.winners[getArrayIndex()] = gameArray[1];
				Player.losers[getArrayIndex()] = gameArray[0];
				break;
			case 1:
				Player.losersWinner[getArrayIndex()] = gameArray[1];
				Player.losersLosers[getArrayIndex()] = gameArray[0];
				break;
			case 2:
				Player.winnersWinners[getArrayIndex()] = gameArray[1];
				Player.winnersLosers[getArrayIndex()] = gameArray[0];
				break;
			default:
				break;
			}
		}
		setArrayIndex(getArrayIndex() + 1);
	}

	/**
	 * Játék indítása
	 * 
	 * @param playerOne
	 * @param playerTwo
	 * @param playersArray
	 * @param min
	 * @param max
	 * @param gameIndex
	 * @throws InterruptedException
	 * 
	 *             A párba állított játékosok nevének kiírása és a játék.
	 */

	public static void letsPlay(Player playerOne, Player playerTwo, String[] playersArray, int min, int max,
			int gameIndex) throws InterruptedException {
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
			Game.game(playerOne, playerTwo, array, i, min, max, gameIndex);
		}
	}
}
