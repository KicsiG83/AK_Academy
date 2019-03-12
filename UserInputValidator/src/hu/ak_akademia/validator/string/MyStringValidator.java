package hu.ak_akademia.validator.string;

public interface MyStringValidator {

	boolean validator(String myString);

	boolean validator(boolean isLong, int length, String myString);

	boolean validator(boolean isUpperCase, String myString);

	boolean validator(String wordPart, String myString);

}
