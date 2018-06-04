import java.util.Scanner;

public class ExerciseOneMain {

	public static void main(String[] args) {
		new ExerciseOneMain().run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		ExerciseOnePrint.printWelcome();
		ExerciseOneGetInput.close(sc);
		sc.close();
	}
	
}
