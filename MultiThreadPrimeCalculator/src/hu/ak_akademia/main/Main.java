package hu.ak_akademia.main;

import hu.ak_akademia.calculator.Calculator;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.runOneThread();
		m.runMultiThread();
		m.runParametersThread(6);
	}

	private void runOneThread() {
		Calculator calc = new Calculator(1, 2_000_000, 1);
		Thread t1 = new Thread(calc);
		t1.start();

	}

	private void runMultiThread() {
		Calculator c1 = new Calculator(1, 1_000_000, 2);
		Calculator c2 = new Calculator(1_000_001, 2_000_000, 2);
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
	}

	private void runParametersThread(int numberOfThreads) {
		int numberOfMax = 2_000_000;
		int numberOfResult = numberOfMax / numberOfThreads;
		int start = 0;
		int end = numberOfResult;
		for (int i = 0; i < numberOfThreads; i++) {
			Calculator c1 = new Calculator(start, end, numberOfThreads);
			Thread t1 = new Thread(c1);
			t1.start();
			start = end + 1;
			end = start + numberOfResult;
			if (end > numberOfMax) {
				end = numberOfMax;
			}
		}
	}
}
