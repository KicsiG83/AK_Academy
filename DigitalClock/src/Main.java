import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		new Main().run();
	}

	public void run() throws InterruptedException {
		Menu mn = new Menu();
		Messages msg = new Messages();
		Scanner sc = new Scanner(System.in);
		msg.printWelcome();
		int menuNumber = 0;
		do {
			menuNumber = mn.getMenuNumber(sc);
			if (menuNumber != 4) {
				mn.menuController(menuNumber, sc);
			}
		} while (menuNumber != 4);

		msg.printBye();
		sc.close();
	}

}
