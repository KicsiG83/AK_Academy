package hu.ak_akademia.countdown;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Queue<Integer> numbers = new LinkedList<>();
		fillQueue(numbers);
		printNumbersWithForLoop(numbers);
		System.out.println("-----------------------");
		fillQueue(numbers);
		printNumbersWithWhile(numbers);
	}

	private static void fillQueue(Queue<Integer> numbers) {
		for (int i = 10; i > 0; i--) {
			numbers.add(i);
		}
	}

	private static void printNumbersWithForLoop(Queue<Integer> numbers) {
		int size = numbers.size();

		for (int i = 0; i < size; i++) {
			System.out.println(numbers.poll());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("huppsz");
			}
		}
	}

	private static void printNumbersWithWhile(Queue<Integer> numbers) {
		while (!numbers.isEmpty()) {
			System.out.println(numbers.poll());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("huppsz");
			}
		}
	}
}
