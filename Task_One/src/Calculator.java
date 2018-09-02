
public class Calculator {

	public void calculate(int number) {
		for (int i = number; i > 0; i--) {
			if (Math.sqrt(i) == (int) Math.sqrt(i)) {
				System.out.println((int) i);
			}
		}
	}
}
