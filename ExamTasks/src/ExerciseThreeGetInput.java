import java.util.Scanner;

public class ExerciseThreeGetInput {

	public static void close(Scanner sc) {
		int userResult = 0;
		do {
			userResult = getMenuIndex(sc);
		} while (userResult != 2);
	}
	
	public static int getMenuIndex(Scanner sc) {
		int result = 0;
		do {
			try {
				System.out.print("Kérem válasszon a menüből: ");
				result = sc.nextInt();
				sc.nextLine();
				if (result > 2 || result < 1) {
					System.out.println("A megadott adat érvénytelen");
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("A megadott adat nem értelmezett.");
			}
		} while (result >= 2 && result < 1);
		switch (result) {
		case 1:
			getNumber(sc);
			System.out.println("Kívánja újra futtatni a programot?");
			return result;
		case 2:
			return result;
		}
		return result;
	}

	public static void getNumber(Scanner sc) {
		int number = 0;
		int invalidInput = 0;
		boolean isValidUserNumber = false;
		do {
			try {
				System.out.print("Kérem adjon meg egy számot: ");
				number = sc.nextInt();
				sc.nextLine();
				if (number < 1 || number > 10000) {
					if (invalidInput < 2) {
						System.out.println("A megadott adat hibás.");
						invalidInput++;
					} else if (invalidInput < 5) {
						System.out
								.println("A megadott adat még mindig hibás, kérem egy pozitív egész számot adjon meg.\n"
										+ "A megadott érték nem teljesül az alábbi feltételek egyikének:\n"
										+ "- A megadott szám nem egészszám\n" + "- A megadott szám nem pozitív\n"
										+ "- A 0-nak nincs előjele\n"
										+ "- A megadott szám nagyobb mint 10.000.\nPl: 1764\n");
						invalidInput++;
					} else {
						System.out.println("A program megóvása érdekében a program most leáll.");
						// Kilépést beépíteni
					}
				}
			} catch (Exception e) {
				invalidInput++;
				sc.nextLine();
				System.out.println("A megadott input érvénytelen.");
			}
			if (number >= 1 && number <= 10000) {
				isValidUserNumber = true;
			}
		} while (!isValidUserNumber);
		calculate(number);
	}

	public static void calculate(int number) {
		if (number == 1764) {
			System.out.println("BINGO!");
		} else {
			int sqrt = (int) Math.sqrt(number);
			int intSqrt = (int) Math.pow(sqrt, 2);
			if (number == intSqrt) {
				System.out.println("Ez egy négyzetszám! A " + sqrt + " négyzete.");
			} else {
				System.out.println("A megadott szám nem négyzetszám.");
				for (int i = number; i <= 10000; i++) {
					int x = (int) Math.sqrt(i);
					intSqrt = (int) Math.pow(x, 2);
					if (i == intSqrt) {
						System.out.println("A legközelebbi nagyobb négyzetszám a " + i + ". Ami a " + x + " négyzete.");
						break;
					}
				}
				for (int j = number; j > 0; j--) {
					int x = (int) Math.sqrt(j);
					intSqrt = (int) Math.pow(x, 2);
					if (j == intSqrt) {
						System.out.println("A legközelebbi kisebb négyzetszám a " + j + ". Ami a " + x + " négyzete.");
						break;
					}
				}
			}
		}
	}
}
