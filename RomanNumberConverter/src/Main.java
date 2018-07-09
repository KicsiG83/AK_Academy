import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		Printer print = new Printer();
		Scanner sc = new Scanner(System.in);
		print.printWelcomeMessage();
		print.printMenu();
		boolean exit = false;
		do {
			exit = new Menu().menu(new GetInput().getMenuIndex(sc));
		} while (!exit);
		sc.close();
	}
}
