package hu.ak_akademia.chess;

import java.util.Scanner;

public class UserInput {

	public String getUserName(Scanner sc) {
		String name = "";
		do {
			System.out.print("Kérem adja meg a játékos nevét: ");
			name = sc.nextLine();
			if (name.length() < 1) {
				System.out.println("A megadott név érvénytelen! ");
			}
		} while (name.length() < 1);
		return name;
	}

	public boolean getFigureColor(Player player, Scanner sc) {
		String userResult = "";
		boolean result = false;
		boolean isValid = false;
		System.out.println("\nBábúk színei: \n1 - Fehér\n2 - Fekete");
		do {
			System.out.print("\n" + player.getName() + " kérem adja meg melyik színű bábúval szeretne lenni: ");
			userResult = sc.nextLine();
			if (new Validator().checkFigureColor(userResult)) {
				switch (Integer.parseInt(userResult)) {
				case 1:
					result = true;
					break;
				case 2:
					result = false;
					break;
				}
				isValid = true;
			} else {
				System.out.println("A megadott válasz érvénytelen. ");
			}
		} while (!isValid);
		return result;
	}

}
