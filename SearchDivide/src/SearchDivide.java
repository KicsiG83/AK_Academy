import java.util.Scanner;

public class SearchDivide {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Tudjuk meg egy sz�m legkisebb �s legnagyobb oszt�j�t!");
		System.out.print("K�rem �rjon be egy sz�mot: ");
		int number = scanner.nextInt();
		scanner.nextLine();
		if (isPrime(number)) {
			System.out.println("A(z) " + number + " Pr�m sz�m, a legkisebb oszt�ja 1 a legnagyobb " + number);
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
						System.out.println("A(z) " + number + " legkisebb oszt�ja: " + i);
						break;
				}
			}
			if (number < 0) {
				int negativeNumber = number * (-1);
				for (int i = negativeNumber - 1; i < negativeNumber; i--) {
					if (negativeNumber == 1) {
						System.out.println("Az -" + negativeNumber + " legkisebb �s legnagyobb oszt�ja �nmaga.");
						break;
					} else if (negativeNumber % i == 0) {
						System.out.println("A(z) -" + negativeNumber + " legnagyobb oszt�ja: -" + i);
						break;
					}
				}
				for (int i = 2; i < negativeNumber; i++) {
					if (negativeNumber % i == 0) {
						System.out.println("A(z) -" + negativeNumber + " legkisebb oszt�ja: -" + i);
						break;
					}
				}
			}
			for (int i = number - 1; i < number; i--) {
				if (number == 1) {
					System.out.println("Az " + number + " legkisebb �s legnagyobb oszt�ja �nmaga.");
					break;
				} else if (number == 0) {
					System.out.println("A megadott sz�m a 0.");
					break;

				} else if (number % i == 0) {
					System.out.println("A(z) " + number + " legnagyobb oszt�ja: " + i);
					break;
				}
			}
		}
		scanner.close();
	}

	static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		for (int possibleDisvisor = 2; possibleDisvisor < number; possibleDisvisor++) {
			if (number % possibleDisvisor == 0) {
				return false;
			}
		}
		return true;
	}
}
