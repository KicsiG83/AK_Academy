package hu.ak_akademia.hangman;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class RiddleWord {

	private String solution;
	private Set<String> revealedLetters = new HashSet<>();

	public RiddleWord(String solution) {
		this.solution = solution;
	}

	public boolean revealLetter(String letter) {
		return revealedLetters.add(letter);
	}

	@Override
	public String toString() {
		List<Character> solutionLetters = new ArrayList<>();

		for (char letter : solution.toCharArray()) {
			solutionLetters.add(letter);
		}

		List<Character> maskedSolutionLetters = solutionLetters.stream()
				.map((letter) -> revealedLetters.contains(letter.toString()) ? letter : '_')
				.collect(Collectors.toList());

		Optional<String> maskedSolution = maskedSolutionLetters.stream().map(letter -> letter.toString())
				.reduce((c1, c2) -> c1.toUpperCase() + " " + c2.toUpperCase());
		return maskedSolution.get();
	}

}