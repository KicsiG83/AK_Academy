import java.util.Scanner;

public class ExerciseThreeMain {

	public static void main(String[] args) {
		new ExerciseThreeMain().run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		ExerciseThreePrinter.printWelcome();
		ExerciseThreeGetInput.getInput(sc);
		ExerciseThreePrinter.PrintBye();
		sc.close();
	}
}
