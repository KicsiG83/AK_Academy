
public class CharacterCompare implements Comparable<String> {

	private String originalString;
	private String caseSensitiveString;

	public CharacterCompare(String originalString, String caseSensitiveString) {
		this.originalString = originalString;
		this.caseSensitiveString = caseSensitiveString;
	}

	@Override
	public int compareTo(String myString) {
		int result = this.originalString.compareTo(caseSensitiveString);
		if (result != 0) {
			return result;
		}
		return result;
	}

}
