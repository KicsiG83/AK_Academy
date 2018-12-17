package hu.ak_akademia.validator;

import hu.ak_akademia.userinput.UserInput;

public class ValidatorByEven implements Validator {

	@Override
	public boolean validateUserInput(UserInput userInput) {
		if(new NumberValidator().numberValidator(userInput.getUserInput())) {
			int number = Integer.parseInt(userInput.getUserInput());
			if(userInput.isParity() && number % 2 == 0) {
				return true;
			}else if(!userInput.isParity() && number % 2 != 0) {
				return true;
			}else {
				System.out.println(userInput.isParity()? "A megadott szám nem páros" : "A megadott szám nem páratlan.");
				return false;
			}
		}else {
			return false;
		}
	}
}
