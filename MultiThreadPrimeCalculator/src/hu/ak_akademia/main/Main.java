package hu.ak_akademia.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import hu.ak_akademia.calculator.Calculator;

public class Main {

	private static Set<Integer> fullSet = new HashSet<>();
	private final int MAXNUMBER = 2_000_000;

	public static void main(String[] args) {
		Main m = new Main();
		m.runOneThread();
		m.runMultiThread();
		m.runParameterizedThread(3);
		m.runStreamApi();
	}

	private void runOneThread() {
		long startTime = System.nanoTime();
		Thread t1 = new Thread(new Calculator(1, MAXNUMBER, 1));
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
		}
		System.out.println("Számolási idő 1 szálon: " + (System.nanoTime() - startTime) / 1_000_000 + " millisecond");
	}

	private void runMultiThread() {
		long startTime = System.nanoTime();
		Thread t1 = new Thread(new Calculator(1, MAXNUMBER / 2, 2));
		Thread t2 = new Thread(new Calculator(MAXNUMBER / 2 + 1, MAXNUMBER, 2));
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
		}
		System.out.println("Számolási idő 2 szálon: " + (System.nanoTime() - startTime) / 1_000_000 + " millisecond");
	}

	private void runParameterizedThread(int numberOfThreads) {
		List<Thread> listOfThread = new ArrayList<>();
		long startTime = System.nanoTime();
		int numberOfMax = MAXNUMBER;
		int numberOfResult = numberOfMax / numberOfThreads;
		int start = 0;
		int end = numberOfResult;
		for (int i = 0; i < numberOfThreads; i++) {
			Thread thread = new Thread(new Calculator(start, end, numberOfThreads));
			thread.start();
			listOfThread.add(thread);
			start = end + 1;
			end = start + numberOfResult;
			if (end > numberOfMax) {
				end = numberOfMax;
			}
		}
		for (Thread thread : listOfThread) {
			try {
				thread.join();
			} catch (Exception e) {
			}
		}
		System.out.println("Számolási idő " + numberOfThreads + " szálon: "
				+ (System.nanoTime() - startTime) / 1_000_000 + " millisecond");
	}

	public synchronized static void setFullSet(Set<Integer> set) {
		fullSet.addAll(set);
	}

	public static Set<Integer> getFullSet() {
		return fullSet;
	}

	private void runStreamApi() {
		long startTime = System.nanoTime();
		test();
		System.out.println(
				"Számolási idő StreamApi-val: " + (System.nanoTime() - startTime) / 1_000_000 + " millisecond");
	}

	private List<Integer> test() {
		return IntStream.range(1, MAXNUMBER).parallel().filter(number -> Calculator.isPrime(number)).boxed()
				.collect(Collectors.toList());
	}
}
