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
				if (index < 1 && index > 3) {
					System.out.println("A megadott input érvénytelen.");
				} else {
					valid = true;
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
		int number = 0;
		String userInput = "";
		System.out.println();
		do {
			try {
				System.out.print("Kérem adja meg az átváltandó számot: ");
				if (index == 1) {
					userInput = sc.nextLine();
					isValid = ch.checkArabicNumber(userInput);
					if (isValid) {
						number = Integer.parseInt(userInput);
						if (number > 0) {
							isValid = true;
						} else {
							System.out.println("A megadott szám érvénytelen.");
							isValid = false;
						}
					}
				} else {
					userInput = sc.nextLine().toUpperCase();
					isValid = new Check().checkRomanNumber(userInput);
				}
			} catch (Exception e) {
				System.out.println("A megadott input érvénytelen.");
				isValid = false;
			}
		} while (!isValid);
		return userInput;
	}

}
