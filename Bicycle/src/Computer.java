
public class Computer {

	private int maxSpeed;
	private boolean isOn;
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public Computer() {
	}

	public void speedUp() {
		//TODO betenni a sebesség fokozatokat
	}
	
	public void slowDown() {
		//TODO A fék meghívásával egy időben csökkenteni a sebességet
	}
}
