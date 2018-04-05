import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("K�rem adjon meg egy sz�mot: ");
		int number = scanner.nextInt();
		scanner.nextLine();
		if (isPrime(number) == true) {
			System.out.println("A " + number + " Pr�m sz�m");
		} else {
			System.out.println("A " + number + " nem pr�m sz�m");
		}
		scanner.close();
	}

	static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		for (int possibleDisvisor = 2; possibleDisvisor < Math.sqrt(number); possibleDisvisor++) {
			if (number % possibleDisvisor == 0) {
				return false;
			}
		}
		return true;
	}

}
