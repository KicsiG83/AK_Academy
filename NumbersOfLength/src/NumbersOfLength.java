import java.util.Scanner;

public class NumbersOfLength {

	public static void main(String[] args) {

		System.out.print("�rj be egy sz�mot: ");
		Scanner scanner = new Scanner(System.in);
		long number = Math.abs(scanner.nextLong());
		scanner.nextLine();
		long numberOfDigits;
		for (numberOfDigits = 0; 0 < number; number /= 10, numberOfDigits++) {

		}
		System.out.println("A megadott sz�m " + numberOfDigits + " sz�mjegy�!");
		scanner.close();

	}

}
