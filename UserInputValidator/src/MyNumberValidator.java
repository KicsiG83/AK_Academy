
public class MyNumberValidator {

	public boolean validator(String myString) {
		try {
			Long.parseLong(myString);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
