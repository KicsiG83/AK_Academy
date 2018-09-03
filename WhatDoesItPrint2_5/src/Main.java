
public class Main {

	public static void main(String[] args) {
		boolean bar = false;
		do {
			int z = -2;
			boolean foo = (100 / 40) * 2 < 20;
			while (foo) {
				foo = ++z <= -1;
				System.out.println(bar + " - " + z + " " + foo);
			}
			bar = !bar;
		} while (!bar);
	}
}
