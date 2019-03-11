import java.util.Optional;

public class MyStringChecker implements MyStringValidator {

	@Override
	public boolean notNullValidator(String myString) {
		Optional<String> string = Optional.ofNullable(myString);
		return string.isPresent();
	}

	@Override
	public boolean lengthValidator(boolean isLong, int length, String myString) {
		if (isLong) {
			return myString.length() > length;
		} else {
			return myString.length() < length;
		}
	}

	@Override
	public boolean fullCharacterValidator(char[] myCharacters, String myString) {
		for (int i = 0; i < myCharacters.length; i++) {
			if (myString.contains(Character.toString(myCharacters[i]))) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean atLeastOneCharacterValidator(char[] myCharacters, String myString) {
		for (int i = 0; i < myCharacters.length; i++) {
			if (myString.contains(Character.toString(myCharacters[i]))) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean caseSensitiveValidator(boolean isUpperCase, String myString) {
		if (isUpperCase) {
			CharacterCompare myCompare = new CharacterCompare(myString, myString.toUpperCase());
			if (myCompare.compareTo(myString) == 0) {
				return true;
			}
		} else {
			CharacterCompare myCompare = new CharacterCompare(myString, myString.toLowerCase());
			if (myCompare.compareTo(myString) == 0) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean wordPartsValidator(String wordPart, String myString) {
		return myString.contains(wordPart);
	}

	@Override
	public boolean numberInStringValidator(String myString) {
		char[] myStringCharacters = myString.toCharArray();
		for (int i = 0; i < myStringCharacters.length; i++) {
			try {
				Integer.parseInt(Character.toString(myStringCharacters[i]));
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}

}
