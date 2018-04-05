import java.util.Scanner;

public class Easter {

	public static void main(String[] args) {
		String yes = "Igen";
		String no = "Nem";

		for (int i = 0; i <= args.length - 1; i++) {
			System.out.println(args[i]);
		}
		System.out.print("\nZ�ld erd�ben j�rtam, \n" + "k�k iboly�t l�ttam, \n" + "el akart hervadni, \n" + "Szabad-e locs�lni?");
		System.out.print("\nK�rem �rja ide a v�laszt (Igen vagy Nem): ");
		Scanner sc = new Scanner(System.in);
		String result = sc.nextLine();
		if (result.equals(yes)) {
			System.out.println("Sajnos nem hoztam k�lnit :(");
		} else if (result.equals(no)) {
			System.out.println("Sebaj, am�gy se hoztam k�lnit :)");
		} else if (!result.equals(yes) || !result.equals(no)) {
			System.out.println("Nem j� a v�lasz! K�rem figyeljen a Case sensitive-it�sra :)");
		}
		sc.close();
	}
}
