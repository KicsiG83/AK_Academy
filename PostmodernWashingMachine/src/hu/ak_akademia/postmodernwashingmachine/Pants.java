package hu.ak_akademia.postmodernwashingmachine;

public class Pants extends Dress {

	public Pants() {
		super("Nadrág");
	}

	@Override
	public void cleanCustom() {
		clean();
		if (!isTorn()) {
			setDurability(getDurability() - 1);
		}
	}
}
