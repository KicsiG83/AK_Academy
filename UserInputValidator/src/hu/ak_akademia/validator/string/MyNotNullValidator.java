package hu.ak_akademia.validator.string;

import java.util.Optional;

public class MyNotNullValidator implements MyStringValidator {

	@Override
	public boolean validator(String myString) {
		Optional<String> string = Optional.ofNullable(myString);
		return string.isPresent();
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
