
public class WinChecker {

	public static boolean isWin(Player player) {
		boolean win = false;
		if (player.getLine() == 5) {
			player.setWin(true);
		} else if (player.getColumn() == 5) {
			player.setWin(true);
		} else if (player.getDiagonalLeft() == 5) {
			player.setWin(true);
		} else if (player.getDiagonalRight() == 5) {
			player.setWin(true);
		} else {
			player.setWin(false);
			player.setLine(0);
			player.setColumn(0);
			player.setDiagonalLeft(0);
			player.setDiagonalRight(0);
		}
		return win;
	}

}
