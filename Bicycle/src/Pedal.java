
public class Pedal {

	private boolean isTwist;
	
	public boolean isTwist() {
		return isTwist;
	}

	public void setTwist(boolean isTwist) {
		this.isTwist = isTwist;
	}

	public Pedal() {
	}

	//TODO a tekeréssel növelni kell a sebességet és a kilómétert
	public boolean twist() {
		return isTwist();
	}
	
}
