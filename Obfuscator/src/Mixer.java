
public class Mixer {

	public String[] getMixedString() {
		return mixedString;
	}

	public void setMixedString(String[] mixedString) {
		this.mixedString = mixedString;
	}

	public String[] getSeparatorCharacters() {
		return separatorCharacters;
	}

	public void setSeparatorCharacters(String[] separatorCharacters) {
		this.separatorCharacters = separatorCharacters;
	}

	private String[] mixedString;
	private String[] separatorCharacters;
	
	public void mixString(String userInput) {
		int userInputLength = userInput.length();
		mixedString = new String[userInputLength];
		separatorCharacters = new String[userInputLength];
		setMixedString(userInput.split(", |\\. |\\.|\\! |\\!|\\ |\\-"));
		setSeparatorCharacters(userInput.split("[^a-zA-Z0-9]")); // ez itt szar
	}
	
}
