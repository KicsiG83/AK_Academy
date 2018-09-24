import java.util.List;

public class Print {

	public void printResult(List<String> names) {
		if (names.size() == 0) {
			System.out.println("Nem adott meg egy nevet sem.");
		} else {
			System.out.println("A kiíratás a bevitel fordítottját fogja megjeleníteni.");

			for (int i = names.size() - 1; i >= 0; i--) {
				if (names.get(i).length() != 0) {
					System.out.println(names.get(i));
				}
			}
		}
	}
}
