import java.util.List;
import java.util.Scanner;

public class UserInput {

	public void getUserInput(List<String> nameList) {
		System.out.println("Kérem adjon meg neveket.\nHa már nem kíván több nevet megadni, akkor üssön be egy entert.");
		Scanner sc = new Scanner(System.in);
		boolean end = false;
		String name = "";
		do {
			System.out.print("Adjon meg egy nevet: ");
			name = sc.nextLine();
			if (name.length() != 0) {
				if (new Validator().check(name)) {
					nameList.add(name);
				} else {
					System.out.println("A megadott adat érvénytelen!");
				}
			} else {
				System.out.println("Az adatbevitel befejeződött.");
				end = true;
			}
		} while (!end);
		sc.close();
	}
}
