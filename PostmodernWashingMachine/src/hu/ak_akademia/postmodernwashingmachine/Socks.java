package hu.ak_akademia.postmodernwashingmachine;


public class Socks extends Dress {
	
	public Socks() {
		super("Zokni");
	}
	
	@Override
	public void cleanCustom() {
		clean();
		if (!isTorn()) {
			setDurability(getDurability() - 4);
		}
	}
}
