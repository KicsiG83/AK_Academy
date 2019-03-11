/*
 * adott karakterek közül mindegyiket tartalmazó szöveg
 * adott karakterek közül legalább az egyiket tartalmazó szöveg
 */
public interface MyStringValidator {

	boolean notNullValidator(String myString);

	boolean lengthValidator(boolean isLong, int length, String myString);

	boolean fullCharacterValidator(char[] myCharacters, String myString);

	boolean atLeastOneCharacterValidator(char[] myCharacters, String myString);

	boolean caseSensitiveValidator(boolean isUpperCase, String myString);

	boolean wordPartsValidator(String wordPart, String myString);

	boolean numberInStringValidator(String myString);

}
