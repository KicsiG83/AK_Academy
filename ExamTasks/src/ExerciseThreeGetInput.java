import java.util.Scanner;

public class ExerciseThreeGetInput {

	private static int number;
	private static int invalidNumber;
	private static boolean result;

	public static boolean isResult() {
		return result;
	}

	public static void setResult(boolean result) {
		ExerciseThreeGetInput.result = result;
	}

	public static boolean isValidUserInput() {
		return validUserInput;
	}

	public static void setValidUserInput(boolean validUserInput) {
		ExerciseThreeGetInput.validUserInput = validUserInput;
	}

	public static String getUserResult() {
		return userResult;
	}

	public static void setUserResult(String userResult) {
		ExerciseThreeGetInput.userResult = userResult;
	}

	private static boolean validUserInput;
	private static String userResult;

	public static int getNumber() {
		return number;
	}

	public static void setNumber(int num) {
		number = num;
	}

	public static int getInvalidNumber() {
		return invalidNumber;
	}

	public static void setInvalidNumber(int invNumber) {
		invalidNumber = invNumber;
	}

	public static void getInput(Scanner sc) {
		do {
			try {
				System.out.print("Kérem adjon meg egy pozitív egész számot, ami kisebb vagy egyenlő mint 10.000:");
				setNumber(sc.nextInt());
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
			}
			if (getNumber() < 1 || getNumber() > 10000) {
				if (getInvalidNumber() < 2) {
					setInvalidNumber(getInvalidNumber() + 1);
					System.out.println("\nA megadott érték invalid.\n");
					setResult(false);
				} else if (getInvalidNumber() < 5) {
					setInvalidNumber(getInvalidNumber() + 1);
					System.out.println(
							"\nA megadott érték még mindig helytelen.\nKérem olyan egész számot adjon meg, ami minimum 1, maximum 10000 lehet.\nPl: 1764\n");
					setResult(false);
				} else {
					System.out.println(
							"\nA sorozatos hibás adat megadása miatt és a program megóvása érdekében a program most leáll.\n");
					setResult(true);
				}
			} else {
				ExerciseThreeCalculator.calculate(getNumber());
				do {
					System.out.println("Szeretné újra futtatni a programot (i vagy n)?");
					System.out.print("Kérem írja ide a válaszát:");
					setUserResult(sc.nextLine());
					if (getUserResult().equals("i") || getUserResult().equals("n")) {
						if (getUserResult().equals("i")) {
							setInvalidNumber(0);
							setResult(false);
							setNumber(0);
							setValidUserInput(true);
						} else if (getUserResult().equals("n")) {
							setValidUserInput(true);
							setResult(true);
						}
					} else {
						System.out.println(
								"\nA megadott választ nem értem.\nKérem a válaszát az \"i\" vagy az \"n\" betűkkel jelezze.\nKöszönöm\n");
					}
				} while (!isValidUserInput());
			}
		} while (!isResult());
	}
}
