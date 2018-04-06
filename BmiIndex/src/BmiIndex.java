import java.util.Scanner;

public class BmiIndex {

	static Scanner sc;
	static double bmiIndex;
	static double height;
	static double weight;
	
	public static void main(String[] args) {

		int i = 0;
		System.out.println(
				"A be�rt adatok alapj�n kisz�molom a testt�meg index�t.");
		do {
			if(i == 0) {
				System.out.print("\nK�rem adja meg a magass�g�t: ");
				sc = new Scanner(System.in);
				height = sc.nextInt();
				sc.nextLine();
				height = height / 100;
			}else if(i == 1) {
				System.out.print("\nK�rem adja meg a s�ly�t: ");
				sc = new Scanner(System.in);
				weight = sc.nextInt();
				sc.nextLine();
			}
			i++;
		} while (i != 2);
		sc.close();
		bmiIndex = weight / Math.pow(height, 2);

		if(bmiIndex < 20) {
			System.out.println("\nA megadott �rt�kek alapj�n, az �n testt�meg indexe: Sov�ny.");
		}else if(bmiIndex < 25 && bmiIndex > 20) {
			System.out.println("\nA megadott �rt�kek alapj�n, az �n testt�meg indexe: �tlagos.");
		}else if(bmiIndex < 30 && bmiIndex > 25) {
			System.out.println("\nA megadott �rt�kek alapj�n, az �n testt�meg indexe: T�ls�lyos.");
		}else if(bmiIndex < 40 && bmiIndex > 30) {
			System.out.println("\nA megadott �rt�kek alapj�n, az �n testt�meg indexe: Elh�zott.");
		}else if(bmiIndex > 40) {
			System.out.println("\nA megadott �rt�kek alapj�n, az �n testt�meg indexe: K�rosan elh�zott.");
		}
		
	}
}