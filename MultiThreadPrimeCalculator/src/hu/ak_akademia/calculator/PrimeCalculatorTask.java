package hu.ak_akademia.calculator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class PrimeCalculatorTask extends RecursiveTask<Boolean> {

	private static final long serialVersionUID = 1L;
	private long number;
	private long lowerBound;
	private long upperBound;

	public PrimeCalculatorTask(long number) {
		this.number = number;
		this.lowerBound = 2;
		this.upperBound = number - 1;
	}

	public PrimeCalculatorTask(long number, long lowerBound, long upperBound) {
		this.number = number;
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}

	@Override
	protected Boolean compute() {
		if (isBranchingFeasible()) {
			Collection<PrimeCalculatorTask> tasks = ForkJoinTask.invokeAll(createSubtasks());
			for (PrimeCalculatorTask task : tasks) {
				Boolean result = task.join();
				if (!result) {
					return false;
				}
			}
			return true;
		} else {
			return isPrime();
		}
	}

	private Boolean isPrime() {
		for (long possibleDivisor = lowerBound; possibleDivisor <= upperBound; possibleDivisor++) {
			if (number % possibleDivisor == 0) {
				return false;
			}
		}
		return true;
	}

	private Collection<PrimeCalculatorTask> createSubtasks() {
		List<PrimeCalculatorTask> dividedTasks = new ArrayList<>();
		long middle = (upperBound - lowerBound) / 2L;
		dividedTasks.add(new PrimeCalculatorTask(number, lowerBound, lowerBound + middle));
		dividedTasks.add(new PrimeCalculatorTask(number, lowerBound + middle + 1, upperBound));
		return dividedTasks;
	}

	private boolean isBranchingFeasible() {
		return upperBound - lowerBound > 1_000_000L;
	}

}