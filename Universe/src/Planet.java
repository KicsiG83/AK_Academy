
public class Planet extends SolarSystem {

	private String type = "Bolygó";
	private String star;

	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "\n" + getName() + " - " + getType() + ". \nA súlya: " + getWeight() + " millió kg. \n" + "A "
				+ Name.randomName().getTextual() + " csillag körül kering.\n";
	}
}
