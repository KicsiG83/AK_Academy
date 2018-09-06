package dice.experiment;

import dice.experiment.ExperimentCalculateCast;

public class Experiment {

	public Experiment() {
	}

	public void experiments() {
		int sixTest = 15;
		int xTimes = 5;
		System.out.println(
				"\nStatisztikai vizsgálat " + sixTest + " körben, minimum, maximum és átlagos dobások számára: \n");
		new ExperimentCalculateCast().calculateCast(sixTest, xTimes);
	}
}
