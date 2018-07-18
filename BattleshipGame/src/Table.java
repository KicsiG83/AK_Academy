public class Table {

	char[][] table = new char[10][10];
	int row;
	int column;
	Table ownTable;
	Table opponentTable;
	
	private int stepVertical;
	private int stepHorizontal;
	Validators validator = new Validators();

	public void setStepVertical(int stepVertical) {
		this.stepVertical = stepVertical;
	}

	public void setStepHorizontal(int stepHorizontal) {
		this.stepHorizontal = stepHorizontal;
	}

	public int getStepVertical() {
		return stepVertical;
	}

	public int getStepHorizontal() {
		return stepHorizontal;
	}

	public void setCoordinate(String coordinate) {
		setStepVertical(coordinate.charAt(0) - 65);
		if (coordinate.length() == 3) {
			setStepHorizontal(9);
		} else {
			setStepHorizontal(coordinate.charAt(1) - 49);
		}

		// alábbi csak, hogy lássuk futáskor is, hogy mi értékelődik ki:
		System.out.println("\nBetű kiértékelés: " + getStepVertical()
				+ " <- Az érték a vertikális (hanyadik oszlop) tömb indexét mutatja (pl: A = tömb index 0);\n generálva: UserInput.setCoordinate");
		System.out.println("Szám kiértékelés: " + getStepHorizontal()
				+ " <- Az érték a horizontális (hanyadik sor) tömb indexét mutatja (pl: 1 = tömb index 0);\n generálva: UserInput.setCoordinate");
	}

	public void getCoordinate(String coordinate) {
		setStepVertical(coordinate.charAt(0) - 65);
		if (coordinate.length() == 3) {
			setStepHorizontal(9);
		} else {
			setStepHorizontal(coordinate.charAt(1) - 49);
		}
	}
	
	public Table(){
		ownTable = new Table("OWN TABLE", '~');
		opponentTable = new Table("OPPONENT TABLE", '~');
	}
	
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
	
	/*
	 * 
	 * Idági jutottam! 
	 * A checkPosition metódussal gondoltam ellenőrizni, hogy az adott hajót le tudjuk-e tenni a user által megadott koordinátára vagyis, hogy a hajók nem keresztezzik-e egymást.
	 * A koordináta a hajó orrát mutatja, az irány pedig az elhelyezkedését. Ha vízszintes, akkor a megadott koordinátától jobbra ellenőrzünk, ha függőleges, akkor lefelé.
	 * Az ellenőrzésnek végig kell menni a vízszintes és függőleges szomszédos koordinátákon (az iránytól függően), és ellenőrzi azokat. 
	 * Ha nem talál "~" jeltől eltérőt, akkor true-val kell visszatérnie, ha talál, akkor false.
	 * Akkor is false, ha a hajó már kilógna játéktérből.
	 * 
	 */
	public boolean checkPosition(int horizontal, int vertical, int direction, int shipLength) {
		//Csak egy szimpla kiíratás, hogy lássuk mit ad vissza a koordináta
		System.out.println(ownTable.getTable(horizontal, vertical));
		return false;
	}
	
}
