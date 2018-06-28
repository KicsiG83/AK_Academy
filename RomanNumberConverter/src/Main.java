import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		Printer print = new Printer();
		print.printWelcomeMessage();
		Scanner sc = new Scanner(System.in);
		int number = new GetInput().getInput();

		sc.close();
		print.printBye();

	}
}
