import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Map<String, Integer> map = new LinkedHashMap<>();
//		Map<String, Integer> map = new TreeMap<>();
//		Map<String, Integer> map = new HashMap<>();
		String userResult = new UserInput().userInput(new Scanner(System.in));
		userResult = userResult.replaceAll("\\p{P}", "");
		String[] array = userResult.split(" ");
		countWords(map, array);
		printWords(map);
	}

	private void countWords(Map<String, Integer> map, String[] array) {
		for (int i = 0; i < array.length; i++) {
			if (!map.containsKey(array[i])) {
				map.put(array[i], 1);
			} else {
				int number = map.get(array[i]);
				map.put(array[i], number + 1);
			}
		}
	}

	private void printWords(Map<String, Integer> map) {
		for (String m : map.keySet()) {
			System.out.println(m + " " + map.get(m));
		}
	}
}
