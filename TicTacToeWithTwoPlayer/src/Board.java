import java.util.Scanner;

import javax.sql.rowset.RowSetWarning;

public class Board {

	private static int boardSize;
	public static char[][] table;
	private static char sign;

	public static void setTableField(int rowIndex, int columnIndex, char sign) {
		table[rowIndex - 1][columnIndex - 1] = sign;
	}

	
	// Itt van a gond, elcsúszik a számolás
	
	public static char getTableField(int rowIndex, int columnIndex) {
		int row = 0;
		int column = 0;
		if (rowIndex >= 1 && rowIndex < Board.getBoardSize()) {
			row = rowIndex;
		} else {
			row = rowIndex - 1;
		}
		if (columnIndex >= 1 && columnIndex < Board.getBoardSize()) {
			column = columnIndex;
		} else {
			column = columnIndex - 1;
		}
		return sign = table[row][column];
	}

	public static int getBoardSize() {
		return boardSize;
	}

	public static void setBoardSize(int size) {
		boardSize = size;
	}

	public Board(Scanner sc) {
		setBoardSize(getBoardSize(sc));
		setBoard(getBoardSize());
	}

	public static int getBoardSize(Scanner sc) {
		boolean result = false;
		do {
			try {
				System.out.print("Kérem adja meg a játéktér méretét (legalább 5): ");
				Board.setBoardSize(sc.nextInt());
				sc.nextLine();
				if (Board.getBoardSize() >= 5) {
					result = true;
				} else {
					System.out.println("A tábla mérete túl kicsi, nem fér el rajta 5 jel egy vonalban!\n");
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("\nA megadott érték érvénytelen.\n");
			}
		} while (!result);

		return Board.getBoardSize();
	}

	public static void setBoard(int number) {
		table = new char[number][number];
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				table[i][j] = '_';
			}
		}
	}

	public static void printBoard() {
		System.out.println();
		String space = " ";
		int length = (int) (Math.log10(table.length) + 1);
		String spaces = new String(new char[length]).replace("\0", space);
		System.out.print(spaces);
		for (int i = 1; i <= table.length; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < table.length; i++) {
			int iLength = (int) (Math.log10(i + 1) + 1);
			String iSpaces = new String(new char[length - iLength]).replace("\0", space);
			System.out.print(i + 1 + iSpaces);
			for (int j = 0; j < table.length; j++) {
				System.out.format(table[i][j] + " ");
				if (j == table.length - 1) {
					System.out.println();
				}
			}
		}
		System.out.println();
	}
}
