import java.util.Scanner;

public class Menu {

	public void menu() {
		System.out.println(
				"\nDigitális óra menü\n------------------\n1 - Pontos idő\n2 - Stopper\n3 - Visszaszámláló\n4 - Kilépés");
	}

	public int getMenuNumber(Scanner sc) {
		menu();
		boolean isValid = false;
		int index = 0;
		do {
			try {
				System.out.print("\nKérem válasszon a menüből: ");
				index = sc.nextInt();
				sc.nextLine();
				if (index < 1 || index > 4) {
					System.out.println("A megadott menü index érvénytelen.");
					isValid = false;
				} else {
					isValid = true;
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("A megadott menü index érvénytelen.");
			}
		} while (!isValid);
		return index;
	}

	public void menuController(int number, Scanner sc) throws InterruptedException {
		Uploader ul = new Uploader();
		switch (number) {
		case 1:
			new ExactTime();
			ul.setStrArray(8);
			ul.uploadCharachters(1);
			ul.printAsciiNumber(ul.getStrArray(), number);
			break;
		case 2:
			new Stopper(2, ul);
			break;
		case 3:
			Counter ct = new Counter(sc);
			ul.setStrArray(8);
			ul.counterPrinter(ct);
			break;
		}
	}

}
