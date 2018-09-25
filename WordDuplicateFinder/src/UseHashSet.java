import java.util.HashSet;
import java.util.Set;

public class UseHashSet {

	public void hashSet(String[] args) {
		Set<String> words = new HashSet<>();
		for (String word : args) {
			if (!words.add(word)) {
				System.out.println(word);
			}
		}
		System.out.println(words);
	}
	
}
