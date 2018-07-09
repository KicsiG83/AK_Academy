import java.util.Scanner;

public class GetInput {

	public int getMenuIndex(Scanner sc) {
		int index = 0;
		boolean valid = false;
		do {
			try {
				System.out.print("Kérem válasszon a menüből: ");
				index = sc.nextInt();
				sc.nextLine();
				if (Integer.toString(index).matches("^[1-3]{1}$")) {
					valid = true;
				} else {
					System.out.println("A megadott input érvénytelen.");
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("A megadott input érvénytelen.");
			}
		} while (!valid);
		return index;
	}

	public String getInput(Scanner sc, int index) {
		Check ch = new Check();
		boolean isValid = false;
		String userInput = "";
		System.out.println();
		do {
			try {
				System.out.print("Kérem adja meg az átváltandó számot: ");
				if (index == 1) {
					userInput = sc.nextLine();
					isValid = ch.checkUserInput(userInput, 1);
				} else {
					userInput = sc.nextLine().toUpperCase();
					isValid = ch.checkUserInput(userInput, 2);
				}
			} catch (Exception e) {
				System.out.println("A megadott input érvénytelen.");
				isValid = false;
			}
		} while (!isValid);
		return userInput;
	}

}
