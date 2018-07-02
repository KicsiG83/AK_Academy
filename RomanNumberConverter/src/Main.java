import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		new Main().run();
		
		String phoneNumber = "1235678";
		boolean valid =  phoneNumber.matches("^([1-9]{1}[\\d]{7})$");
		System.out.println(valid);
		
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
		} while (!exit);
		sc.close();
	}
}
