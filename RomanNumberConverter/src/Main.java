import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		Printer print = new Printer();
		Menu menu = new Menu();
		GetInput gi = new GetInput();
		Scanner sc = new Scanner(System.in);
		print.printWelcomeMessage();
		print.printMenu();
		boolean exit = false;
		do {
			exit = menu.menu(gi.getMenuIndex(sc));
		}while(!exit);

		sc.close();

	}

}
