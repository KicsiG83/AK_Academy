
public class Nova extends Star{

	
	private String type = "Nóva";
	private int brightness;
	private int outbrust;

	public Nova() {
		this.setName(Name.randomName().getTextual());
		this.setType(type);
		this.setWeight();
		this.setDiameter();
		this.setBrightness(rn.nextInt(14)+6);
		this.setOutbrust(rn.nextInt(100));
	}
	
	
	public int getBrightness() {
		return brightness;
	}
	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}
	public int getOutbrust() {
		return outbrust;
	}
	public void setOutbrust(int outbrust) {
		this.outbrust = outbrust;
	}
	
	@Override
	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return "\n" + getName() + " - " + getType() + ". \nA súlya: " + getWeight() + " millió kg. \n"
			+ "Átmérője:  " + getDiameter() + " millió km.\n" + "Legutóbbi kitörése: " + getOutbrust() + " éve volt, a kitörés fényessége: " + getBrightness() + " magnitúdó volt.\n";
	}
	
}
