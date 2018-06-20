
public class Checker {

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

	public static void checkNeighbours(Player player, int rowIndex, int columnIndex, char sign) {
		player.setLine(1);
		player.setColumn(1);
		player.setDiagonalLeft(1);
		player.setDiagonalRight(1);
		checkLineLeft(player, rowIndex, columnIndex, sign);
		checkLineRight(player, rowIndex, columnIndex, sign);
		checkColumnUp(player, rowIndex, columnIndex, sign);
		checkColumnDown(player, rowIndex, columnIndex, sign);
		checkDiagonalLeftAndUp(player, rowIndex, columnIndex, sign);
		checkDiagonalRightAndDown(player, rowIndex, columnIndex, sign);
		checkDiagonalRightAndUp(player, rowIndex, columnIndex, sign);
		checkDiagonalLeftAndDown(player, rowIndex, columnIndex, sign);
	}

	private static void checkLineRight(Player player, int rowIndex, int columnIndex, char sign) {
		int i = columnIndex + 1;
		while (i < Board.getBoardSize()) {
			if (Board.getTableField(rowIndex, i) == sign) {
				player.setLine(player.getLine() + 1);
				i += 1;
			} else {
				break;
			}
		}
	}

	private static void checkLineLeft(Player player, int rowIndex, int columnIndex, char sign) {
		int i = columnIndex - 1;
		while (i >= 0) {
			if (Board.getTableField(rowIndex, i) == sign) {
				player.setLine(player.getLine() + 1);
				i -= 1;
			} else {
				break;
			}
		}
	}

	private static void checkColumnDown(Player player, int rowIndex, int columnIndex, char sign) {
		int i = rowIndex + 1;
		while (i < Board.getBoardSize()) {
			if (Board.getTableField(i, columnIndex) == sign) {
				player.setColumn(player.getColumn() + 1);
				i += 1;
			} else {
				break;
			}
		}
	}

	private static void checkColumnUp(Player player, int rowIndex, int columnIndex, char sign) {
		int i = rowIndex - 1;
		while (i >= 0) {
			if (Board.getTableField(i, columnIndex) == sign) {
				player.setColumn(player.getColumn() + 1);
				i -= 1;
			} else {
				break;
			}
		}
	}

	private static void checkDiagonalLeftAndUp(Player player, int rowIndex, int columnIndex, char sign) {
		int i = rowIndex - 1;
		int j = columnIndex - 1;
		while (i >= 0 && j >= 0) {
			if (Board.getTableField(i, j) == sign) {
				player.setDiagonalLeft(player.getDiagonalLeft() + 1);
				i -= 1;
				j -= 1;
			} else {
				break;
			}
		}
	}

	private static void checkDiagonalRightAndDown(Player player, int rowIndex, int columnIndex, char sign) {
		int i = rowIndex + 1;
		int j = columnIndex + 1;
		while (i < Board.getBoardSize() && j < Board.getBoardSize()) {
			if (Board.getTableField(i, j) == sign) {
				player.setDiagonalLeft(player.getDiagonalLeft() + 1);
				i += 1;
				j += 1;
			} else {
				break;
			}
		}
	}

	private static void checkDiagonalRightAndUp(Player player, int rowIndex, int columnIndex, char sign) {
		int i = rowIndex - 1;
		int j = columnIndex + 1;
		while (i >= 0 && j < Board.getBoardSize()) {
			if (Board.getTableField(i, j) == sign) {
				player.setDiagonalRight(player.getDiagonalRight() + 1);
				i -= 1;
				j += 1;
			} else {
				break;
			}
		}
	}

	private static void checkDiagonalLeftAndDown(Player player, int rowIndex, int columnIndex, char sign) {
		int i = rowIndex + 1;
		int j = columnIndex - 1;
		while (i < Board.getBoardSize() && j >= 0) {
			if (Board.getTableField(i, j) == sign) {
				player.setDiagonalRight(player.getDiagonalRight() + 1);
				i += 1;
				j -= 1;
			} else {
				break;
			}
		}
	}
}
