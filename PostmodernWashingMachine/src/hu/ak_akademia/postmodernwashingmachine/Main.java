package hu.ak_akademia.postmodernwashingmachine;

public class Main {

	public static void main(String[] args) {

		PostModernWashingMachine pmm = new PostModernWashingMachine();
		Dress zokni = new Socks();
		pmm.setEmpty(true);
		pmm.setDoorIsOpen(false);
		zokni.setWhiteDresses(true);
		pmm.setSumDirty(80);
		zokni.setColorDresses(false);
		zokni.setWhiteDresses(true);
		
		System.out.println(pmm.check(zokni));
		
	}

}
