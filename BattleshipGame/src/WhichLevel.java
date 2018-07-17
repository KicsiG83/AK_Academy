import java.util.Scanner;

public class WhichLevel {

	int level;

	WhichLevel(Scanner scanner) {
		System.out.println("Ther are 3 levels in this game.\n 1 - easy\n 2 - medium\n 3 - hard");
		do {
			try {
				System.out.print("Please insert what level you wan to play: ");
				level = scanner.nextInt();
				scanner.nextLine();
			} catch (Exception e) {
				scanner.nextLine();
			}
		} while (!new Validators().levelValidator(level));
	}
}
