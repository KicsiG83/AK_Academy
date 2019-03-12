package hu.ak_akademia.main;

import java.util.ArrayList;
import java.util.List;

import hu.ak_akademia.validator.integer.MyIntegerValidator;
import hu.ak_akademia.validator.integer.MyPositiveIntegerValidator;

public class CallIntegerValidator {

	private List<Integer> myNumberList = new ArrayList<>();
	private List<String> myList = new ArrayList<>();
	private int min;
	private int max;
	private boolean isEven;
	private boolean isHigher;
	private boolean positiveNumber;
	private int targetNumber;

	public CallIntegerValidator(List<String> myList, int min, int max, boolean isEven, boolean isHigher,
			boolean positiveNumber, int targetNumber) {
		super();
		this.myList = myList;
		this.min = min;
		this.max = max;
		this.isEven = isEven;
		this.isHigher = isHigher;
		this.positiveNumber = positiveNumber;
		this.targetNumber = targetNumber;
	}

	public void callRun() {
		runPrepare(myList);
	}

	private void runPrepare(List<String> myList) {
		if (checkInput(myList)) {
			fillMyNumberList(myList);
			MyIntegerValidator myIntegerValidator = new MyPositiveIntegerValidator();
			runIntervalValidator(myIntegerValidator);
			runEvenValidator(myIntegerValidator);
			runPrimeValidator(myIntegerValidator);
			runHigherSmallerValidator(myIntegerValidator);
			runPositiveNumberValidator(myIntegerValidator);
		} else {
			System.out.println("A megadott értékek hibásak!");
		}
	}

	private void runIntervalValidator(MyIntegerValidator myIntegerValidator) {
		System.out.println("Intervallum vizsgálat.");
		for (Integer number : myNumberList) {
			System.out.println(myIntegerValidator.validator(number, min, max));
		}
		Main.printSeparator();
	}

	private void runEvenValidator(MyIntegerValidator myIntegerValidator) {
		System.out.println("Párosszám vizsgálat.");
		MyPositiveIntegerValidator myPositiveIntegerValidator = new MyPositiveIntegerValidator();
		for (Integer number : myNumberList) {
			System.out.println(myPositiveIntegerValidator.validator(isEven, number));
		}
		Main.printSeparator();
	}

	private void runPrimeValidator(MyIntegerValidator myIntegerValidator) {
		System.out.println("Prímszám vizsgálat.");
		for (Integer number : myNumberList) {
			System.out.println(myIntegerValidator.validator(number));
		}
		Main.printSeparator();
	}

	private void runHigherSmallerValidator(MyIntegerValidator myIntegerValidator) {
		System.out.println("Kisebb - Nagyobb vizsgálat.");
		for (Integer number : myNumberList) {
			System.out.println(myIntegerValidator.higherSmallerValidator(isHigher, targetNumber, number));
		}
		Main.printSeparator();
	}

	private void runPositiveNumberValidator(MyIntegerValidator myIntegerValidator) {
		System.out.println("Pozitív szám vizsgálat.");
		for (Integer number : myNumberList) {
			System.out.println(myIntegerValidator.positiveNumberValidator(positiveNumber, number));
		}
		Main.printSeparator();
	}

	private boolean checkInput(List<String> myList) {
		for (String string : myList) {
			try {
				Integer.parseInt(string);
			} catch (Exception e) {
				return false;
			}
		}
		return false;
	}

	private void fillMyNumberList(List<String> myList) {
		for (String string : myList) {
			myNumberList.add(Integer.parseInt(string));
		}
	}
}
