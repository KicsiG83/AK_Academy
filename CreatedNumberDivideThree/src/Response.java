import java.util.Scanner;

public class Response {

	private String yes = "i";
	private String no = "n";
	private String strNumber = "";
	private int[] numbers;
	private int sumNumber = 0;
	private boolean validResponse = false;
	private String response;
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
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

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
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

	public String response() {
		int i = 0;
		int j = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nSzeretné újra futtatni a programot?\n");
		do {
			System.out.print("Kérem adja meg a válaszát (i vagy n): ");
			setResponse(sc.next());
			sc.nextLine();
			responseValidator(getResponse());
		} while (!validResponse);
		if (getResponse().equals(getYes())) {
			i = 0;
			j = 0;
			strNumber = "";
			numbers = new int[10];
			sumNumber = 0;
		}
		return response;
	}

	public void responseValidator(String response) {
		switch (getResponse()) {
		case "i":
			setValidResponse(true);
			break;
		case "n":
			setValidResponse(true);
			break;
		default:
			setValidResponse(false);
			System.out.println("A beírt választ nem értem.");
		}
	}
}
