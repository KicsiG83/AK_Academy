import java.util.Scanner;

public class Game {

	public static void letsPlay(Scanner sc) {
		Player player1 = new Player(sc);
		Player player2 = new Player(sc);
		boolean gameOver = false;
		do {
			Board.printBoard();
			for (int i = 1; i < Math.pow(Board.getBoardSize(), 2); i++) {
				if (i % 2 == 0) {
					System.out.print(player2.getPlayerName() + " ");
					getUserInput(sc, player2, Board.getBoardSize(), 'O');
					WinChecker.isWin(player2);
					gameOver = player2.isWin();
					if (gameOver) {
						System.out.println(player2.getPlayerName() + " nyert. Gratulálok a győztesnek.\n"
								+ player1.getPlayerName() + " ne csüggedj, legközelebb jobban fog menni :)");
						break;
					}
				} else {
					System.out.print(player1.getPlayerName() + " ");
					getUserInput(sc, player1, Board.getBoardSize(), 'X');
					WinChecker.isWin(player1);
					gameOver = player1.isWin();
					if (gameOver) {
						System.out.println(player1.getPlayerName() + " nyert. Gratulálok a győztesnek.\n"
								+ player2.getPlayerName() + " ne csüggedj, legközelebb jobban fog menni :)");
						break;
					}
				}
			}
		} while (!gameOver);
	}

	public static void getUserInput(Scanner sc, Player player, int number, char sign) {
		boolean result = false;
		int line = 0;
		int column = 0;
		do {
			line = getIndex(sc, number, "Kérem adja meg a sor számát: ");
			column = getIndex(sc, number, "Kérem adja meg az oszlop számát: ");
			result = checkInputOnBoard(line, column, sign);
		} while (!result);
		Board.printBoard();
		checkNeighbours(player, line, column, sign);
	}

	public static boolean checkInputOnBoard(int line, int column, char userSign) {
		boolean validInput = false;
		char sign = Board.getTableField(line, column);
		if (sign == '_') {
			Board.setTableField(line, column, userSign);
			validInput = true;
		} else {
			System.out.println("A megadott mező foglalt.");
		}
		return validInput;
	}

	public static int getIndex(Scanner sc, int number, String message) {
		boolean validInput = false;
		int userInput = 0;
		do {
			try {
				System.out.print(message);
				userInput = sc.nextInt();
				sc.nextLine();
				if (userInput < 0 || userInput >= number) {
					System.out.println("Határértéken túli input.");
				} else {
					validInput = true;
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("A megadott érték érvénytelen.");
			}
		} while (!validInput);
		return userInput;
	}

	public static void checkNeighbours(Player player, int rowIndex, int columnIndex, char sign) {
		boolean win = false;
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
