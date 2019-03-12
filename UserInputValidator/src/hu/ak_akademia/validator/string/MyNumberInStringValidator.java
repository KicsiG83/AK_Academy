package hu.ak_akademia.validator.string;

public class MyNumberInStringValidator implements MyStringValidator {

	@Override
	public boolean validator(String myString) {
		char[] myStringCharacters = myString.toCharArray();
		for (int i = 0; i < myStringCharacters.length; i++) {
			try {
				Integer.parseInt(Character.toString(myStringCharacters[i]));
			} catch (Exception e) {
				return false;
			}
		}
		return true;
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
