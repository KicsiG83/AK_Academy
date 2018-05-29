import java.util.Scanner;

public class Calculate {

	private String yes = "i";
	private String no = "n";
	private String strNumber = "";
	private int sumNumber = 0;
	private int[] numberss = new int[10];
	private boolean validResponse = false;
	private String userResponse;
	private boolean dividePossible = false;

	public int[] getNumberss() {
		return numberss;
	}

	public void setNumberss(int[] numberss) {
		this.numberss = numberss;
	}

	public String getUserResponse() {
		return userResponse;
	}

	public void setUserResponse(String userResponse) {
		this.userResponse = userResponse;
	}

	public boolean isDividePossible() {
		return dividePossible;
	}

	public void setDividePossible(boolean dividePossible) {
		this.dividePossible = dividePossible;
	}

	public String getYes() {
		return yes;
	}

	public void setYes(String yes) {
		this.yes = yes;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getStrNumber() {
		return strNumber;
	}

	public void setStrNumber(String strNumber) {
		this.strNumber = strNumber;
	}

	public int getSumNumber() {
		return sumNumber;
	}

	public void setSumNumber(int sumNumber) {
		this.sumNumber = sumNumber;
	}

	public boolean isValidResponse() {
		return validResponse;
	}

	public void setValidResponse(boolean validResponse) {
		this.validResponse = validResponse;
	}

	public void calculate(Scanner sc) {
		int i = 0;
		int j = 0;
		Number userInputNumber = new Number();
		Response response = new Response();
		int[] numbers = new int[10];
		do {
			userInputNumber.setNumber(userInputNumber.getInput(sc));
			for (i = userInputNumber.getNumber(); i >= 10; i--) {
				if (i % 10 == 0) {
					System.out.println(i);
					setDividePossible(true);
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
			if (userResponse.equals(getYes())) {
				i = 0;
				j = 0;
				strNumber = "";
				numbers = new int[10];
				sumNumber = 0;
			}
		} while (!userResponse.equals(response.getNo()));
	}
}
