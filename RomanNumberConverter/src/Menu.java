import java.util.Scanner;

public class Menu {

	public boolean menu(int index) {
		Scanner sc = new Scanner(System.in);
		GetInput gi = new GetInput();
		if (index == 3) {
			new Printer().printBye();
		} else {
			numberConverter(index, sc, gi);
		}
		return index == 3;
	}

	private void numberConverter(int index, Scanner sc, GetInput gi) {
		if (index == 1) {
			System.out.println("\nArab szám konvertálása Római számmá.");
			new Convert().toRoman(Integer.parseInt(gi.getInput(sc, index)));
		} else {
			System.out.println("\nRómai szám konvertálása Arab számmá.");
			System.out.println(new Convert().toArabic(gi.getInput(sc, index)));
		}
		System.out.println();
	}
}
