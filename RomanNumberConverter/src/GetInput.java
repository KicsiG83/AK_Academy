import java.util.Scanner;

public class GetInput {

	public int getMenuIndex() {
		Scanner sc = new Scanner(System.in);
		int index = 0;
		boolean valid = false;
		System.out.println("        Menüből\n-------------------------\n1 - Arabszám konvertálása Római számra\n2 - Rómaiszám konvertálása Arab számra\n3 - Kilépés");
		do {
			try {
				System.out.print("Kérem válasszon a menüből: ");
				index = sc.nextInt();
				sc.nextLine();
				if(index < 1 && index > 3) {
					System.out.println("A megadott input érvénytelen.");
				}else {
					valid = true;
				}
			}catch (Exception e) {
				sc.nextLine();
				System.out.println("A megadott input érvénytelen.");
			}
		}while(!valid);
		return index;
	}
	
	public int getInput() {
		Scanner sc = new Scanner(System.in);
		boolean isValid = false;
		int number = 0;
		System.out.println();
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
