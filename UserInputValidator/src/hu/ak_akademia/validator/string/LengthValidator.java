package hu.ak_akademia.validator.string;

public class LengthValidator implements MyStringValidator {

	@Override
	public boolean validator(boolean isLong, int length, String myString) {
		if (isLong) {
			return myString.length() > length;
		} else {
			return myString.length() < length;
		}
	}

	@Override
	public boolean validator(String myString) {
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
