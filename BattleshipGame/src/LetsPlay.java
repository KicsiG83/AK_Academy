import java.util.Scanner;

public class LetsPlay {

	Table ownTable = new Table("OWN TABLE", '•');
	Table opponentTable = new Table("OPPONENT TABLE", '-');
	Ship carrier = new Ship(Ships.CARRIER.getName(), Ships.CARRIER.getSize(), 1);
	Ship battleship = new Ship(Ships.BATTLESHIP.getName(), Ships.BATTLESHIP.getSize(), 2);
	Ship cruiser = new Ship(Ships.CRUISER.getName(), Ships.CRUISER.getSize(), 3);
	Ship submarine = new Ship(Ships.SUBMARINE.getName(), Ships.SUBMARINE.getSize(), 4);
	Ship destroyer = new Ship(Ships.DESTROYER.getName(), Ships.DESTROYER.getSize(), 5);

	public void getUserInput(Scanner sc) {
		new UserInput().selectShip(sc);
	}
}
