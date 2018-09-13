
public class Brake {

	private boolean isBraked;

	public boolean isBraked() {
		return isBraked;
	}

	public void brake() {
		isBraked = true;
	}

	@Override
	public String toString() {
		return isBraked()? "A kerékpár lassít." : "A kerékpár halad.";
	}
	
}
