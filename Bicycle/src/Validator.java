
public class Validator {

	public boolean checkPressure(int pressure, int max) {
		return max > pressure ? false : true;
	}

	public boolean checkGear(int gearSpeed, int minGearSpeed, int maxGearSpeed) {
		if(gearSpeed >= minGearSpeed && gearSpeed <= maxGearSpeed) {
			return true;
		}
		return false;
	}
	
}
