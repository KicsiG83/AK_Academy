package hu.ak_akademia.main;

import hu.ak_akademia.userinput.UserInput;
import hu.ak_akademia.validator.Validator;
import hu.ak_akademia.validator.ValidatorByChar;
import hu.ak_akademia.validator.ValidatorByEven;
import hu.ak_akademia.validator.ValidatorByInterval;
import hu.ak_akademia.validator.ValidatorByStringLength;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		UserInput ui = new UserInput(5, 10, 20, "a", true);
		Validator validator = new ValidatorByChar();
//		Validator validator = new ValidatorByStringLength();
//		Validator validator = new ValidatorByEven();
//		Validator validator = new ValidatorByInterval();
		ui.getInput(validator);
	}
}
