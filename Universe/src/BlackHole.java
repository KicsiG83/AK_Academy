
public class BlackHole extends Star {

	private String type = "Fekete lyuk";
	private boolean gravitation = true;
	private double rotation;
	private int electricCharge;

	public BlackHole() {
		this.setName(Name.randomName().getTextual());
		this.setWeight();
		this.setElectricCharge(Orb.randomNumber());
		this.setRotation(0.95);
	}

	@Override
	public String toString() {
		return "\n" + getName() + " - " + getType() + ". \nA súlya: " + getWeight() + " millió kg. \nForgási sebesége: "
				+ getRotation() + " a* vagyis ~950 forgás \\ mp.\n" + "Elektromos töltése: " + getElectricCharge()
				+ " yottawatt\n";
	}

	public int getElectricCharge() {
		return electricCharge;
	}

	public void setElectricCharge(int electricCharge) {
		this.electricCharge = electricCharge;
	}

	public double getRotation() {
		return rotation;
	}

	public void setRotation(double d) {
		this.rotation = d;
	}

	public boolean isGravitation() {
		return gravitation;
	}

	@Override
	public String getType() {
		return type;
	}
}
