
public class Galaxis extends Orb{

	private String type = "Galaxis";
	private int stars = Orb.randomNumber();

	public int getStars() {
		return stars;
	}

	@Override
	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return "\n" + getName() + " - " + getType() + ". \nA súlya: " + getWeight() + " millió kg. \n"
				+ "Átmérője " + getDiameter() + " millió km.\n"  + getStars() + " millió csillag van benne.\n";
	}
	
}
