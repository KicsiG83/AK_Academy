package stringmethodes;

public class Exercise2 {
	public static void main(String[] args) {
		String[] words = { "alma", "banán", "körte", "malom" };
		System.out.println(contains(words, "al"));
		String[] words2 = { "hello", "tímár", "helvét", "durung", "hellén" };
		System.out.println(startsWith(words2, "hel"));
		String[] words3 = { "turul", "gurul", "koszos", "modor", "olló", "barnul" };
		System.out.println(endsWith(words3, "ul"));
	}

	public static int contains(String[] array, String text) {
		int count = 0;
		for (String s : array) {
			if (s.contains(text)) {
				System.out.println(s);
				count++;
			}
		}
		return count;
	}

	public static int startsWith(String[] array, String text) {
		int count = 0;
		for (String s : array) {
			if (s.startsWith(text)) {
				System.out.println(s);
				count++;
			}
		}
		return count;
	}

	public static int endsWith(String[] array, String text) {
		int count = 0;
		for (String s : array) {
			if (s.endsWith(text)) {
				System.out.println(s);
				count++;
			}
		}
		return count;
	}
}
