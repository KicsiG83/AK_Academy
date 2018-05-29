import java.util.Scanner;

public class Original {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Original original = new Original();
		original.run();
	}
	
	private void run() {
		Print.welcome();
		Calculate calculator = new Calculate();
		calculator.calculate(sc);
		Print.goodbye();
		sc.close();
	}
}