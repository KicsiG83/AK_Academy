import java.util.Scanner;

public class UserInput {

	private int stepVertical;
	private int stepHorizontal;
	Validators validator = new Validators();

	public int getStepVertical() {
		return stepVertical;
	}

	public int getStepHorizontal() {
		return stepHorizontal;
	}
	
	public void setCoordinate(Scanner scanner, String message, int shipDirection, int shipLength) {
		String error = "";
		String getData = "  ";
		do {
			System.out.print(error);
			System.out.print(message);
			getData = scanner.nextLine().toUpperCase();
			error = "The given coordinates do not meet the table size.\nYou must select an existing coordinate from the table (example: E7)!\n";
		} while (!validator.isValidCoordinate(getData));
		stepVertical = getData.charAt(0) - 65;
		if (getData.length() == 3) {
			stepHorizontal = 9;
		} else {
			stepHorizontal = getData.charAt(1) - 49;
		}
		checkPosition(stepVertical, stepHorizontal, shipDirection, shipLength);
		
		
		// alábbi csak, hogy lássuk futáskor is, hogy mi értékelődik ki:
		System.out.println("\nBetű kiértékelés: " + stepVertical
				+ " <- Az érték a vertikális (hanyadik oszlop) tömb indexét mutatja (pl: A = tömb index 0);\n generálva: UserInput.setCoordinate");
		System.out.println("Szám kiértékelés: " + stepHorizontal
				+ " <- Az érték a horizontális (hanyadik sor) tömb indexét mutatja (pl: 1 = tömb index 0);\n generálva: UserInput.setCoordinate");
	}

	public int selectShip(Scanner sc) {
		boolean valid = false;
		int shipIndex = 0;
		System.out.println("Ships:\n1 - " + Ships.CARRIER.getName() + "\n2 - " + Ships.BATTLESHIP.getName() + "\n3 - "
				+ Ships.CRUISER.getName() + "\n4 - " + Ships.SUBMARINE.getName() + "\n5 - "
				+ Ships.DESTROYER.getName());
		do {
			try {
				System.out.print("Please select a ship: ");
				shipIndex = sc.nextInt();
				sc.nextLine();
				if (shipIndex < 1 || shipIndex > 5) {
					System.out.println("Invalid input.");
				} else {
					valid = true;
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("Invalid input.");
			}
		} while (!valid);
		return shipIndex;
	}
	
	public int selectDirection(Scanner sc) {
		boolean valid = false;
		int shipDirection = 0;
		System.out.println("Positions:\n1 - Horizontal\n2 - Vertical");
		do {
			try {
				System.out.print("Please select a position: ");
				shipDirection = sc.nextInt();
				sc.nextLine();
				if (shipDirection < 1 || shipDirection > 2) {
					System.out.println("Invalid input.");
				} else {
					valid = true;
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("Invalid input.");
			}
		} while (!valid);
		return shipDirection;
	}
	
	public boolean checkPosition(int vertical, int horizontal, int direction, int shipLength) {
		
		return false;
	}

	public String getCoordinate(Scanner sc, String message) {
		String error = "";
		String getData = "  ";
		do {
			System.out.print(error);
			System.out.print(message);
			getData = sc.nextLine().toUpperCase();
			error = "The given coordinates do not meet the table size.\nYou must select an existing coordinate from the table (example: E7)!\n";
		} while (!validator.isValidCoordinate(getData));
		return getData;
	}
}
