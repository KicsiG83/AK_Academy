import java.util.Scanner;

public class Menu {

	public boolean menu(int index) {
		boolean exit = false;
		Scanner sc = new Scanner(System.in);
		GetInput gi = new GetInput();
		String userInput;
		switch(index) {
		case 1:
			System.out.println("\nArabszám konvertálása Római számmá.");
			userInput = gi.getInput(sc, index);
			new Convert().toRoman(Integer.parseInt(userInput));
			System.out.println();
			exit = false;
			break;
		case 2:
			System.out.println("Rómaiszám konvertálása Arab számmá.");
			userInput = gi.getInput(sc, index);
			System.out.println(new Convert().toArabic(userInput));
			System.out.println();
			exit = false;
			break;
		case 3:
			new Printer().printBye();
			exit = true;
		}
		return exit;
	}
	
}
