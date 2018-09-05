
public enum Color {

	BLACK("Fekete"), WHITE("Fehér"), RED("Piros"), BLUE("Kék"), GREEN("Zöld"), PINK("Rózsaszín"),
	ORANGE("Narancssárga"), YELLO("Sárga"), OTHER("Egyedi szín");

	private String textual;

	Color(String text) {
		textual = text;
	}

	public String getTextual() {
		return textual;
	}
}
