
public class Gear {

	private final int minGearSpeed = 1;
	private final int maxGearSpeed = 3;
	private int gearSpeed;
	
	{
		gearSpeed = 1;
	}
	
	public int getGearSpeed() {
		return gearSpeed;
	}

	//TODO validátor meghívása amíg a maxGearSpeed engedi
	public void gearUp() {
		int gear = gearSpeed + 1;
		if (new Validator().checkGear(gear, minGearSpeed, maxGearSpeed)) {
			gearSpeed = gear;
		} else {
			System.out.println("Nincs ilyen fokozat!");
		}
	}
	
	//TODO validátor meghívása amíg a minGearSpeed engedi
	public void gearDown() {
		int gear = gearSpeed - 1;
		if (new Validator().checkGear(gear, minGearSpeed, maxGearSpeed)) {
			gearSpeed = gear;
		} else {
			System.out.println("Nincs ilyen fokozat!");
		}
	}
	
	@Override
	public String toString() {
		return "A kerékpár váltója " + gearSpeed + " fokozatban van.";
	}
}
