import java.util.Set;
import java.util.TreeSet;

public class UseTreeSet {

	public void treeSet(String[] args) {
		Set<String> secondWords = new TreeSet<>();
		for (String secondWord : args) {
			if (!secondWords.add(secondWord)) {
				System.out.println(secondWord);
			}
		}
		System.out.println(secondWords);
	}
	
}
