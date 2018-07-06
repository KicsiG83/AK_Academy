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
			if (getData.matches("(^([A-J]{1}[1-9]{1})$)")) {
				return true;
			}
		case 3:
			if (getData.matches("(^([A-J]{1}[1]{1}[0]{1})$)")) {
				return true;
			}
		default:
			return false;
		}
	}
}
