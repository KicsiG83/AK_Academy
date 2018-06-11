import java.util.Scanner;

public class Game {

	public static void letsPlay(Scanner sc) {
		Player player1 = new Player(sc);
		Player player2 = new Player(sc);
		boolean gameOver = false;
		do {
			Board.printBoard();
			for (int i = 1; i < Board.getBoardSize() * Board.getBoardSize(); i++) {
				if (i % 2 == 0) {
					System.out.print(player2.getPlayerName() + " ");
					getUserInput(sc, player2, Board.getBoardSize(), 'O');
					gameOver = WinChecker.isWin(player2);
				} else {
					System.out.print(player1.getPlayerName() + " ");
					getUserInput(sc, player1, Board.getBoardSize(), 'X');
					gameOver = WinChecker.isWin(player1);
				}
			}
		
		} while (!gameOver);
		if(player1.isWin()) {
			System.out.println(player1.getPlayerName() + " nyert.");
		}else {
			System.out.println(player2.getPlayerName() + " nyert.");
		}
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
		checkNeighbours(line, column, sign);
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
				if (userInput < 1 || userInput > number) {
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

	public static void checkNeighbours(int rowIndex, int columnIndex, char sign) {
		int line = 0;
		boolean win = false;
		int i = columnIndex - 1;
		while (!win && i > 0) {
			if (Board.getTableField(rowIndex, i) == sign) {
				line++;
				Player.setLine(line);
				i -= 1;
			} else {
				i -= 1;
				break;
			}
		}
		i = columnIndex - 1;
		while (!win && i < 10) {
			if (Board.getTableField(rowIndex, i) == sign) {
				line++;
				Player.setLine(line);
				i += 1;
			} else {
				i += 1;
				break;
			}
		}
	}
}
