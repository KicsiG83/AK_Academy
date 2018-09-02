package hu.ak_akademia.chess.figures;

public interface Figures {

	public char sign(Color c);
	public String move();
	public int movementCount();
	public boolean movementBack();
	public boolean onBoard();
	
}
