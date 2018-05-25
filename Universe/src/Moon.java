
public class Moon extends Orb {

	private String type ="Hold";
	
	@Override
	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return "\n" + getName() + " - " + getType() + ". \nA súlya: " + getWeight() + " millió kg. \n"
				+ Name.randomName().getTextual() + " bolygó holdja.\n";
	}
}
