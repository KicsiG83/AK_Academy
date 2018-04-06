import java.util.HashMap;
import java.util.Scanner;

public class Oszthatosag {

	static Scanner sc;
	static int number;
	static char character = 'a';
	static HashMap<Character, Integer> equationOfValues;

	public static void main(String[] args) {

		equationOfValues = new HashMap<Character, Integer>();
		int f = 1;
		System.out.println("A mostani program kisz�molja, hogy az els� sz�m oszthat�-e a m�sodik sz�mmal.\n");

		for (int i = 0; i < 2; i++) {
			System.out.print("K�rem adja meg az " + f + " sz�mot: ");
			sc = new Scanner(System.in);
			number = sc.nextInt();
			sc.nextLine();
			equationOfValues.put(character, number);
			character++;
			f++;
			if (i != 0) {
				if (equationOfValues.get('b') == 0) {
					System.out.println("0-val Tilos osztani");
					character--;
					i--;
					f--;
				}
			}
		}
		int c = equationOfValues.get('a') % equationOfValues.get('b');
		if (equationOfValues.get('a') % equationOfValues.get('b') == 0) {
			c = equationOfValues.get('a') / equationOfValues.get('b');
			System.out.println(equationOfValues.get('a') + " / " + equationOfValues.get('b') + " = " + c);
			System.out.println("Nincs marad�k");
		} else {
			c = equationOfValues.get('a') / equationOfValues.get('b');
			int d = equationOfValues.get('a') % equationOfValues.get('b');
			System.out.println(equationOfValues.get('a') + " / " + equationOfValues.get('b') + " = " + c);
			if (equationOfValues.get('a') > equationOfValues.get('b')) {
				System.out.println(d + " a marad�k");
			}
		}
		sc.close();
	}

}
