import java.util.Scanner;
import java.util.stream.IntStream;

public class MaxMinSumAvg {

	public static void main(String[] args) {
		
		int numberIndex = 1;
		int[] numberArray = new int[10];
		Scanner sc = new Scanner(System.in);
		int max = numberArray[0];
		
		for (int i = 0; i < numberArray.length; i++) {
			System.out.print("K�rem adja meg a(z) " + numberIndex + " vizsg�land� sz�mot: ");
			int inputNumber = sc.nextInt();
			sc.nextLine();
			numberIndex++;
			numberArray[i] = inputNumber;
		}

		int sumNumber = IntStream.of(numberArray).sum();


		for (int i = 0; i <= numberArray.length - 1; i++) {
			if (numberArray[i] > max) {
				max = numberArray[i];
			}
		}

		int min = max;
		for (int i = 0; i <= numberArray.length - 1; i++) {
			if (numberArray[i] < min) {
				min = numberArray[i];
			}
		}

		System.out.println("A t�mb minimuma: " + min);
		System.out.println("A t�mb maximuma: " + max);
		System.out.println("A t�mb �sszege: " + sumNumber);
		System.out.println("A t�mb �tlaga: " + Math.round(sumNumber / numberArray.length));

		sc.close();

	}
}