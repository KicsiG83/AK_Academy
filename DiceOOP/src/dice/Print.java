package dice;

public class Print {

	public void printDiceAfterRotate(Dice dice) {
		SideOfDice dots = new SideOfDice();
		dots.getSideOfDots(FaceOfDice.TOP, dice);
		dots.getSideOfDots(FaceOfDice.BOTTOM, dice);
		dots.getSideOfDots(FaceOfDice.FRONT, dice);
		dots.getSideOfDots(FaceOfDice.BACK, dice);
		dots.getSideOfDots(FaceOfDice.LEFT, dice);
		dots.getSideOfDots(FaceOfDice.RIGHT, dice);
	}
}
