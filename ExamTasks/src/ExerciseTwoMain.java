
public class ExerciseTwoMain {

	public static void main(String[] args) {
		int min = 1345634868;
		int max = 1345639868;
		for (int i = min + 1; i < max; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
}