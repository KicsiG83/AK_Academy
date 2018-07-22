import java.util.Scanner;

public class UserInterface {

	public int getUserInput() {
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		boolean validUserInput = false;
		do {
			try {
				System.out.print("Kérem adja meg mennyi számot ellenőrizzek: ");
				userInput = sc.nextInt();
				sc.nextLine();
				if(userInput<=0) {
					System.out.println("A megadott érték hibás.");
					validUserInput = false;
				}else {
					validUserInput = true;
				}
			}catch (Exception e) {
				sc.nextLine();
				System.out.println("A megadott érték hibás.");
				validUserInput = false;
			}
		}while(!validUserInput);
		sc.close();
		return userInput;
	}
	
}
