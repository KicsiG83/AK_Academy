import java.util.Scanner;

public class LetsPlay {

	Ship carrier = new Ship(Ships.CARRIER.getName(), Ships.CARRIER.getSize(), 1);
	Ship battleship = new Ship(Ships.BATTLESHIP.getName(), Ships.BATTLESHIP.getSize(), 2);
	Ship cruiser = new Ship(Ships.CRUISER.getName(), Ships.CRUISER.getSize(), 3);
	Ship submarine = new Ship(Ships.SUBMARINE.getName(), Ships.SUBMARINE.getSize(), 4);
	Ship destroyer = new Ship(Ships.DESTROYER.getName(), Ships.DESTROYER.getSize(), 5);
	Table t = new Table();
	UserInput ui = new UserInput();

	public void getUserInput(Scanner sc) {
		int ship = ui.selectShip(sc);
		int shipLength = checkShipLength(ship);
		int shipDirection = ui.selectDirection(sc);
		String coordinate = ui.getCoordinate(sc, "Please enter the ship's coordinate: ");
		t.getCoordinate(coordinate);
		t.checkPosition(t.getStepHorizontal(), t.getStepVertical(), shipDirection, shipLength);
//		t.setCoordinate(sc, message, shipDirection, shipLength);
	}

	private int checkShipLength(int shipIndex) {
		int shipLength = 0;
		switch (shipIndex) {
		case 1:
			shipLength = Ships.CARRIER.getSize();
			break;
		case 2:
			shipLength = Ships.BATTLESHIP.getSize();
			break;
		case 3:
			shipLength = Ships.CRUISER.getSize();
			break;
		case 4:
			shipLength = Ships.SUBMARINE.getSize();
			break;
		case 5:
			shipLength = Ships.DESTROYER.getSize();
			break;
		}
		return shipLength;
	}
}
