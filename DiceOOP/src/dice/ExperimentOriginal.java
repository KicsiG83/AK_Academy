package dice;
import java.util.ArrayList;
import java.util.List;
import dice.Dice;
public class ExperimentOriginal {

	private int six;
	private int[] count;
	private int counter = 0;
	private List<Integer> statList = new ArrayList<>();

	public void calculateCast(int statCounting, int xTimes) {
		count = new int[statCounting];
		for (int i = 0; i < count.length; i++) {
			count[i] = new ExperimentOriginal().diceRollForSix(i, xTimes);
		}
		System.out.println("\nMinimum dobás: " + searchValue(count, 1));
		System.out.println("Maximum dobás: " + searchValue(count, 2));
		System.out.println("Átlag dobás: " + searchValue(count, 3) / statCounting);
	}

	public int diceRollForSix(int index, int xTimes) {
		Dice dice = new Dice();
		do {
			statList.add(dice.cast());
			if (statList.get(counter) == xTimes) {
				six++;
			} else {
				six = 0;
			}
			counter++;
		} while (six != xTimes);
		System.out.println((index + 1) + " kör - Dobások száma: " + counter);
		return counter;
	}

	public int searchValue(int[] inputArray, int index) {
		int value = inputArray[0];
		for (int i = 0; i < inputArray.length; i++) {
			switch (index) {
			case 1:
				if (inputArray[i] < value) {
					value = inputArray[i];
				}
				break;
			case 2:
				if (inputArray[i] > value) {
					value = inputArray[i];
				}
				break;
			default:
				value = value + inputArray[i];
				break;
			}
		}
		return value;
	}
}
