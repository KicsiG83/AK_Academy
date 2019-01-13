package hu.ak_akademia.calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator implements Runnable {

	private int min;
	private int max;
	private int thread;
	private Set<Integer> primeNumbers = new HashSet<>();

	public Calculator(int min, int max, int thread) {
		this.min = min;
		this.max = max;
		this.thread = thread;
	}

	@Override
	public void run() {
		long startTime = System.nanoTime();
		for (int i = min; i < max; i++) {
			if (isPrime(i) == true) {
				primeNumbers.add(i);
			}
			;
		}
		System.out.println(
				"Számolási idő " + thread + " szálon: " + (System.nanoTime() - startTime) / 1000 + " millisecund");
	}

	private boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		for (int possibleDisvisor = 2; possibleDisvisor < Math.sqrt(number); possibleDisvisor++) {
			if (number % possibleDisvisor == 0) {
				return false;
			}
		}
		return true;
	}

	public Set<Integer> getPrimeNumbers() {
		return primeNumbers;
	}
}
