import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {

		System.out.print("Adjon meg egy sz�mot, hogy milyen sz�les legyen a t�glalap: ");
		Scanner widthScanner = new Scanner(System.in);
		int width  = widthScanner.nextInt();
		widthScanner.nextLine();
		System.out.print("Adjon meg egy sz�mot, hogy milyen magas legyen a t�glalap: ");
		Scanner heightScanner = new Scanner(System.in);
		int height = heightScanner.nextInt();
		heightScanner.nextLine();
		
		String star = "*";
        String stars = new String(new char[width]).replace("\0", star);
        for (int i = 1; i <= height; i++) {
            System.out.println(stars);
        }
		
		widthScanner.close();
		heightScanner.close();
	}

}
