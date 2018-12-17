package hu.ak_akademia.validator;

import hu.ak_akademia.userinput.UserInput;

public class ValidatorByChar implements Validator {

	@Override
	public boolean validateUserInput(UserInput userInput) {
		boolean result = false;
		if(userInput.getUserInput().contains(userInput.getUserInputChar())) {
			result = true;
		}else {
			System.out.println("A megadott szöveg nem tartalmazza a validátorban megadott betűt!");
			result = false;
		}
		return result;
	}
}
