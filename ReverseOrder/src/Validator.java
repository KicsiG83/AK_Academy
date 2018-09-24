
public class Validator {

	public Validator() {
	}

	public boolean check(String name) {
		if (Character.toString(name.charAt(0)).matches("^([a-zA-z])$")) {
			return name.matches("^[\\p{L} .'-]+$");
		} else {
			return false;
		}
	}
}
