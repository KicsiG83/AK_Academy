package hu.ak_akademia.validator.string;

public class WordPartsValidator implements MyStringValidator {

	@Override
	public boolean validator(String wordPart, String myString) {
		return myString.contains(wordPart);
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
	public boolean validator(boolean isUpperCase, String myString) {
		return false;
	}

}
