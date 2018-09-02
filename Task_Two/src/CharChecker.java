
public class CharChecker {

	public int check(String szoveg, char character) {
		int count = 0;
		for (int i = 0; i < szoveg.length(); i++) {
			if (szoveg.charAt(i) == character) {
				count++;
			}
		}
		if (count > 0) {
			return count;
		} else {
			return -1;
		}
	}
}
