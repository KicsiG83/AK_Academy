import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
		
		
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Battleship game!");
		System.out.println();
		new WichLevel(scanner); //a szint beépítése az később kerül hozzá
		System.out.println();
		new LetsPlay().getUserInput(scanner);
		scanner.close();
	}
}