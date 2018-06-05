import java.util.Scanner;

public class ExerciseThreeMain {

	public static void main(String[] args) {
		new ThreeGoodMain().run();
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Négyzetszám vizsgálati program.");
		ExerciseThreeGetInput.getInput(sc);
		ExerciseThreePrinter.PrintBye();
		sc.close();
	}
}
