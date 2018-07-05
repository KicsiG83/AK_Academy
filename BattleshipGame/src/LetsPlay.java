import java.util.Scanner;

public class LetsPlay {

	public enum Ships {
		CARRIER(5) {public String toString(){return "Carrier";}}, 
		BATTLESHIP(4) {public String toString(){return "Battleship";}},  
		CRUISER(3) {public String toString(){return "Crusier";}},  
		SUBMARINE(3) {public String toString(){return "Submarine";}},  
		DESTROYER(2) {public String toString(){return "Destroyer";}}; 
		private int size;
		Ships(int ship) { this.size = ship; }
		int getSize() { return size; }
	};
	
	Table ownTable = new Table("OWN TABLE", '•');	
	Table opponentTable = new Table("OPPONENT TABLE", '-');	
	Ship carrier = new Ship(Ships.CARRIER.toString(), Ships.CARRIER.getSize(), 1);
	Ship battleship = new Ship(Ships.BATTLESHIP.toString(), Ships.BATTLESHIP.getSize(), 2);
	Ship cruiser = new Ship(Ships.CRUISER.toString(), Ships.CRUISER.getSize(), 3);
	Ship submarine = new Ship(Ships.SUBMARINE.toString(), Ships.SUBMARINE.getSize(), 4);
	Ship destroyer = new Ship(Ships.DESTROYER.toString(), Ships.DESTROYER.getSize(), 5);
	
	public void getUserInput(Scanner sc) {
		new UserInput().selectShip(sc);
	}
	
}
