package stringmethodes;

public class Exercise {
	public static void main(String[] args) {
		String[] words = { "alma", "banán", "narancs", "ananász", "napraforgó", "füge" };
		characterPrevelance(words, 'a');
	}

	public static void characterPrevelance(String[] array, char c) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length(); j++) {
				if (array[i].charAt(j) == c) {
					count++;
				}
			}
			System.out.println(array[i] + " : " + count);
			count = 0;
		}
	}
}
