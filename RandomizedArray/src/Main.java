import java.util.Random;

public class Main {
	public static void main(String[] args) {
		String[] name = {"M. Andris", "Balázs", "Zoli", "András","Geri","Artúr","Kati", "Karcsi"};
		System.out.println(name[new Random().nextInt(name.length)]);
	}
}
