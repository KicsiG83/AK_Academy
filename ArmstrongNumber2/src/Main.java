import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Main {

	private long number;
	private long nLastDigitPow;

	public static void main(String[] args) {
		Main m = new Main();
		long startTime = System.nanoTime();
		List<Long> result = m.test();
		printTime(startTime);
		System.out.println(result.size() + " - " + result);
	}

	private List<Long> test() {
		return LongStream.range(0L, 372L).parallel().filter(number -> armstrongValidator(number)).boxed()
				.collect(Collectors.toList());
	}

	private boolean armstrongValidator(long number) {
		long temp = 0;
		long nDigits = number;
		int length = (int) (Math.log10(number) + 1);
		if (length == 1) {
			return true;
		} else {
			for (int i = 0; i < length; i++) {
				long nLastDigit = nDigits % 10;
				nDigits = nDigits / 10;
				temp = temp + calculator(nLastDigit, length);
			}
			if (temp == number) {
				return true;
			}
		}
		return false;
	}

	private long calculator(long nLastDigit, int length) {
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

	private static void printTime(long startTime) {
		System.out.println(
				"Számolási idő StreamApi-val: " + (System.nanoTime() - startTime) / 1_000_000_000 + " másodperc");
	}

}
