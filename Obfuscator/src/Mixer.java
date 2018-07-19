import java.util.ArrayList;

public class Mixer {

	private String[] mixedString;
	private String[] splittedStrings;

	public void absoluteMixer() {
		splitter(new UserInput().getUserInput());
		mixer();
		printResult(mixedString);
	}
	
	private void splitter(String userInput) {
		int userInputLength = userInput.length();
		splittedStrings = new String[userInputLength];
		splittedStrings = userInput.split("(?=[- ,\\.\\?!])|(?<=[- ,\\.\\?!])");
	}

	private void mixer() {
		mixedString = new String[splittedStrings.length];
		for (int i = 0; i < splittedStrings.length; i++) {
			ArrayList<String> arrayList = new ArrayList<String>();
			if (splittedStrings[i].length() < 4) {
				mixedString[i] = splittedStrings[i];
			} else {
				int stringLength = splittedStrings[i].length() - 1;
				for (int j = 1; j < stringLength; j++) {
					arrayList.add(Character.toString(splittedStrings[i].charAt(j)));
				}
				java.util.Collections.shuffle(arrayList);
				String formattedString = stringFormatter(arrayList);
				mixedString[i] = Character.toString(splittedStrings[i].charAt(0)) + formattedString
						+ Character.toString(splittedStrings[i].charAt(splittedStrings[i].length() - 1));
			}
		}
	}

	private String stringFormatter(ArrayList<String> arrayList) {
		String formattedString = arrayList.toString().replace(",", "").replace("[", "").replace("]", "")
				.replace(" ", "").trim();
		return formattedString;
	}
	
	private void printResult(String[] mixedArray) {
		for (int i = 0; i < mixedArray.length; i++) {
			System.out.print(mixedArray[i]);
		}
	}
}
