import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		Printer.welcome();
		Scanner sc = new Scanner(System.in);
		new Board(sc);
		Game.letsPlay(sc);
		Printer.bye();
		sc.close();
	}
}
