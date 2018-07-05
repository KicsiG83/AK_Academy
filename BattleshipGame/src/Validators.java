public class Validators {

	/**
	 * This method validates the level.
	 * @param level - the input from the console
	 * @return - false if the level didn't exists
	 */			
	public boolean levelValidator(int level) {
		boolean valid = false;
		if (level >= 1 && level <= 3) {
			valid = true;
		}else {
			System.out.println("Invalid level.");
		}
		return valid;
	}
	
	public boolean coordinateLengthValidator(String coordinate) {
		boolean valid = false;
		int length = coordinate.length();
		if(length >= 2 && length <= 3) {
			valid = true;
		}
		return valid;
	}
}
