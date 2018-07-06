import java.util.Scanner;

public class UserInput {
	
	private int stepVertical;
	private int stepHorizontal;
	Validators validator = new Validators();

	//public void getCoordinate(Scanner sc) {
	//System.out.print("Please enter the ship's coordinate: ");
	//String input = sc.nextLine().toUpperCase();
	//System.out.println(validator.coordinateLengthValidator(input));
	//}
	
	public void setCoordinate(Scanner scanner, String message) {
		String error = "";
		String getData = "  ";
		do {
			System.out.print(error);
			System.out.print(message);
			getData = scanner.nextLine().toUpperCase();
			error = "The given coordinates do not meet the table size.\nYou must select an existing coordinate from the table (example: E7)!\n";
		} while (!validator.isValidCoordinate(getData));
		stepVertical = getData.charAt(0)-65;
		if (getData.length()==3) {
			stepHorizontal = 9;
		}else {
			stepHorizontal = Integer.parseInt(Character.toString(getData.charAt(1))) - 1;
		}
		//alábbi csak, hogy lássuk futáskor is, hogy mi értékelődik ki:
		System.out.println("\nBetű kiértékelés: "+ stepVertical + " <- Az érték a vertikális (hanyadik oszlop) tömb indexét mutatja (pl: A = tömb index 0);\n generálva: UserInput.setCoordinate");
		System.out.println("Szám kiértékelés: "+ stepHorizontal + " <- Az érték a horizontális (hanyadik sor) tömb indexét mutatja (pl: 1 = tömb index 0);\n generálva: UserInput.setCoordinate");
	}
	

	public int getStepVertical() {
		return stepVertical;
	}


	public int getStepHorizontal() {
		return stepHorizontal;
	}


	public void selectShip(Scanner sc) {
		boolean valid = false;
		System.out.println("Ships:\n1 - " + LetsPlay.Ships.CARRIER + "\n2 - " + LetsPlay.Ships.BATTLESHIP + "\n3 - "
				+ LetsPlay.Ships.CRUISER + "\n4 - " + LetsPlay.Ships.SUBMARINE + "\n5 - " + LetsPlay.Ships.DESTROYER);
		do{
			try {
				System.out.print("Please select a ship: ");
				int shipIndex = sc.nextInt();
				sc.nextLine();
				if(shipIndex < 1 || shipIndex > 5) {
					System.out.println("Invalid input.");
				}else {
					setCoordinate(sc, "Please enter the ship's coordinate: ");
					valid = true;
				}
			}catch (Exception e) {
				sc.nextLine();
				System.out.println("Invalid input.");
			}
		}while(!valid);
	}
	
}
