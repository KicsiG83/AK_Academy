public class Table {

	char[][] table = new char[10][10];
	int row;
	int column;

	public Table(String message, char separator) {
		fillUpTable(table, separator);
		PrintTable(message);
	}

	public void setTable(int row, int column, char character, char[][] table) {
		this.table[row][column] = character;
	}

	public void fillUpTable(char[][] table, char separator) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				this.table[i][j] = separator;
			}
		}
	}

	public char getTable(int row, int column) {
		return table[row][column];
	}

	public void PrintTable(String message) {
		System.out.println(message);
		System.out.println("A B C D E F G H I J");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(getTable(i, j) + "|");
				if (j == 9) {
					System.out.print(i + 1);
				}
			}
			System.out.println();
		}
	}
}
