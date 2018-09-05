
public class Gear {

	private final int minGearSpeed = 1;
	private final int maxGearSpeed = 3;
	private int gearSpeed;
	
	public int getGearSpeed() {
		return gearSpeed;
	}

	public void setGearSpeed(int gearSpeed) {
		this.gearSpeed = gearSpeed;
	}

	public int getMinGearSpeed() {
		return minGearSpeed;
	}

	public int getMaxGearSpeed() {
		return maxGearSpeed;
	}

	//TODO validátor meghívása amíg a maxGearSpeed engedi
	public void gearUp(Bicycle bike) {
		gearSpeed++;
	}
	
	//TODO validátor meghívása amíg a minGearSpeed engedi
	public void gearDown(Bicycle bike) {
		gearSpeed--;
	}
	
	@Override
	public String toString() {
		return "A kerékpár váltója " + gearSpeed + " fokozatban van.";
	}
}
