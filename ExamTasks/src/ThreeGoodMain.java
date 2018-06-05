import java.util.Scanner;

public class ThreeGoodMain {

	public static void main(String[] args) {
		new ThreeGoodMain().run();
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Négyzetszám vizsgálati program.");
		ThreeGoodGetInput.getInput(sc);
		ExerciseThreePrinter.PrintBye();
		sc.close();
	}
}
