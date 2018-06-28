import java.util.Scanner;

public class Menu {

	public boolean menu(int index) {
		boolean exit = false;
		Scanner sc = new Scanner(System.in);
		GetInput gi = new GetInput();
		switch(index) {
		case 1:
			System.out.println("\nArabszám konvertálása Római számmá.");
			int number = gi.getInput(sc, index);
			new Convert().toRoman(number);
			System.out.println();
			exit = false;
			break;
		case 2:
			System.out.println("Rómaiszám konvertálása Arab számmá.");
			System.out.println("Fejlesztés alatt!");
			exit = false;
			break;
		case 3:
			new Printer().printBye();
			exit = true;
		}
		return exit;
	}
	
}
