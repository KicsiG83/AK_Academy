package dice.experiment;

import java.util.ArrayList;
import java.util.List;

import dice.Dice;

public class ExperimentDiceRollForSix extends Experiment {

	private int six;
	private int counter = 0;
	private List<Integer> statList = new ArrayList<>();

	public ExperimentDiceRollForSix() {
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
}
