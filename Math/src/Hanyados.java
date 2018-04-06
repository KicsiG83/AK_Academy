import java.util.HashMap;
import java.util.Scanner;

public class Hanyados {
	
	static Scanner sc;
	static int number;
	static char character = 'a';
	static HashMap<Character, Integer> equationOfValues;
	
	public static void main(String[] args) {
	
		equationOfValues = new HashMap<Character, Integer>();
		int f = 1;
		System.out.println("A mostani program kisz�molja, hogy az els� sz�m oszthat�-e a m�sodik sz�mmal.\n");

		for (int i = 0; i < 2; i++) {
			if(f == 1) {
				System.out.print("K�rem adja meg a sz�mot: ");
			}else {
				System.out.print("K�rem adja meg a h�nyadost: ");
			}
			sc = new Scanner(System.in);
			number = sc.nextInt();
			sc.nextLine();
			equationOfValues.put(character, number);
			character++;
			f++;
		}
		
		for (int b = 0; b <= equationOfValues.get('b'); b++) {
			long c = (int) Math.pow(equationOfValues.get('a'), b);
			System.out.println(equationOfValues.get('a') + " - " + b + " hatv�nya: " + c);
		}
		sc.close();
	}
}