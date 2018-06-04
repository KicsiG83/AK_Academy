import java.util.Scanner;

public class ExerciseOneGetInput {

	public static void close(Scanner sc) {
		int userResult = 0;
		do {
			userResult = getInput(sc);
		} while (userResult != 3);

	}

	public static int getInput(Scanner sc) {
		int result = 0;
		do {
			try {
				System.out.print("Kérem válasszon a menüből: ");
				result = sc.nextInt();
				sc.nextLine();
				if (result > 3 || result < 1) {
					System.out.println("A megadott adat érvénytelen");
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("A megadott adat nem értelmezett.");
			}
		} while (result >= 3 && result < 1);
		switch (result) {
		case 1:
			ExerciseOnePrint.PrintMultiplicationTable(10);
			return result;
		case 2:
			ExerciseOnePrint.PrintMultiplicationTable(20);
			return result;
		case 3:
			ExerciseOnePrint.PrintBye();
			return result;
		}
		return result;
	}
}
