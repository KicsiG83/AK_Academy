import java.util.Scanner;
import java.util.Set;

public class UserInput {

	public void getUserInput(Set<Integer> numbers) {
		System.out.println(
				"Kérem adjon meg egész számokat.\nHa már nem kíván több nevet megadni, akkor adjon be egy 0-t.");
		Scanner sc = new Scanner(System.in);
		int number = 1;
		do {
			try {
				System.out.print("Adjon meg egy számot: ");
				number = sc.nextInt();
				sc.nextLine();
				if (number != 0) {
					numbers.add(number);
				} else {
					System.out.println("\nAz adatbevitel befejeződött.\n");
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("A megadott adat érvénytelen!");
			}
		} while (number != 0);
		sc.close();
	}
}
