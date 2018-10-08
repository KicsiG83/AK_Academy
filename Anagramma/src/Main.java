import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Map<String, List<String>> wordsMap = new HashMap<>();
		List<String> wordsList = new ArrayList<>();
		readFromFile(wordsMap, wordsList);
		System.out.println(wordsMap.get("akr"));
	}

	private void readFromFile(Map<String, List<String>> wordsMap, List<String> lista) {
		File file = new File("resources\\szavak2.txt");
		Scanner sc = null;
		String word = "";
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (sc.hasNextLine()) {
			word = sc.nextLine().trim().toLowerCase();
			String tempWord = cleanWord(cleanForm(word));
			if (wordsMap.containsKey(tempWord)) {
				List<String> containedList = wordsMap.get(tempWord);
				containedList.add(word);
			} else {
				List<String> tempList = new ArrayList<>();
				tempList.add(word);
				wordsMap.put(tempWord, tempList);
			}
		}
		sc.close();
	}

	private List<String> cleanForm(String word) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < word.length(); i++) {
			list.add(word.charAt(i) + "");
		}
		Collections.sort(list);
		return list;
	}

	private String cleanWord(List<String> word) {
		String cleanWord = "";
		for (int i = 0; i < word.size(); i++) {
			cleanWord = cleanWord + word.get(i);
		}
		return cleanWord;
	}
}
