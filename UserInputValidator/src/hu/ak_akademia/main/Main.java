package hu.ak_akademia.main;

import java.util.List;

import hu.ak_akademia.userinput.UserInput;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		boolean isLonger = true;
		String isNotNull = null;
		String myPartOfWord = "lma";
		char[] myCharacters = { 'a', 'v', 'k', 'l', 'o' };
		int min = 1;
		int max = 10;
		boolean isEven = true;
		boolean isHigher = true;
		boolean positiveNumber = true;
		int targetNumber = 10;
		List<String> myList = new UserInput().getUserInput();
		new CallStringValidator(isLonger, isNotNull, myPartOfWord, myCharacters, myList).callRun();
		new CallIntegerValidator(myList, min, max, isEven, isHigher, positiveNumber, targetNumber).callRun();
	}

	public static void printSeparator() {
		System.out.println("\n-------------------------------------\n");
	}

}
