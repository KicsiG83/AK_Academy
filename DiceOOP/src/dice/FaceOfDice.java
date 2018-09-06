package dice;

public enum FaceOfDice {

	FRONT("első oldalán"), BACK("hátsó oldalán"), LEFT("bal oldalán"), RIGHT("jobb oldalán"), TOP("tetején"), BOTTOM("alján");
	
	private String textual;
	
	private FaceOfDice(String text) {
		textual = text;
	}
	
	public String getTextual() {
		return textual;
	}
}
