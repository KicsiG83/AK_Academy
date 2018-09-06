package dice;

public class CalculateDiceSide {

	public int calculateDiceSide(Dice dice, int[] diceSides) {
		boolean numberIsOK = false;
		int number = 0;
		do {
			number = dice.cast();
			numberIsOK = new ValidateDiceSide().checkDiceSides(number, diceSides);
		} while (!numberIsOK);
		return number;
	}
	
}
