import java.util.HashMap;
import java.util.Scanner;

public class KezSzamAtlaga {

	static Scanner sc;
	static double number;
	static char character = 'a';
	static HashMap<Character, Double> equationOfValues;

	public static void main(String[] args) {

		equationOfValues = new HashMap<Character, Double>();
		int f = 1;
		System.out.println("A mostani program kisz�molja, hogy az els� sz�m oszthat�-e a m�sodik sz�mmal.\n");

		for (int i = 0; i < 2; i++) {
			System.out.print("K�rem adja meg a(z) " + f + " sz�mot: ");
			sc = new Scanner(System.in);
			number = sc.nextInt();
			sc.nextLine();
			equationOfValues.put(character, number);
			character++;
			f++;
		}
		double atlag = (equationOfValues.get('a') + equationOfValues.get('b')) / 2;
		System.out.println(equationOfValues.get('a') + " �s " + equationOfValues.get('b') +" �tlaga = " + atlag);
	}
}