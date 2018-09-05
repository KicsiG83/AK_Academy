
public class Validator {

	public boolean checkPressure(int pressure, int max) {
		return max > pressure ? false : true;
	}

	public boolean checkGear() {
		return false;
	}
	
}
