import java.util.Scanner;
import java.util.Arrays;

public class Reservoir {

	static int number;
	static int zero = 0;
	static int ten = 10;

	public static void main(String[] args) {

		char[][] reservoirArray = new char[10][10];
		int[] reservoirInt = new int[10];

		System.out.println("�dv�zl�m �n a sz�m�t�g�p vagyok. \nA mostani programmal kisz�moljuk egy v�zt�rol� kapacit�s�t.\n ");
		System.out.println("               MEN�SOR\n***********************************\n1 - Ha �n szeretne adatokat megadni\n2 - V�letlen sz�m gener�l�s ");
		Scanner sc;
		int userResponse;

		do {
			System.out.print("\nK�rem v�lasszon a men�b�l: ");
			sc = new Scanner(System.in);
			userResponse = sc.nextInt();
			sc.nextLine();

			switch (userResponse) {
			case 1:
				userFiller(reservoirInt, sc);
				break;
			case 2:
				randomFiller(reservoirInt, zero, ten);
				break;
			default:
				System.out.println("T�ves men�pont!");
				break;
			}
			fieldCreator(reservoirArray, reservoirInt); // A terep fel�lt�se a megadott sz�mok alapj�n
			fieldPlotter(reservoirArray); 				// A terep kirajzol�sa

		} while (userResponse != 1 && userResponse != 2);
		System.out.println("\nK�sz�n�m, hogy ig�nybe vette a szolg�ltat�saimat.\nViszont l�t�sra.");
		sc.close();
	}

	private static void fieldPlotter(char[][] reservoirArray) {
		for (int j = 0; j < reservoirArray.length; j++) {
			System.out.println(reservoirArray[j]);
		}
	}

	private static void fieldCreator(char[][] reservoirArray, int[] reservoirInt) {
		for (int i = 0; i < reservoirArray.length; i++) {
			for (int j = reservoirArray.length - reservoirInt[i]; j < reservoirInt.length; j++) {
				reservoirArray[j][i] = '*';
			}
		}
	}

	private static void randomFiller(int[] reservoirInt, int zero, int ten) {
		System.out.println("\nV�letlen sz�mokkal t�lt�m fel a v�zt�roz�t!\n");
		for (int i = 0; i < reservoirInt.length; i++) {
			number = (int) (Math.random() * (ten - zero + 1)) + zero;
			reservoirInt[i] = number;
		}
	}

	private static void userFiller(int[] reservoirInt, Scanner sc) {
		System.out.println("\n�n t�lti fel a v�zt�roz� t�mb�t adatokkal!\nK�rem adjon meg 0 - 10 k�z�tti sz�mokat a talaj mint�zat�hoz.\n");
		for (int i = 0; i < reservoirInt.length; i++) {
			int f = i + 1;
			System.out.print(f + ": ");
			number = sc.nextInt();
			if (number > 10 || number < 0) {
				System.out.println("Na na, ne csaljunk :) ");
				i = i - 1;
			} else {
				reservoirInt[i] = number;
			}
		}
	}

}
