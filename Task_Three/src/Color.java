
public enum Color {
	P("P\n*\n*"), S("*\nS\n*"), Z("*\n*\nZ"), PS("P\nS\n*");

	private String textual;

	private Color(String text) {
		textual = text;
	}

	public String getTextual() {
		return textual;
	}

}