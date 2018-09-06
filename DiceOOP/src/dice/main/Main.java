package dice.main;

import dice.Dice;
import dice.Rotate;
import dice.Statistics;
import dice.experiment.Experiment;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Statistics stat = new Statistics();
		Dice[] dices = new Dice[100];
		for (int i = 0; i < 100; i++) {
			dices[i] = new Dice();
			dices[i].setFaceTop(dices[i].cast());
			stat.counter(dices[i].getFaceTop());
			System.out.println(dices[i].toString());
		}
		stat.printStatistics();
		new Rotate().rotate(new Dice());
		new Experiment().experiments(); 			
	}
}
