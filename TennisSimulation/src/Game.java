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
					System.out
							.println(gameArray[0] + " " + playerOnePoint + " | " + gameArray[1] + " " + playerTwoPoint);
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
			} else {
				System.out.println("\n " + gameArray[1] + " nyerte a szettet.");
			}
			playerOnePoint = 0;
			playerTwoPoint = 0;
			endOfset = 6;
			i++;
			if (i == 5) {
				System.out.println(
						"\nRoppant kiélezett a küzdelem, mindkét játékos maximális erőbedobással küzd a győzelemért.");
			}
			// TimeUnit.SECONDS.sleep(2);
		} while (playerOneSet < 3 && playerTwoSet < 3);
		fillWinnersAndLosersArrays(gameIndex, gameArray, playerOneSet, arrayIndex);
//		arrayIndex = 0;
		Printer.printWinner(playerOne, playerTwo, playerOneSet, playerTwoSet, gameArray, index, min, max);
	}

	/*
	 * Ezt a metódust átnézni, miért nem tölti rendesen a neveket, lehet a hiba nem
	 * itt van, hanem a winnerLoser és winnerWinner töltésnél!!!
	 */
	private static void fillWinnersAndLosersArrays(int gameIndex, String[] gameArray, int playerOneSet,
			int arrayIndex) {
		if (playerOneSet > playerOneSet) {
			switch (getArrayIndex()) {
			case 0:
				Player.winners[getArrayIndex()] = gameArray[0];
				Player.losers[getArrayIndex()] = gameArray[1];
				break;
			case 1:
				// 4 vesztes játékos további kvalifikálása
				Player.losersWinner[getArrayIndex()] = gameArray[0];
				Player.losersLosers[getArrayIndex()] = gameArray[1];
				break;
			case 2:
				// 4 győztes játékos további kvalifikálása
				Player.winnersWinners[getArrayIndex()] = gameArray[0];
				Player.winnersLosers[getArrayIndex()] = gameArray[1];
				break;
			default:
				// végjáték, amikor már nem tároljuk el a játékosokat a továbbiakban, csak a
				// megszerzett pontjaikat.
				break;
			}
		} else {
			switch (gameIndex) {
			case 0:
				// 8 játékos kvalifikálása és a játékosok tárolása a győztekes és vesztesek
				// tömbjébe.
				Player.winners[getArrayIndex()] = gameArray[1];
				Player.losers[getArrayIndex()] = gameArray[0];
				break;
			case 1:
				// 4 vesztes játékos további kvalifikálása
				Player.losersWinner[getArrayIndex()] = gameArray[1];
				Player.losersLosers[getArrayIndex()] = gameArray[0];
				break;
			case 2:
				// 4 győztes játékos további kvalifikálása
				Player.winnersWinners[getArrayIndex()] = gameArray[1];
				Player.winnersLosers[getArrayIndex()] = gameArray[0];
				break;
			default:
				// végjáték, amikor már nem tároljuk el a játékosokat a továbbiakban, csak a
				// megszerzett pontjaikat.
				break;
			}
		}
		setArrayIndex(getArrayIndex() + 1);
	}

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
