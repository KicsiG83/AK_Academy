import java.util.Scanner;

public class Easter {

	static Scanner sc;
	static String result;
	
	public static void main(String[] args) {
		String yes = "Igen";
		String no = "Nem";

		for (int i = 0; i <= args.length - 1; i++) {
			System.out.println(args[i]);
		}
		System.out.print("\nZ�ld erd�ben j�rtam, \n" + "k�k iboly�t l�ttam, \n" + "el akart hervadni, \n" + "Szabad-e locs�lni?\n");
		do {
			System.out.print("\nK�rem �rja ide a v�laszt (Igen vagy Nem): ");
			sc = new Scanner(System.in);
			result = sc.nextLine();
			if (result.equals(yes)) {
				System.out.println("\nSajnos nem hoztam k�lnit :(");
			} else if (result.equals(no)) {
				System.out.println("\nSebaj, am�gy se hoztam k�lnit :)");
			} else if (!result.equals(yes) || !result.equals(no)) {
				System.out.println("\nNem j� a v�lasz! K�rem figyeljen a Case sensitive-it�sra :)");
			}
		}while(!result.equals(yes) && !result.equals(no));
		sc.close();
	}
}