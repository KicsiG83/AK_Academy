import java.util.Scanner;

public class Menu {

	public boolean menu(int index) {
		boolean exit = false;
		Scanner sc = new Scanner(System.in);
		GetInput gi = new GetInput();
		switch (index) {
		case 1:
			exit = numberConverter(index, sc, gi, "\nArab szám konvertálása Római számmá.");
			break;
		case 2:
			exit = numberConverter(index, sc, gi, "\nRómai szám konvertálása Arab számmá.");
			break;
		case 3:
			new Printer().printBye();
			exit = true;
		}
		return exit;
	}

	private boolean numberConverter(int index, Scanner sc, GetInput gi, String message) {
		String userInput;
		System.out.println(message);
		userInput = gi.getInput(sc, index);
		if (index == 1) {
			new Convert().toRoman(Integer.parseInt(userInput));
		} else {
			System.out.println(new Convert().toArabic(userInput));
		}
		System.out.println();
		return false;
	}
}
