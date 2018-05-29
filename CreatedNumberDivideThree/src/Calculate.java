import java.util.Scanner;

public class Calculate {

	public void calculate(Scanner sc) {
		int i = 0;
		int j = 0;
		String yes = "i";
		int sumNumber = 0;
		String userResponse;
		String strNumber = "";
		Number userInputNumber = new Number();
		Response response = new Response();
		boolean dividePossible = false;
		int[] numbers = new int[10];
		do {
			userInputNumber.setNumber(userInputNumber.getInput(sc));
			for (i = userInputNumber.getNumber(); i >= 10; i--) {
				if (i % 10 == 0) {
					System.out.println(i);
					dividePossible = true;
					numbers[j] = i;
					j++;
					sumNumber = sumNumber + (i / 10);
				}
			}
			if (dividePossible) {
				for (int k = numbers.length - 1; k >= 0; k--) {
					if (numbers[k] != 0) {
						strNumber = strNumber + numbers[k];
					}
				}
				System.out.println(strNumber);
				if (sumNumber % 3 == 0) {
					System.out.println("\nA szám osztható 3-mal.");
				} else {
					System.out.println("\nA szám nem osztható 3-mal.");
				}
			} else {
				System.out.println("A megadott szám és az az alatti számok közül egyik sem osztható 10-zel.");
			}
			userResponse = response.response(sc);
			if (userResponse.equals(yes)) {
				i = 0;
				j = 0;
				strNumber = "";
				numbers = new int[10];
				sumNumber = 0;
			}
		} while (!userResponse.equals(response.getNo()));
	}
}
