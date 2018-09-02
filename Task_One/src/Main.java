import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		new Calculator().calculate(new UserInput().userInput(sc));
		sc.close();
	}
}
