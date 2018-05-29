import java.util.Scanner;

public class Original {

	static Scanner sc = new Scanner(System.in);
	static int i = 0;
	static int j = 0;
	static String yes = "i";
	static String no = "n";
	static String strNumber = "";
	static int[] numbers;
	static int sumNumber = 0;
	static boolean validResponse = false;

	public static void main(String[] args) {
		System.out.println("Alkotott szám hárommal való oszthatóságának vizsgálata.\n");
		Calculate calc = new Calculate();
		calc.calculate();
//		String userResponse;
//		boolean dividePossible = false;
//		numbers = new int[10];
//		Number userInputNumber = new Number();
//		Response response = new Response();
//
//
//		do {
//			userInputNumber.setNumber(userInputNumber.getInput(sc));
//			for (i = userInputNumber.getNumber(); i >= 10; i--) {
//				if (i % 10 == 0) {
//					System.out.println(i);
//					dividePossible = true;
//					numbers[j] = i;
//					j++;
//					sumNumber = sumNumber + (i / 10);
//				}
//			}
//			if (dividePossible) {
//				for (int i = numbers.length - 1; i >= 0; i--) {
//					if (numbers[i] != 0) {
//						strNumber = strNumber + numbers[i];
//					}
//				}
//				System.out.println(strNumber);
//				if (sumNumber % 3 == 0) {
//					System.out.println("\nA szám osztható 3-mal.");
//				} else {
//					System.out.println("\nA szám nem osztható 3-mal.");
//				}
//			}
//			if (!dividePossible) {
//				System.out.println("A megadott szám és az az alatti számok közül egyik sem osztható 10-zel.");
//			}
//			userResponse = response.response();
//		} while (!userResponse.equals(response.getNo()));
		System.out.println("Köszönöm, hogy segíthettem :) ");
		sc.close();
	}
}