package dice.experiment;

import dice.experiment.ExperimentDiceRollForSix;
import dice.experiment.ExperimentSearchValue;

public class ExperimentCalculateCast {

	private int[] count;

	public void calculateCast(int statCounting, int xTimes) {
		count = new int[statCounting];
		for (int i = 0; i < count.length; i++) {
			count[i] = new ExperimentDiceRollForSix().diceRollForSix(i, xTimes);
		}
		System.out.println("\nMinimum dobás: " + new ExperimentSearchValue().searchValue(count, 1));
		System.out.println("Maximum dobás: " + new ExperimentSearchValue().searchValue(count, 2));
		System.out.println("Átlag dobás: " + new ExperimentSearchValue().searchValue(count, 3) / statCounting);
	}
}
