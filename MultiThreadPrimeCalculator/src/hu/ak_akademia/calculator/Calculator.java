package hu.ak_akademia.calculator;

import java.util.HashSet;
import java.util.Set;

import hu.ak_akademia.main.Main;

public class Calculator implements Runnable {

	private int min;
	private int max;
	private Set<Integer> primeNumbers = new HashSet<>();

	public Calculator(int min, int max) {
		this.min = min;
		this.max = max;
	}

	@Override
	public void run() {
		for (int i = min; i < max; i++) {
			if (isPrime(i) == true) {
				primeNumbers.add(i);
			}
		}
		Main.setFullSet(primeNumbers);
	}

	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		if (number == 2) {
			return true;
		}
		for (int possibleDisvisor = 2; possibleDisvisor < Math.sqrt(number) + 1; possibleDisvisor++) {
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
