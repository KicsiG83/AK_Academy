public class Validators {

	/**
	 * This method validates the level.
	 * 
	 * @param level
	 *            - the input from the console
	 * @return - false if the level didn't exists
	 */
	public boolean levelValidator(int level) {
		boolean valid = false;
		if (level >= 1 && level <= 3) {
			valid = true;
		} else {
			System.out.println("Invalid level.");
		}
		return valid;
	}

	public boolean coordinateLengthValidator(String coordinate) {
		if (coordinate.length() >= 2 && coordinate.length() <= 3) {
			return true;
		}
		return false;
	}

	//PA: check if coordinate userinput is valid or not. Must be: First char: A-J, Second char: 1-9, Third char: 0
	public boolean isValidCoordinate(String getData) {
		switch (getData.length()) {
		case 2:
			int Letter = getData.charAt(0);
			int firstDigit = getData.charAt(1) - 48;
			if (Letter >= 65 && Letter <= 74 && Character.isDigit(getData.charAt(1)) && firstDigit != 0) {
				return true;
			}
			return false;
		case 3:
			int Letter2 = getData.charAt(0);
			int firstDigit2 = getData.charAt(1) - 48;
			int secondDigit = getData.charAt(2) - 48;
			if (Letter2 >= 65 && Letter2 <= 74 && Character.isDigit(getData.charAt(1)) && Character.isDigit(getData.charAt(2)) && firstDigit2 != 0 && secondDigit == 0) {
				return true;
			}
			return false;
		default:
			return false;
		}
	}
}
