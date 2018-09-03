
public class Main {

	public static void main(String[] args) {
		int x = -30;
		int y = 100;
		switch (x) {
		case 4:
			y += 7;
		default:
			y += -2;
		case 2:
			y += 9;
		case 0:
			y += 100;
		}
		System.out.println("Z = " + y);
	}
}
