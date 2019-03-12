package hu.ak_akademia.validator.string;

public class CaseSensitiveValidator implements MyStringValidator {

	@Override
	public boolean validator(boolean isUpperCase, String myString) {
		if (isUpperCase) {
			CharacterCompare myCompare = new CharacterCompare(myString, myString.toUpperCase());
			if (myCompare.compareTo(myString) == 0) {
				return true;
			}
		} else {
			CharacterCompare myCompare = new CharacterCompare(myString, myString.toLowerCase());
			if (myCompare.compareTo(myString) == 0) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean validator(String myString) {
		return false;
	}

	@Override
	public boolean validator(boolean isLong, int length, String myString) {
		return false;
	}

	@Override
	public boolean validator(String wordPart, String myString) {
		return false;
	}

}
