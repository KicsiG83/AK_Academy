import java.util.Arrays;
import java.util.Scanner;

public class BinaryText {

	static int menuNumber;
	static Scanner sc;

	public static void main(String[] args) {

		greetingAndMenu();
		do {
			System.out.print("\nK�rem v�lasszon a men�b�l: ");
			sc = new Scanner(System.in);
			menuNumber = sc.nextInt();
			sc.nextLine();

			switch (menuNumber) {
			case 1:
				textToBinary();
				break;
			case 2:
				binaryToText();
				break;
			case 3:
				System.out.println("\nK�sz�n�m, hogy ig�nybe vette a szolg�lataimat :) " + "\nViszontl�t�sra!");
				break;
			default:
				System.out.println("Hib�s men�pont");
				break;
			}
		} while (menuNumber != 3);
		sc.close();
	}

	private static void binaryToText() {
		System.out.print("K�rem �rja ide a ford�tand� bin�ris k�dot (sz�k�z�k n�lk�l): ");
		String input = sc.next();
		sc.nextLine();
		StringBuilder sb = new StringBuilder();
		Arrays.stream(input.split("(?<=\\G.{8})")).forEach(s -> sb.append((char) Integer.parseInt(s, 2)));
		Arrays.stream(input.split("(?<=\\G.{8})")).forEach(s -> System.out.print((char) Integer.parseInt(s, 2)));
		System.out.println();
	}

	private static void greetingAndMenu() {
		System.out.println("�dv�zl�m �n a ford�t� vagyok!\nOlvashat� form�tumot ford�tok �t Bin�ris nyelvre vagy ford�tva.\n");
		System.out.println("               MEN�SOR\n" + "**********************************\n" + "1 - Sz�veg ford�t�sa Bin�ris k�dra\n" + "2 - Bin�ris k�d ford�t�sa sz�vegre\n" + "3 - Kil�p�s");
	}

	private static void textToBinary() {
		System.out.println("Sz�veg ford�t�sa Bin�ris k�dra");
		System.out.print("K�rem �rja ide a ford�tand� sz�veget: ");
		String s = sc.next();
		sc.nextLine();

		byte[] bytes = s.getBytes();
		StringBuilder binary = new StringBuilder();
		for (byte b : bytes) {
			int val = b;
			for (int i = 0; i < 8; i++) {
				binary.append((val & 128) == 0 ? 0 : 1);
				val <<= 1;
			}
			binary.append(' ');
		}
		System.out.println("'" + s + "' to binary: " + binary);
	}

}
