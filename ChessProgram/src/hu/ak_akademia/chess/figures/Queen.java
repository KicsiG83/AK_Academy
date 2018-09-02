package hu.ak_akademia.chess.figures;

public class Queen implements Figures {

	private boolean onBoard = true;

	public boolean isOnBoard() {
		return onBoard;
	}

	public void setOnBoard(boolean onBoard) {
		this.onBoard = onBoard;
	}

	@Override
	public char sign(Color c) {
		if (c.equals(Color.BLACK)) {
			return '\u265B';
		} else {
			return '\u2655';
		}
	}

	@Override
	public String move() {
		return null;
	}

	@Override
	public int movementCount() {
		return 0;
	}

	@Override
	public boolean movementBack() {
		return true;
	}

	@Override
	public boolean onBoard() {
		return isOnBoard();
	}

}
