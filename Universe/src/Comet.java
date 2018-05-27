
public class Comet extends Orb {
	private String type = "Üstökös";
	private boolean coma = true;
	private boolean plume = true;

	public boolean isComa() {
		return coma;
	}

	public void setComa(boolean coma) {
		this.coma = coma;
	}

	public boolean isPlume() {
		return plume;
	}

	public void setPlume(boolean plume) {
		this.plume = plume;
	}
	
	@Override
	public String getType() {
		return type;
	}

	@Override
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "\n" + getName() + " - " + getType() + ". \nA súlya: " + getWeight() + " millió kg. \n"
				+ (coma ? "Van kómája" : "Nincs kómája.") + "\n" + (plume ? "Van csóvája" : "Nincs csóvája");
	}
}