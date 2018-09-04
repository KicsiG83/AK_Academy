
public class Lamp {

	private boolean lampOn;
	
	public boolean isLampOn() {
		return lampOn;
	}

	public void setLampOn(boolean lampOn) {
		this.lampOn = lampOn;
	}

	public void setOn(boolean isOn) {
		this.lampOn = isOn;
	}

	public void turnOn() {
		setOn(true);		
	}
	
	public void turnOff() {
		setOn(false);
	}
	
	@Override
	public String toString() {
		return isLampOn() ? "A lámpa be van kapcsolva." : "A lámpa ki van kapcsolva.";
	}
	
}
