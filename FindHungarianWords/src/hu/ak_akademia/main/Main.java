package hu.ak_akademia.main;

import java.util.HashMap;
import java.util.Map;

import hu.ak_akademia.filereader.FileProcessor;

public class Main {

	public static void main(String[] args) {

		new Main().run();

	}

	private void run() {
		FileProcessor fp = new FileProcessor();
		Map<String, Integer> cleanWordList = new HashMap<>();
		cleanWordList = fp.process("res/words.txt");
		System.out.println(cleanWordList.size());
//		fp.sortMap(cleanWordList);
	}
}
