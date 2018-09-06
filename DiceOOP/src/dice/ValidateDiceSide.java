package dice;

public class ValidateDiceSide {

	public boolean checkDiceSides(int number, int[] diceSides) {
		boolean isValid = true;
		for (int i = 0; i < diceSides.length; i++) {
			if (diceSides[i] == number) {
				isValid = false;
			}
		}
		return isValid;
	}
	
}
