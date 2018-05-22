public class PiApproach {

	static int number = 0;

	public static void main(String[] args) {
		WelcomeAndGetNumber.welcome();
		int input = WelcomeAndGetNumber.getNumber();
		new Euler(input);
		new Liebniz(input);
//		MathematicalCalculation.wallisLine(input);
//		MathematicalCalculation.vietleLine(input);
	}
}
