
public class BlackHole extends SimpleObject {

	private String type = "Fekete lyuk";
	private boolean gravitation = true;
	private double rotation;
	private int electricCharge;
	
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
	
	public void printBlackHole(String inputName, String inputType, int inputWeight, double inputRotation, int inputElectricCharge) {
		String printName = inputName;
		String printType = inputType;
		int printWeight = inputWeight;
		double printRotation = inputRotation;
		int printElectricCharge = inputElectricCharge;
		System.out.println(printName + " - " + printType + ". \nA súlya: " + printWeight + " millió kg. \nForgási sebesége: " + printRotation + " a* vagyis ~950 forgás \\ mp.\n" + "Elektromos töltése: " + printElectricCharge + " yottawatt\n");
	}
}
