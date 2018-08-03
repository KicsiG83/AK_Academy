package hu.ak_akademia.chess.figures;

public class Queen implements Figures {

	@Override
	public char sign(Color c) {
		if(c.equals(Color.BLACK)){
			return '\u265B';
		}else {
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

}
