import java.util.Scanner;

public class SumOfSomeNumbersOne {

	static Scanner sc;
	static double number;

	public static void main(String[] args) {

		double sumNumber = 0;
		System.out.println(
				"Be�rt sz�mok �sszeg�nek kisz�m�t�sa.\nA sz�mok bevitele addig tart, am�g a felhaszn�l� nem ad meg a konzolon 0-t.");
		do {
			System.out.print("\nK�rem adja meg a sz�mot: ");
			sc = new Scanner(System.in);
			number = sc.nextInt();
			sc.nextLine();
			sumNumber = sumNumber + number;
		} while (number != 0);
		sc.close();
		System.out.println("\n" + sumNumber);
	}
}