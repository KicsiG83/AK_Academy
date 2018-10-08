import java.util.Scanner;

public class UserInput {

	public String userInput(Scanner sc) {
		String result = "";
		do {
			System.out.print("Kérem adjon meg egy hosszú mondatot: ");
			result = sc.nextLine();
			if (result.length() < 1) {
				System.out.println("Érvénytelen paraméter.");
			}
		} while (result.length() < 1);
		sc.close();
		return result;
	}
}
