import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Battleship game!\n");
		new WichLevel(scanner); //a szint beépítése az később kerül hozzá
		System.out.println();
		LetsPlay game = new LetsPlay();
		game.getUserInput(scanner);
		scanner.close();
	}
}