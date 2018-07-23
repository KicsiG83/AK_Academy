package hu.ak_akademia.sorting;

import java.util.Random;

public class Generate {

	public int[] generateRandomNumbers(int number) {
		Random random = new Random();
		int[] array = new int[number];
		int max = 1000;
		for (int i = 0; i < number; i++) {
			array[i] = random.nextInt(max) * (random.nextBoolean() ? -1 : 1);
		}
		return array;
	}

}
