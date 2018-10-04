package hu.ak_akademia.printreversedword;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		new Main().run();

	}

	private void run() {
		List<Character> reversedWord = new ArrayList<>();
		String originalString = new GetInput().getInput();

		for (int i = originalString.length() - 1; i >= 0; i--) {
			reversedWord.add(originalString.charAt(i));
		}

		for (char letter : reversedWord) {
			System.out.print(letter);
		}
	}
}
