package hu.ak_akademia.validator;

public class NumberValidator {

	public boolean numberValidator(String userInput) {
		boolean result = false;
		if(userInput.matches("^[0-9]+$")) {
			result = true;
		}else {
			System.out.println("A megadott adat nem szám.");
		}
		return result;
	}
}
