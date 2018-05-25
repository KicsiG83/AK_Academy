
public class Meteoroid extends Orb{

	private String type = "Meteoroid";
	
	@Override
	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return "\n" + getName() + " - " + getType() + ". \nA súlya: " + getWeight() + " kg. \n"
				+ "Belépett egy bolygó légkörébe és elégett.\nBéke (csillag)poraira.\n";
	}
	
}
