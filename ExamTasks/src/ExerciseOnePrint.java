
public class ExerciseOnePrint {

	public static void printWelcome() {
		System.out.println("Üdvözlöm én a szorzótábla vagyok.");
		System.out.println("Menüsor\n");
		System.out.println("1-es opció: 10-es szorzótábla");
		System.out.println("2-es opció: 20-as szorzótábla");
		System.out.println("3-as opció: Kilépés\n");
	}

	public static void PrintMultiplicationTable(int number) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				int k = i * j;
				System.out.print(i + " * " + j + " = " + k + " ");
				if (j % 10 == 0) {
					System.out.println();
				}
			}
		}
	}

	public static void PrintBye() {
		System.out.println("Köszönöm, hogy igénybe vette a szolgáltatásaimat.");
	}
}
