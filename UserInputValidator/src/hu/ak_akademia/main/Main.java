import java.util.List;

import UserInput.UserInput;

public class Main {

	public static void main(String[] args) {
		new Main().run2();
	}

	private void run() {
		List<String> myList = new UserInput().getUserInput();
		MyNumberValidator myNumberValidator = new MyNumberValidator();
		for (String string : myList) {
			System.out.println(myNumberValidator.validator(string));
		}
	}

	private void run2() {
		List<String> myList = new UserInput().getUserInput();
		System.out.println(new MyStringChecker().caseSensitiveValidator(false, myList.get(0)));
	}
	
}
