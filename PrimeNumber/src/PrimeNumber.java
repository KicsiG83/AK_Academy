import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Kérem adjon meg egy számot: ");
		int number = scanner.nextInt();
		scanner.nextLine();
		if (isPrime(number) == true) {
			System.out.println("A " + number + " Prím szám");
		} else {
			System.out.println("A " + number + " nem prím szám");
		}
		scanner.close();
	}

	static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		if (number == 2) {
			return true;
		}
		if (number % 2 != 0) {
			for (int possibleDisvisor = 2; possibleDisvisor <= Math.sqrt(number) + 1; possibleDisvisor++) {
				if (number % possibleDisvisor == 0) {
					return false;
				}
			}
		}
		return true;
	}

}
