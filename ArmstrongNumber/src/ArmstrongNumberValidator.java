import java.util.Scanner;

public class ArmstrongNumberValidator {

	static long nDigits;
	static long number;
	static long nLastDigitPow;

	public static void main(String[] args) {
		long number = getInput();
		checkNumber(number);
	}

	private static void checkNumber(long number) {
		long nSum = 0L;
		nDigits = number;
		int length = (int) (Math.log10(number) + 1);
		long nLastDigit = nDigits % 10;
		long j = number;
		nDigits = j;
		if (j == 0) {
		} else {
			length = (int) (Math.log10(j) + 1);
			for (int i = 0; i < length; i++) {
				nLastDigit = nDigits % 10;
				nDigits = nDigits / 10;
				pow(nLastDigit, length);
				nSum = nSum + nLastDigitPow;
				nLastDigitPow = 0;
			}
			if (nSum == j) {
				System.out.println("Armstong szám: " + nSum);
			} else {
				System.out.println("Nem Armstrong szám.");
			}
			nSum = 0;
		}
		j++;
	}

	private static long getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Kérem adjon meg egy vizsgálandó számot: ");
		long number = sc.nextLong();
		sc.nextLine();
		sc.close();
		return number;
	}

	private static long pow(long nLastDigit, int length) {
		int numberOfPows = 0;
		if (length == 1) {
			if (number == 0) {
				numberOfPows++;
				return 1;
			}
		}
		if (numberOfPows == 0) {
			nLastDigitPow = nLastDigit * nLastDigit;
			numberOfPows++;
		}
		do {
			nLastDigitPow = nLastDigitPow * nLastDigit;
			numberOfPows++;
		} while (numberOfPows < length - 1);
		return nLastDigitPow;
	}
}