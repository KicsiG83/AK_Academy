import java.util.Scanner;

public class MaximumOfSomeNumbersOne {

	static Scanner sc;
	static double number;

	public static void main(String[] args) {

		double maxNumber = 0;
		System.out.println(
				"Be�rt sz�mok maximum�nak kikeres�se.\nA sz�mok bevitele addig tart, am�g a felhaszn�l� nem ad meg a konzolon 0-t.");
		do {
			System.out.print("\nK�rem adjon meg egy sz�mot: ");
			sc = new Scanner(System.in);
			number = sc.nextInt();
			sc.nextLine();
			if(number > maxNumber) {
				maxNumber = number;
			}
		} while (number != 0);
		sc.close();
		System.out.println("\n" + maxNumber);
	}
}