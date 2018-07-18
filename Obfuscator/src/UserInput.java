import java.util.Scanner;

public class UserInput {

	public String getUserInput() {
		Scanner sc = new Scanner(System.in);
		String userInput = "";
		do {
			System.out.print("Kérem adjon meg egy szöveget: ");
			userInput = sc.nextLine();
			if (userInput.equals("")) {
				System.out.println("A megadott input érvénytelen.");
			}
		} while (userInput.equals(""));
		sc.close();
		return userInput;
	}

}
