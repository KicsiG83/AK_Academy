package hu.ak_akademia.divisibility;

import java.util.Scanner;

public class UserInput {

	public int getNumber() {
		Scanner sc = new Scanner(System.in);
		boolean valid = false;
		int number = 0;
		do {
			try {
				System.out.print("Kérem adja meg a vizsgálandó számot: ");
				number = sc.nextInt();
				sc.nextLine();
				if (number < 1) {
					System.out.println("A megadott adat érvénytelen.");
				} else {
					valid = true;
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("A megadott adat érvénytelen.");
			}
		} while (!valid);
		sc.close();
		return number;
	}

}
