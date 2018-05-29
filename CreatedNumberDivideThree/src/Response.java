import java.util.Scanner;

public class Response {

	private String yes = "i";
	private String no = "n";
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

	public String getNo() {
		return no;
	}

	public boolean isValidResponse() {
		return validResponse;
	}

	public void setValidResponse(boolean validResponse) {
		this.validResponse = validResponse;
	}

	public String response(Scanner sc) {
		System.out.println("\nSzeretné újra futtatni a programot?\n");
		do {
			System.out.print("Kérem adja meg a válaszát (i vagy n): ");
			setResponse(sc.next());
			sc.nextLine();
			responseValidator(getResponse());
		} while (!validResponse);
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
