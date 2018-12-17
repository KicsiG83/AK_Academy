package hu.ak_akademia.validator;

import hu.ak_akademia.userinput.UserInput;

public class ValidatorByStringLength implements Validator {

	@Override
	public boolean validateUserInput(UserInput userInput) {
		boolean result = false;
		if(userInput.getUserInput().length() < userInput.getUserInputLength()) {
			result = true;
		}else {
			System.out.println("A megadott szöveg hosszabb a validátorban megadott számnál!");
			result = false;
		}
		return result;
	}
}
