
public class Validator {

	public boolean isValid(String result) {
		return result.matches("^[0-9]+{1}$");
	}
}
