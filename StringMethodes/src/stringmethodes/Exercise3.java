package stringmethodes;

public class Exercise3 {
	public static void main(String[] args) {
		String[] words = { "elHív", "daNDár", "KisNyúl", "tereGet", "hiÚz" };
		print(words, 5);
	}

	public static void print(String[] array, int number) {
		for (String s : array) {
			if (s.length() > number) {
				System.out.println(s.toUpperCase());
			} else {
				System.out.println(s.toLowerCase());
			}
		}
	}
}
