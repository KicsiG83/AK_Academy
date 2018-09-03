import java.util.Random;

public class Dice {

	private int[] diceSides = new int[6];
	private int faceTop;
	private int faceBottom;
	private int faceRight;
	private int faceLeft;
	private int faceFront;
	private int faceBack;

	public Dice() {
		setFaceTop(1);
	}

	public int getFaceTop() {
		return faceTop;
	}

	public void setFaceTop(int faceTop) {
		this.faceTop = faceTop;
	}

	public int getFaceBottom() {
		return faceBottom;
	}

	public int getFaceRight() {
		return faceRight;
	}

	public int getFaceLeft() {
		return faceLeft;
	}

	public int getFaceFront() {
		return faceFront;
	}

	public int getFaceBack() {
		return faceBack;
	}

	public int cast() {
		return new Random().nextInt(7 - 1) + 1;
	}

	public void rotate() throws InterruptedException {
		initializeDiceForRotate();
		int number = calculateDiceSide();
		faceFront = number;
		faceBack = getOpposite(number);
		diceSides[2] = getFaceFront();
		diceSides[3] = getFaceBack();
		number = calculateDiceSide();
		faceLeft = number;
		faceRight = getOpposite(number);
		diceSides[4] = getFaceLeft();
		diceSides[5] = getFaceRight();
		printDiceAfterRotate();
	}

	private int calculateDiceSide() {
		boolean numberIsOK = false;
		int number = 0;
		do {
			number = cast();
			numberIsOK = checkDiceSides(number);
		} while (!numberIsOK);
		return number;
	}

	private void printDiceAfterRotate() {
		getSideOfDots(FaceOfDice.TOP);
		getSideOfDots(FaceOfDice.BOTTOM);
		getSideOfDots(FaceOfDice.FRONT);
		getSideOfDots(FaceOfDice.BACK);
		getSideOfDots(FaceOfDice.LEFT);
		getSideOfDots(FaceOfDice.RIGHT);
	}

	public boolean checkDiceSides(int number) {
		boolean isValid = true;
		for (int i = 0; i < diceSides.length; i++) {
			if (diceSides[i] == number) {
				isValid = false;
			}
		}
		return isValid;
	}

	public int getOpposite(int number) {
		int opposite = 0;
		switch (number) {
		case 1:
			opposite = 6;
			break;
		case 2:
			opposite = 5;
			break;
		case 3:
			opposite = 4;
			break;
		case 4:
			opposite = 3;
			break;
		case 5:
			opposite = 2;
			break;
		case 6:
			opposite = 1;
			break;
		}
		return opposite;
	}

	@Override
	public String toString() {
		String dot = "" + '\u2B24';
		return new String(new char[getFaceTop()]).replace("\0", dot);
	}

	public void getSideOfDots(FaceOfDice sideName) {
		int searchedSide = 0;
		switch (sideName) {
		case TOP:
			searchedSide = getFaceTop();
			break;
		case BOTTOM:
			searchedSide = getFaceBottom();
			break;
		case LEFT:
			searchedSide = getFaceLeft();
			break;
		case RIGHT:
			searchedSide = getFaceRight();
			break;
		case FRONT:
			searchedSide = getFaceFront();
			break;
		case BACK:
			searchedSide = getFaceBack();
			break;
		}
		System.out.println("A kocka " + sideName.getTextual() + " " + searchedSide + " pötty található!");
	}

	private void initializeDiceForRotate() throws InterruptedException {
		System.out.println("\nKocka pörgetéséhez dobás folyamatban ... ");
		waiting();
		int number = cast();
		faceTop = number;
		faceBottom = getOpposite(number);
		System.out.println("A dobás után a kocka tetején " + getFaceTop() + " az alján pedig " + getFaceBottom()
				+ " pötty található.\nPörgetés folyamatban ...");
		diceSides[0] = getFaceTop();
		diceSides[1] = getFaceBottom();
		waiting();
	}

	private void waiting() throws InterruptedException {
		int waiting = (new Random().nextInt(10 + 1) + 1);
		for (int i = 0; i < waiting; i++) {
			Thread.sleep(1000);
			System.out.println("...");
		}
	}
}
