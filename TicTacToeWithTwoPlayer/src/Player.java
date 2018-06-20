import java.util.Scanner;

public class Player {

	private String playerName;
	private boolean win;
	private int line;
	private int column;
	private int diagonalLeft;
	private int diagonalRight;

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int getDiagonalLeft() {
		return diagonalLeft;
	}

	public void setDiagonalLeft(int diagonalLeft) {
		this.diagonalLeft = diagonalLeft;
	}

	public int getDiagonalRight() {
		return diagonalRight;
	}

	public boolean isWin() {
		return win;
	}

	public void setDiagonalRight(int diagonalRight) {
		this.diagonalRight = diagonalRight;
	}

	public void setWin(boolean winInfo) {
		win = winInfo;
	}

	public Player(Scanner sc) {
		getInput(sc);
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public void getInput(Scanner sc) {
		System.out.print("Kérem adja meg a játékos nevét: ");
		setPlayerName(sc.nextLine());
	}

}
