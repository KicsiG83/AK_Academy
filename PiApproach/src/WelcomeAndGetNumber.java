import java.util.Scanner;

public class WelcomeAndGetNumber {

	public static void welcome() {
		System.out.println("A program célja végtelen összeggel és szorzattal való közelítés.");
	}

	public static int getNumber() {
		int number = 0;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.print("\nKérem adjon meg egy egész számot: ");
				number = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("A megadott input nem értelmezhető.");
			}
		} while (number <= 0);
		sc.close();
		return number;
	}

}
