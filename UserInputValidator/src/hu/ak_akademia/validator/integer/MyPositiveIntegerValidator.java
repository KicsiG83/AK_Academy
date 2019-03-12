package hu.ak_akademia.validator.integer;
import java.util.List;
import java.util.Optional;

public class MyPositiveIntegerValidator implements MyIntegerValidator {

	@Override
	public boolean validator(int myNumber, int min, int max) {
		return (myNumber > min && myNumber < max) ? true : false;
	}

	@Override
	public boolean validator(boolean isEven, int number) {
		int rest = 0;
		if (isEven) {
			rest = 0;
		} else {
			rest = 1;
		}
		return number % 2 == rest;
	}

	@Override
	public boolean validator(int primeNumber) {
		if (primeNumber < 2) {
			return false;
		}
		if (primeNumber == 2) {
			return true;
		}
		for (int possibleDisvisor = 2; possibleDisvisor < Math.sqrt(primeNumber) + 1; possibleDisvisor++) {
			if (primeNumber % possibleDisvisor == 0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean notNullValidator(int number) {
		Optional<Integer> num = Optional.ofNullable(number);
		return (num.isPresent()) ? true : false;
	}

	@Override
	public boolean higherSmallerValidator(boolean isHigher, int targetNumber, int myNumber) {
		if (isHigher) {
			return (myNumber > targetNumber) ? true : false;
		} else {
			return (myNumber < targetNumber) ? true : false;
		}
	}

	@Override
	public boolean integerValidator(List<String> myList) {
		for (String string : myList) {
			try {
				Integer.parseInt(string);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean positiveNumberValidator(boolean positiveNumber, int myNumber) {
		return (myNumber > 0) ? true : false;
	}

}
