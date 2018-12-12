package hu.ak_akademia.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

/*
	3.	int	String	generál egy véletlenszerű String-et, ami a bemenetként megadott szám hosszúságú  			-> Kész csak nem lambda-s
	4.	String	int	megszámolja, hogy hány szóköz van a megadott String-ben										-> Kész csak nem lambda-s
	5.	String	boolean	megállapítja, hogy a megadott szöveg palindrom-e
	6.	String	String	abc sorrendbe rendezi a betűket a String-en belül
	8.	int	boolean	eldönti a megadott számról, hogy prím-e														-> Kész csak nem lambda-s
	9.	Set<Character>, Set<Character>	Set<String>	előállítja a bemenetként megadott két karakterhalmaz Descartes-szorzatát
	10.	String	Set<String>	előállítja a bemenetként kapott String karaktereinek összes permutációját
*/

public class Main {

	private static String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String ORIGINALSTRING = "alma körte szilva barack";

	public static void main(String[] args) {
		camelCase();
		camelCaseByAndris();
		fullUpperCase();
		countDown(10);

		String xLengthString = getRandomString(25);
		System.out.println(xLengthString);

		System.out.println(getSpaceCount(ORIGINALSTRING));

		int number = 9974;
		System.out.println(primNumberValidator(number) ? number + " prímszám" : number + " nem prímszám.");

	}

	private static void countDown(int inputNumber) {
		List.of(inputNumber).stream().forEach(number -> {
			while (number > 1) {
				System.out.println(--number);
			}
		});
	}

	private static void camelCase() {
		List<String> wordsList = new ArrayList<>();
		String[] wordsArray = ORIGINALSTRING.split(" ");
		Function<String, String> result = word -> StringUtils.capitalize(word);
		for (String word : wordsArray) {
			wordsList.add(result.apply(word));
		}
		System.out.println(wordsList.stream().collect(Collectors.joining("")));
	}

	private static void camelCaseByAndris() {
		System.out.println((new ArrayList<>(Arrays.asList(ORIGINALSTRING.toLowerCase().split(" ")))).stream()
				.map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
				.collect(Collectors.joining("")));
	}

	private static void fullUpperCase() {
		System.out.println((new ArrayList<>(Arrays.asList(ORIGINALSTRING.toUpperCase().replaceAll(" ", "_")))).stream()
				.collect(Collectors.joining("")));
	}

	public static String getRandomString(int length) {
		Random rn = new Random();
		StringBuilder sb = new StringBuilder();
		List.of(length).stream().forEach(lengthOfString -> {
			for (int i = 0; i < length; ++i) {
				sb.append(CHARACTERS.charAt(rn.nextInt(CHARACTERS.length())));
			}
		});
		return sb.toString();
	}

	private static int getSpaceCount(String originalString) {
		int counter = 0;
		char x = ' ';
		for (int i = 0; i < originalString.length(); i++) {
			if (originalString.charAt(i) == x) {
				counter++;
			}
		}
		return counter;
	}

	private static boolean primNumberValidator(int number) {
		for (int i = 2; i < number / 2 + 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
