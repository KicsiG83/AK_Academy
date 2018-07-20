package hu.ak_akademia.postmodernwashingmachine;

public class Tshirt extends Dress {

	public Tshirt() {
		super("Póló");
	}

	@Override
	public void cleanCustom() {
		clean();
		if (!isTorn()) {
			setDurability(getDurability() - 3);
		}
	}

}
