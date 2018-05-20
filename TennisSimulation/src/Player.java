import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

public class Player {
	private static Map<Integer, String> name = Map.of(0, "Roger Federer", 1, "Rafael Nadal", 2, "Novak Đoković", 3,
			"Pete Sampras", 4, "Andre Agassi", 5, "Björn Borg", 6, "Boris Becker", 7, "Andy Roddick");
	public static HashMap<String, Integer> point = new HashMap<String, Integer>();

	public static String getName(int index) {
		return name.get(index);
	}

	static int index = 0;
	static Random random = new Random();
	static int[] indexOfEightPlayerArray = new int[8];
	static int[] indexOfFourPlayerWinners = new int[4];
	static int[] indexOfFourPlayerLosers = new int[4];
	static int[] indexOfTwoPlayerArray = new int[2];
	static String[] firstPair = new String[2];
	static String[] secondPair = new String[2];
	static String[] thirdPair = new String[2];
	static String[] fourthPair = new String[2];
	static String[] winners = new String[4];
	static String[] losers = new String[4];
	static String[] winnersWinners = new String[2];
	static String[] winnersLosers = new String[2];
	static String[] losersWinner = new String[2];
	static String[] losersLosers = new String[2];
	static Map<Integer, String> playerPosition = new HashMap<Integer, String>();

	public static String[] firstArray() {
		String[] playerArray = new String[8];
		for(int i = 0; i < playerArray.length; i++) {
			playerArray[i] = Player.getName(i);
		}
		return playerArray;
	}
	
	public static void randomPlayer(int[] sequence, String[] playerArray) {
		String[] arrayName = playerArray;
		int[] indexArray = sequence;
		boolean contains;
		for (int i = 0; i < indexArray.length - 1; i++) {
			do {
				index = random.nextInt(arrayName.length);
				contains = IntStream.of(indexArray).anyMatch(x -> x == index);
			} while (contains);
			indexArray[i] = index;
		}
	}

	/**
	 * Játékosok párosítása
	 */
	public static void fillPairArrays(String[] playerArray, int length) {
		String[] nameArray = playerArray;
		int index = length;
		for (int i = 0; i < index; i++) {
			switch (i) {
			case 0:
				firstPair[0] = nameArray[i];
				break;
			case 1:
				firstPair[1] = nameArray[i];
				break;
			case 2:
				secondPair[0] = nameArray[i];
				break;
			case 3:
				secondPair[1] = nameArray[i];
				break;
			case 4:
				thirdPair[0] = nameArray[i];
				break;
			case 5:
				thirdPair[1] = nameArray[i];
				break;
			case 6:
				fourthPair[0] = nameArray[i];
				break;
			case 7:
				fourthPair[1] = nameArray[i];
				break;
			}
		}
	}

	/**
	 * A játékosok párba állítása utáni lista
	 */
	public static void print() {
		System.out.println();
		System.out.println(firstPair[0] + " - " + firstPair[1]);
		System.out.println(secondPair[0] + " - " + secondPair[1]);
		System.out.println(thirdPair[0] + " - " + thirdPair[1]);
		System.out.println(fourthPair[0] + " - " + fourthPair[1]);
	}

	public static void printWinnerAndLoser(int index) {
		for (int i = 0; i < winners.length; i++) {
			System.out.println(index + " meccsén nyert: " + winners[i]);
			System.out.println(index + " meccsén vesztett: " + losers[i]);
		}
	}

	public static void emptyPlayerlist() {
		firstPair = new String[2];
		secondPair = new String[2];
		thirdPair = new String[2];
		fourthPair = new String[2];
	}
	
	public static void position() {
		int index = 0;
		for (Map.Entry<String, Integer> entry : point.entrySet())  {
			String name = entry.getKey();
			index = entry.getValue();
			playerPosition.put(index, name);
		}
	}
	
	public static void calculateRemuneration(int totalRemuneration) {
		position();
		int i = 0;
		double[] remunerations = new double[8];
		remunerations[0] = totalRemuneration / 100.0 * 35.0;
		remunerations[1] = totalRemuneration / 100.0 * 25.0;
		remunerations[2] = totalRemuneration / 100.0 * 10.0;
		remunerations[3] = totalRemuneration / 100.0 * 8.0;
		remunerations[4] = totalRemuneration / 100.0 * 7.0;
		remunerations[5] = totalRemuneration / 100.0 * 6.0;
		remunerations[6] = totalRemuneration / 100.0 * 5.0;
		remunerations[7] = totalRemuneration / 100.0 * 4.0;
		System.out.println("\nA teljes felajánlott összeg: " + totalRemuneration + " birodalmi váltó.");
		for (int j = 14; j > 0; j--) {
			String playerName = playerPosition.get(j);
			if (playerName != null) {
				System.out.println(i + 1 + ". helyezett " + playerName + " - " + j + " ponttal. Nyereménye: "
						+ remunerations[i] + " birodalmi váltó.");
				i++;
			}
		}
	}
}
