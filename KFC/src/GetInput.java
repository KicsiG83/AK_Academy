import java.util.Scanner;

public class GetInput {

	public static int getInput() {
		Scanner sc = new Scanner(System.in);
		boolean isValid = false;
		int number = 0;
		do {
			try {
				System.out.print("\nKérem adjon meg egy maximum három jegyű számot: ");
				number = sc.nextInt();
				sc.nextLine();
				int length = (int) Math.log10(number) + 1;
				if(length > 3) {
					System.out.println("A megadott szám érvénytelen.");
				}else {
					isValid = true;
				}
			}catch (Exception e) {
				sc.nextLine();
				System.out.println("A megadott input érvénytelen!");
			}
		}while(!isValid);
		sc.close();
		return number;
	}
	
}
