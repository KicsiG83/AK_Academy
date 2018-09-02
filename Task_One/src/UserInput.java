import java.util.Scanner;

public class UserInput {

	public int userInput(Scanner sc) {
		int result = 0;
		boolean valid = false;
		do {
			System.out.print("Kérem adja meg a vizsgálandó számot: ");
			String userInput = sc.nextLine();
			if (new Validator().isValid(userInput)) {
				result = Integer.parseInt(userInput);
				valid = true;
			} else {
				System.out.println("A megadott input érvénytelen.");
			}
		} while (!valid);
		return result;
	}
}
