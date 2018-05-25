
public class Pulsar extends Star{

	private String type = "Pulsar";
	private boolean xRay = true;

	public boolean isxRay() {
		return xRay;
	}

	@Override
	public String getType() {
		return type;
	}
	
	/*
	 * Még nincs kész a Pulzár!
	 * @see Orb#toString()
	 */
	
	@Override
	public String toString() {
		return "\n" + getName() + " - " + getType() + ". \nA súlya: " + getWeight() + " millió kg.\n" + "Átmérője: " + getDiameter() + " millió km.\n" + (isxRay()? "Röntgensugárzást bocsát ki.\n": "Meglepő módon nem bocsát ki röntgenrugárzást.\n");
	}
	
}
