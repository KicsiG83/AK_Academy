package dice;

public class SideOfDice {

	public void getSideOfDots(FaceOfDice sideName, Dice dice) {
		int searchedSide = 0;
		switch (sideName) {
		case TOP:
			searchedSide = dice.getFaceTop();
			break;
		case BOTTOM:
			searchedSide = dice.getFaceBottom();
			break;
		case LEFT:
			searchedSide = dice.getFaceLeft();
			break;
		case RIGHT:
			searchedSide = dice.getFaceRight();
			break;
		case FRONT:
			searchedSide = dice.getFaceFront();
			break;
		case BACK:
			searchedSide = dice.getFaceBack();
			break;
		}
		System.out.println("A kocka " + sideName.getTextual() + " " + searchedSide + " pötty található!");
	}

}
