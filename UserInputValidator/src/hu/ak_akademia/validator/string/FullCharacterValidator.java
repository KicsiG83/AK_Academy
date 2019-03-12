package hu.ak_akademia.validator.string;

public class FullCharacterValidator implements MyStringValidator {

	private char[] myCharacters;

	public FullCharacterValidator(char[] myCharacters) {
		this.myCharacters = myCharacters;
	}

	@Override
	public boolean validator(String myString) {
		for (int j = 0; j < myCharacters.length; j++) {
			if (myString.contains(Character.toString(myCharacters[j]))) {
				continue;
			}
		}
		return false;
	}

	@Override
	public boolean validator(boolean isLong, int length, String myString) {
		return false;
	}

	@Override
	public boolean validator(boolean isUpperCase, String myString) {
		return false;
	}

	@Override
	public boolean validator(String wordPart, String myString) {
		return false;
	}

}
