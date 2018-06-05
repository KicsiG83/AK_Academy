import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = 0;
		int invalidNumber = 0;
		boolean result = false;
		do {
			System.out.print("Kérem adjon meg egy egész számot, ami kisebb vagy egyenlő mint 10.000:");
			number = sc.nextInt();
			sc.nextLine();
			if (number < 1 || number > 10000) {
				if (invalidNumber < 2) {
					invalidNumber++;
					System.out.println("\nA megadott érték invalid.\n");
					result = false;
				} else if (invalidNumber < 5) {
					invalidNumber++;
					System.out.println(
							"\nA megadott érték még mindig helytelen.\nKérem olyan egész számot adjon meg, ami minimum 1, maximum 10000 lehet.\nPl: 1764\n");
					result = false;
				} else {
					System.out.println(
							"\nA sorozatos hibás adat megadása miatt és a program megóvása érdekében a program most leáll.\n");
					result = true;
				}
			} else {
				String userResult;
				calculate(number);
				boolean validUserInput = false;
				do {
					System.out.println("Szeretné újra futtatni a programot (i vagy n)?");
					System.out.print("Kérem írja ide a válaszát:");
					userResult = sc.nextLine();
					if(userResult.equals("i") || userResult.equals("n")) {
						if (userResult.equals("i")) {
							result = false;
							validUserInput = true;
						} else if(userResult.equals("n")){
							validUserInput = true;
							result = true;
						}
					}
					else {
						System.out.println("\nA megadott választ nem értem.\nKérem a válaszát az \"i\" vagy az \"n\" betűkkel jelezze.\nKöszönöm\n");
					}
				} while (!validUserInput);
			}
		} while (!result);

		ExerciseThreePrinter.PrintBye();
		sc.close();
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
