import java.util.Scanner;

public class DetermineAllDivisors {

	public static void main(String[] args) {
		System.out.println("�rjon be egy sz�mot, aminek az oszt�it megkereshetem: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.nextLine();
		int[] divisors = determineDivisors(number);
		for (int divisor : divisors) {
			if (divisor == 0) {				//Amint az oszt� el�ri a 0-�t le�ll�tja a programot.
				break;
			}
			System.out.println(divisor);
		}
		scanner.close();
	}

	static int[] determineDivisors(int number) {
		int[] divisors = new int[number / 2];
		int counter = 0;
		for (int possibleDivisor = 2; possibleDivisor <= number / 2; possibleDivisor++) {
			if (number % possibleDivisor == 0) {
				divisors[counter++] = possibleDivisor; // a counter �rt�ke lesz a t�mb indexe, amit minden lefut�sn�l n�velem!
			}
		}
		return divisors;
	}
}
