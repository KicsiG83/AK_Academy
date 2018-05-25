
public class RedGiant extends Star {

	private String type = "Vörös óriás";

	@Override
	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return "\n" + getName() + " - " + getType() + ". \nA súlya: " + getWeight() + " millió kg. \n"
				+ "Átmérője: " + getDiameter() + " millió km.\n" + "Felfúvódása közben, közel "+ rn.nextInt(10) + " millió évvel ezelőtt elnyelte a(z) " + Name.randomName().getTextual() + " bolygót.\n";
	}
	
}
