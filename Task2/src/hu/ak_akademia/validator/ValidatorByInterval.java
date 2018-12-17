package hu.ak_akademia.validator;

import hu.ak_akademia.userinput.UserInput;

public class ValidatorByInterval implements Validator {

	@Override
	public boolean validateUserInput(UserInput userInput) {
		if(new NumberValidator().numberValidator(userInput.getUserInput())) {
			int number = Integer.parseInt(userInput.getUserInput());
			if(userInput.getMin() <= number && number <= userInput.getMax()) {
				return true;
			}else {
				System.out.println("A megadott szám nem esik bele az intervallumba.");
				return false;
			}
		}else {
			return false;
		}
	}
}
