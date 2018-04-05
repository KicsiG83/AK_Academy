import java.util.HashMap;
import java.util.Scanner;

public class SecondDegreeEquation {

	static Scanner sc;
	static char character = 'a';
	static HashMap<Character, Integer> equationOfValues;
	static double xOne;
	static double xTwo;

	public static void main(String[] args) {

		equationOfValues = new HashMap<Character, Integer>();
		System.out.println("A mostani program c�lja meghat�rozni a \"ax2 + bx + c=0\" k�plet val�s gy�keit.\n");

		for (int i = 0; i < 3; i++) {
			System.out.print("K�rem adja meg a k�plet \"" + character + "\" �rt�k�t: ");
			sc = new Scanner(System.in);
			int number = sc.nextInt();
			sc.nextLine();
			equationOfValues.put(character, number);
			character++;
		}

		double discriminant = Math.sqrt(
				Math.pow((equationOfValues.get('b')), 2) - (4 * equationOfValues.get('a') * equationOfValues.get('c')));

		if (discriminant > 0) {
			xOne = (-equationOfValues.get('b') + discriminant) / (2 * equationOfValues.get('a'));
			xTwo = (-equationOfValues.get('b') - discriminant) / (2 * equationOfValues.get('a'));
			System.out.println("\nAz egyenlet gy�kei: " + xOne + " �s " + xTwo);
		} else if (discriminant == 0) {
			xOne = -equationOfValues.get('b') / (2 * equationOfValues.get('a'));
			System.out.println("\nAz egyenlet gy�ke: " + xOne);
		} else {
			System.out.println("\nA Diszkrimin�ns negat�v, teh�t a k�pletnek nincs val�s megold�sa.");
		}

		sc.close();
	}
}