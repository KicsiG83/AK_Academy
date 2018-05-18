import java.util.stream.IntStream;

public class TaxNumberGenerator {

	static int min = 0;
	static int max = 7;
	static String strTaxOffice;

	public static void main(String[] args) {
		int lastDigit;
		int vatNumber = (int) (Math.random() * (5)) + 1;
		int validTaxNumber;
		int[] numbers = new int[max];
		int[] sumNumbers = new int[max];
		int[] multiplier = { 9, 7, 3, 1, 9, 7, 3 };

		generateTaxOffice();
		generateNumbers(numbers);
		fillMultipliedNumbers(sumNumbers, multiplier, numbers);
		lastDigit = getLastDigit(sumNumbers);
		validTaxNumber = createValidTaxNumber(lastDigit, numbers);
		String strFullVatNumber = validTaxNumber + "-" + vatNumber + "-" + strTaxOffice;
		System.out.print(strFullVatNumber);
	}

	private static void generateTaxOffice() {
		int taxOffice = (int) (Math.random() * (44 - 2) + 1) + 2;
		if (taxOffice < 10) {
			strTaxOffice = "0" + taxOffice;
		} else if (taxOffice == 21) {
			strTaxOffice = "51";
		} else {
			strTaxOffice = "" + taxOffice;
		}
	}

	private static int createValidTaxNumber(int lastDigit, int[] numbers) {
		String strValidTaxNumber;
		int validTaxNumber;
		String strSevenNumber = "";
		for (int i = 0; i < numbers.length; i++) {
			strSevenNumber = strSevenNumber + numbers[i];
		}

		if (lastDigit == 0) {
			strValidTaxNumber = strSevenNumber + lastDigit;
			validTaxNumber = Integer.parseInt(strValidTaxNumber);
		} else {
			lastDigit = 10 - lastDigit;
			strValidTaxNumber = strSevenNumber + lastDigit;
			validTaxNumber = Integer.parseInt(strValidTaxNumber);
		}
		return validTaxNumber;
	}

	private static int getLastDigit(int[] sumNumbers) {
		int sumNumber = IntStream.of(sumNumbers).sum();
		int lastDigit = (int) (sumNumber % 10);
		return lastDigit;
	}

	private static void fillMultipliedNumbers(int[] sumNumbers, int[] multiplier, int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			sumNumbers[i] = numbers[i] * multiplier[i];
		}
	}

	private static void generateNumbers(int[] numbers) {
		for (int i = min; i < numbers.length; i++) {
			int number = (int) (Math.random() * (max - min + 1)) + min;
			numbers[i] = number;
		}
	}
}
