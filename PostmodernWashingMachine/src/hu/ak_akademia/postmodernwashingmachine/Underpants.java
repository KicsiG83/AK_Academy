package hu.ak_akademia.postmodernwashingmachine;

public class Underpants extends Dress {

	public Underpants() {
		super("Alsógatya");
	}

	@Override
	public void cleanCustom() {
		clean();
		if (!isTorn()) {
			setDurability(getDurability() - 2);
		}
	}
}
