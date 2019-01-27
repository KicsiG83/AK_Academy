public class PrimeNumberValidator {

	private int db = 0;

	public static void main(String[] args) {
		new PrimeNumberValidator().run();
	}

	private void run() {
		for (int i = 1; i <= 50; i++) {
			if (isPrime(i) == true) {
				System.out.println(db + " - " + i);
				db++;
			}
		}
	}

	private boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		for (int possibleDivisor = 2; possibleDivisor <= Math.sqrt(number); possibleDivisor++) {
			if (number % possibleDivisor == 0) {
				return false;
			}
		}
		return true;
	}
}
