import java.util.Random;
import java.util.stream.IntStream;

public class PlayerDraw {
	private static String[] nameArray = { "Roger Federer", "Rafael Nadal", "Novak Đoković", "Pete Sampras",
			"Andre Agassi", "Björn Borg", "Boris Becker", "Andy Roddick" };
	static String[] firstPair = new String[2];
	static String[] secondPair = new String[2];
	static String[] thirdPair = new String[2];
	static String[] fourthPair = new String[2];
	static int[] indexOfArray = new int[8];
	static int index = 0;

	public static void main(String[] args) {
		PlayerDraw.randomPlayer();
		PlayerDraw.fillPairArrays();
		PlayerDraw.print();
	}
	static Random random = new Random();
	
	public static void randomPlayer() {
		boolean contains;
		for (int i = 0; i < 7; i++) {
			do {
				index = random.nextInt(nameArray.length);
				contains = IntStream.of(indexOfArray).anyMatch(x -> x == index);
			} while (contains);
			indexOfArray[i] = index;
		}
	}
	
	public static void fillPairArrays() {
		for (int i = 0; i < indexOfArray.length; i++) {
			switch (i) {
			case 0:
				firstPair[0] = nameArray[indexOfArray[i]];
				break;
			case 1:
				firstPair[1] = nameArray[indexOfArray[i]];
				break;
			case 2:
				secondPair[0] = nameArray[indexOfArray[i]];
				break;
			case 3:
				secondPair[1] = nameArray[indexOfArray[i]];
				break;
			case 4:
				thirdPair[0] = nameArray[indexOfArray[i]];
				break;
			case 5:
				thirdPair[1] = nameArray[indexOfArray[i]];
				break;
			case 6:
				fourthPair[0] = nameArray[indexOfArray[i]];
				break;
			case 7:
				fourthPair[1] = nameArray[indexOfArray[i]];
				break;
			}
		}
	}
	
	public static void print() {
		System.out.println();
		System.out.println(firstPair[0] + " - " + firstPair[1]);
		System.out.println(secondPair[0] + " - " + secondPair[1]);
		System.out.println(thirdPair[0] + " - " + thirdPair[1]);
		System.out.println(fourthPair[0] + " - " + fourthPair[1]);
	}
}
