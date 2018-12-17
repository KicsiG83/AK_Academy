import java.util.Map;
import java.util.TreeMap;

public class Dictionary {

	private Map<String, String> myDictionary = new TreeMap<>();

	public Dictionary() {

	}

	public void addWordPair(String engWord, String hunWord) {
		if (myDictionary.containsKey(engWord)) {
			removeElement(engWord);
		}
		if (myDictionary.containsKey(hunWord)) {
			removeElement(hunWord);
		}
		myDictionary.put(engWord, hunWord);
		myDictionary.put(hunWord, engWord);
	}

	private void removeElement(String word) {
		myDictionary.remove(myDictionary.get(word));
		myDictionary.remove(word);
	}

	public String getHunagrianWord(String engWord) {
		return myDictionary.get(engWord);
	}

	public String getEnglishWord(String hunWord) {
		return myDictionary.get(hunWord);
	}

}
