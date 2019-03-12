package hu.ak_akademia.validator.string;

public class AtLeastOneCharacterValidator implements MyStringValidator {

	private char[] myCharacters;

	public AtLeastOneCharacterValidator(char[] myCharacters) {
		this.myCharacters = myCharacters;
	}

	@Override
	public boolean validator(String myString) {
		for (int j = 0; j < myCharacters.length; j++) {
			if (myString.contains(Character.toString(myCharacters[j]))) {
				return true;
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
