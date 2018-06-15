import java.util.Scanner;

public class Player {

	private String playerName;
	private static boolean win;
	private static int line;
	private static int column;
	private static int diagonalLeft;
	private static int diagonalRight;

	public int getLine() {
		return line;
	}

	public static void setLine(int line) {
		Player.line = line;
	}

	public int getColumn() {
		return column;
	}

	public static void setColumn(int column) {
		Player.column = column;
	}

	public int getDiagonalLeft() {
		return diagonalLeft;
	}

	public static void setDiagonalLeft(int diagonalLeft) {
		Player.diagonalLeft = diagonalLeft;
	}

	public int getDiagonalRight() {
		return diagonalRight;
	}

	public static void setDiagonalRight(int diagonalRight) {
		Player.diagonalRight = diagonalRight;
	}

	public static boolean isWin() {
		return win;
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
