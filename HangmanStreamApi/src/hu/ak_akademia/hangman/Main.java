package hu.ak_akademia.hangman;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	private final static int MAXIMUM = 10;

	public static void main(String[] args) throws Exception {
		Set<String> words = Files.lines(Paths.get("resources/szavak.txt")).collect(Collectors.toSet());

		List<String> wordList = new ArrayList<>(words);

		Random random = new Random();
		String solution = wordList.get(random.nextInt(wordList.size()));
		RiddleWord riddleWord = new RiddleWord(solution);
		Set<String> wrongLetters = new LinkedHashSet<>();

		try (UserInput ui = new UserInput()) {
			while (riddleWord.toString().contains("_") && wrongLetters.size() < MAXIMUM) {
				System.out.print("Kérem adjon meg egy betűt: ");
				String input = ui.read();
				if (solution.contains(input)) {
					riddleWord.revealLetter(input);
				} else {
					wrongLetters.add(input);
				}
				System.out.println(riddleWord);
				System.out.println(wrongLetters);
			}
		}
		System.out.println(solution);
	}

}