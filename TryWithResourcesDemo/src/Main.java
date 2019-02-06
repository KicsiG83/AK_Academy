import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		tryCatchBlock();
//		tryWithResourcesBlock();

	}

	private static void tryWithResourcesBlock() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Írj ide valamit: ");
			int result = sc.nextInt();
			System.out.println(result);
		} catch (InputMismatchException e) {
			System.out.println("Ez nem egy szám!");
		}
	}

	private static void tryCatchBlock() {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.print("Írj ide valamit: ");
			int result = sc.nextInt();
			System.out.println(result);
		} catch (InputMismatchException e) {
			System.out.println("Ez nem egy szám!");
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
