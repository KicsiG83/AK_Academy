import java.util.Scanner;

public class AverageOfSomeNumbersOne {

	static Scanner sc;
	static int number;

	public static void main(String[] args) {

		int i = 1;
		int sumNumber = 0;
		System.out.println(
				"Be�rt sz�mok �tlag kisz�m�t�sa.\nA sz�mok bevitele addig tart, am�g a felhaszn�l� nem ad meg a konzolon 0-t.");
		do {
			System.out.print("\nK�rem adja meg a sz�mot: ");
			sc = new Scanner(System.in);
			number = sc.nextInt();
			sc.nextLine();
			if (number == 0) {
				i--;
			} else {
				sumNumber = sumNumber + number;
				i++;
			}
		} while (number != 0);

		double averageNumber = sumNumber / i;
		System.out.println(averageNumber);

		sc.close();
	}
}