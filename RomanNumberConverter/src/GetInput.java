import java.util.Scanner;

public class GetInput {

	public static int getInput(Scanner sc) {
		System.out.println("Arabszám átkonvertáló program római számmá.");
		boolean isValid = false;
		int number = 0;
		do {
			try {
				System.out.print("Kérem adja meg az átváltandó számot: ");
				number = sc.nextInt();
				sc.nextLine();
				if (number > 0) {
					isValid = true;
				} else {
					System.out.println("A megadott szám érvénytelen.");
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("A megadott input érvénytelen.");
			}
		} while (!isValid);
		return number;
	}

}
