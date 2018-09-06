package dice;

import java.util.Random;

public class Dice {

	private final int MAXDOTSONDICE = 6;
	private final int MINDOTSONDICE = 1;
	private int[] diceSides = new int[6];
	private int faceTop;
	private int faceBottom;
	private int faceRight;
	private int faceLeft;
	private int faceFront;
	private int faceBack;

	public Dice() {
		setFaceTop(6);
	}

	public int getFaceTop() {
		return faceTop;
	}

	public void setFaceTop(int faceTop) {
		this.faceTop = faceTop;
	}
	
	public int[] getDiceSides() {
		return diceSides;
	}

	public void setDiceSides(int index, int diceSides) {
		this.diceSides[index] = diceSides;
	}

	public void setFaceBottom(int faceBottom) {
		this.faceBottom = faceBottom;
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

	public void setFaceRight(int faceRight) {
		this.faceRight = faceRight;
	}

	public void setFaceLeft(int faceLeft) {
		this.faceLeft = faceLeft;
	}

	public void setFaceFront(int faceFront) {
		this.faceFront = faceFront;
	}

	public void setFaceBack(int faceBack) {
		this.faceBack = faceBack;
	}

	public int getFaceBack() {
		return faceBack;
	}

	public int cast() {
		return new Random().nextInt(MAXDOTSONDICE) + MINDOTSONDICE;
	}

	@Override
	public String toString() {
		String dot = "" + '\u2B24';
		return new String(new char[getFaceTop()]).replace("\0", dot);
	}
}
