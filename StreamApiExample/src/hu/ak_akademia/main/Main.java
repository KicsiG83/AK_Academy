package hu.ak_akademia.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		numbers.add(13);
		numbers.add(7);
		numbers.add(42);
		numbers.add(17);
		numbers.add(32);
		numbers.add(74);
		numbers.add(43);
		numbers.stream().map(number -> number + 100)
						.filter(number -> number % 2 == 0)
						.filter(number -> number > 50)
						.sorted()
						.forEach(System.out::println);

	}

}
