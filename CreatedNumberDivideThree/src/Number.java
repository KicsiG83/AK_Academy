import java.util.Scanner;

public class Number {

	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getInput(Scanner sc) {
		int number = 0;
		do {
			try {
				System.out.print("Kérem írjon be egy 100 vagy 100-nál kisebb számot: ");
				number = sc.nextInt();
				sc.nextLine();
				if (number > 100) {
					System.out.println("A megadott szám nagyobb 100-nál.");
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("A megadott input nem értelmezett.");
			}
		} while (number > 100);
		return number;
	}
}
