package hu.ak_akademia.filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map.Entry;

public class FileProcessor {

	public Map<String, Integer> process(String fileName) {
		Map<String, Integer> words = new HashMap<>();
		try {
			Scanner sc = new Scanner(new File(fileName));
			while (sc.hasNextLine()) {
				String line = sc.nextLine().toLowerCase();
				String[] word = line.split("\t");
				if (word.length == 8) {
					if (!checkMap(word[0], words)) {
						if (Integer.parseInt(word[word.length - 1]) > 500) {
							words.put(word[0], Integer.parseInt(word[word.length - 1]));
						}
					} else {
						if (words.get(word[0]) < Integer.parseInt(word[word.length - 1])) {
							words.put(word[0], Integer.parseInt(word[word.length - 1]));
						}
					}
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return words;
	}

	private boolean checkMap(String word, Map<String, Integer> words) {
		if (words.containsKey(word)) {
			return true;
		} else {
			return false;
		}
	}

	public void sortMap(Map<String, Integer> words) {
		Set<Entry<String, Integer>> sortedSet = words.entrySet();
		List<Entry<String, Integer>> sortedList = new ArrayList(sortedSet);
		java.util.Collections.sort(sortedList, new CompareWords());
		printList(sortedList);
	}

	private void printList(List<Entry<String, Integer>> sortedList) {
		for (Entry<String, Integer> entry : sortedList) {
			System.out.println(entry);
		}
	}
}
