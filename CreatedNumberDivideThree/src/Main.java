import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner sc = new Scanner(System.in);
		Print.welcome();
		new Calculate().calculate(sc);
		Print.goodbye();
		sc.close();
	}
}