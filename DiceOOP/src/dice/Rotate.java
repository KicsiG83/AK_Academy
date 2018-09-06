package dice;

public class Rotate {

	public void rotate(Dice dice) {
		new InitializeDiceForRotate().initDice(dice);
		int number = new CalculateDiceSide().calculateDiceSide(dice, dice.getDiceSides());
		dice.setFaceFront(number);
		dice.setFaceBack(new OppositeSide().getOppositeSide(number));
		dice.setDiceSides(2, dice.getFaceFront());
		dice.setDiceSides(3, dice.getFaceBack());
		number = new CalculateDiceSide().calculateDiceSide(dice, dice.getDiceSides());
		dice.setFaceLeft(number);
		dice.setFaceRight(new OppositeSide().getOppositeSide(number));
		dice.setDiceSides(4, dice.getFaceLeft());
		dice.setDiceSides(5, dice.getFaceRight());
		new Print().printDiceAfterRotate(dice);
	}
}
