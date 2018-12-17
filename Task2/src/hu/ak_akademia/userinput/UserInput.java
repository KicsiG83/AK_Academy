package hu.ak_akademia.userinput;

import java.util.Scanner;

import hu.ak_akademia.validator.Validator;

public class UserInput {

	private String userInput;
	private int min;
	private int max;
	private int userInputLength;
	private String userInputChar;
	private boolean parity;
	
	public UserInput(int min, int max, int userInputLength, String userInputChar, boolean parity){
		this.min = min;
		this.max = max;
		this.userInputLength = userInputLength;
		this.userInputChar = userInputChar;
		this.parity = parity;
	}
	
	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}

	public int getUserInputLength() {
		return userInputLength;
	}

	public String getUserInputChar() {
		return userInputChar;
	}

	public String getUserInput() {
		return userInput;
	}

	public boolean isParity() {
		return parity;
	}

	public void getInput(Validator validator) {
		Scanner sc = new Scanner(System.in);
		boolean result = false;
		do {
			System.out.print("Kérem adja meg a vizsgálandó inputot: ");
			userInput = sc.nextLine();
			if(validator.validateUserInput(this)) {
				result = true;
			}
		}while(!result);
		System.out.println("A validációnak megfelelt.");
		sc.close();
	}
}
