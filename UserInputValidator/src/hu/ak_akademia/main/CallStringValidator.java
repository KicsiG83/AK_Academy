package hu.ak_akademia.main;

import java.util.ArrayList;
import java.util.List;

import hu.ak_akademia.validator.string.AtLeastOneCharacterValidator;
import hu.ak_akademia.validator.string.CaseSensitiveValidator;
import hu.ak_akademia.validator.string.LengthValidator;
import hu.ak_akademia.validator.string.MyNotNullValidator;
import hu.ak_akademia.validator.string.MyNumberInStringValidator;
import hu.ak_akademia.validator.string.WordPartsValidator;

public class CallStringValidator {

	private boolean isLonger;
	private String isNotNull;
	private String myPartOfWord;
	private char[] myCharacters;
	private List<String> myList = new ArrayList<>();

	public CallStringValidator(boolean isLonger, String isNotNull, String myPartOfWord, char[] myCharacters,
			List<String> myList) {
		this.isLonger = isLonger;
		this.isNotNull = isNotNull;
		this.myPartOfWord = myPartOfWord;
		this.myCharacters = myCharacters;
		this.myList = myList;
	}

	public void callRun() {
		runAtLeastOneCharacterValidator(myList);
		runWordPartsValidator(myList);
		runCaseSensitiveValidator(myList);
		runLengthValidator(myList);
		runMyNotNullValidator(myList);
		runMyNumberInStringValidator(myList);
	}

	private void runAtLeastOneCharacterValidator(List<String> myList) {
		System.out.println("Legalább 1 karakter megtalálható?");
		for (String myString : myList) {
			System.out.println(new AtLeastOneCharacterValidator(myCharacters).validator(myString));
		}
		Main.printSeparator();
	}

	private void runWordPartsValidator(List<String> myList) {
		System.out.println("A keresett szórészlet megtalálható?");
		for (String myString : myList) {
			System.out.println(new WordPartsValidator().validator(myPartOfWord, myString));
		}
		Main.printSeparator();
	}

	private void runCaseSensitiveValidator(List<String> myList) {
		System.out.println("A megadott szó caseSensitive?");
		for (String string : myList) {
			System.out.println(new CaseSensitiveValidator().validator(true, string));
		}
		Main.printSeparator();
	}

	private void runLengthValidator(List<String> myList) {
		System.out.println("Szó hosszúság vizsgálat.");
		for (String string : myList) {
			System.out.println(new LengthValidator().validator(isLonger, 8, string));
		}
		Main.printSeparator();
	}

	private void runMyNotNullValidator(List<String> myList) {
		System.out.println("null vizsgálat.");
		System.out.println((new MyNotNullValidator().validator(isNotNull)) ? "not null" : "null");
		Main.printSeparator();
	}

	private void runMyNumberInStringValidator(List<String> myList) {
		System.out.println("Csak számokat tartalmaz a szöveg?");
		for (String string : myList) {
			System.out.println(new MyNumberInStringValidator().validator(string));
		}
		Main.printSeparator();
	}

}
