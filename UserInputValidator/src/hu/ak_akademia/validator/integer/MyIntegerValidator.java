package hu.ak_akademia.validator.integer;

public interface MyIntegerValidator {

	boolean validator(int myNumber, int min, int max);

	boolean validator(boolean isEvan, int number);

	boolean validator(int primeNumber);

	boolean notNullValidator(int number);

	boolean positiveNumberValidator(boolean positiveNumber, int myNumber);

	boolean higherSmallerValidator(boolean isHigher, int targetNumber, int myNumber);

}