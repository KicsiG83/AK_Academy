import java.util.Scanner;

public class UserInput {

	public void getCoordinate(Scanner sc) {
		System.out.print("Please enter the ship's coordinate: ");
		String input = sc.nextLine().toUpperCase();
		System.out.println(new Validators().coordinateLengthValidator(input));
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
					getCoordinate(sc);
					valid = true;
				}
			}catch (Exception e) {
				sc.nextLine();
				System.out.println("Invalid input.");
			}
		}while(!valid);
	}
	
}
