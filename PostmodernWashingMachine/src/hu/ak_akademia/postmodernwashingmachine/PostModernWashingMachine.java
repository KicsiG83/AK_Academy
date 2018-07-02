package hu.ak_akademia.postmodernwashingmachine;

public class PostModernWashingMachine {

	/*
	 * Legyen a PostModernWashingMachine osztálynak egy switchOn metódusa, amivel bekapcsolható! 
	 * Legyen a PostModernWashingMachine osztálynak egy switchOff metódusa, amivel kikapcsolható! 
	 * Legyen a PostModernWashingMachine osztálynak egy open metódusa, amivel kinyitható az ajtaja! 
	 * Legyen a PostModernWashingMachine osztálynak egy close metódusa, amivel becsukható az ajtaja! 
	 * Legyen a PostModernWashingMachine osztálynak egy load metódusa, aminek a segítségével több ruhát is betehetünk a gépbe egyszerre! 
	 * Legyen a PostModernWashingMachine osztálynak egy unload metódusa, ami kiadja a mosógépben éppen bent lévő ruhákat! 
	 * Legyen a PostModernWashingMachine osztálynak egy iron metódusa, ami a betöltött ruhákat kivasalja! 
	 * Legyen a PostModernWashingMachine osztálynak egy dry metódusa, ami a betöltött ruhákat megszárítja! 
	 * Legyen a PostModernWashingMachine osztálynak egy startWash metódusa, ami elindítja a mosást és kimossa a betöltött ruhákat, de csak akkor, ha a check metódus ezt jóváhagyja egy OK üzenettel!
	 */

	private boolean whiteDresses;
	private boolean colorDresses;
	private boolean canWeStartWashing;
	private int sumDirty;
	private boolean empty;
	private boolean itIsOn;
	private boolean doorIsOpen;
	private WashingMachineStatus status;

	public boolean isWhiteDresses() {
		return whiteDresses;
	}

	public void setWhiteDresses(boolean whiteDresses) {
		this.whiteDresses = whiteDresses;
	}

	public boolean isColorDresses() {
		return colorDresses;
	}

	public void setColorDresses(boolean colorDresses) {
		this.colorDresses = colorDresses;
	}

	public boolean isCanWeStartWashing() {
		return canWeStartWashing;
	}

	public void setCanWeStartWashing(boolean canWeStartWashing) {
		this.canWeStartWashing = canWeStartWashing;
	}

	public int getSumDirty() {
		return sumDirty;
	}

	public void setSumDirty(int sumDirty) {
		this.sumDirty = sumDirty;
	}

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean isEmpty) {
		this.empty = isEmpty;
	}

	public boolean isItIsOn() {
		return itIsOn;
	}

	public void setItIsOn(boolean itIsOn) {
		this.itIsOn = itIsOn;
	}

	public boolean isDoorIsOpen() {
		return doorIsOpen;
	}

	public void setDoorIsOpen(boolean doorIsOpen) {
		this.doorIsOpen = doorIsOpen;
	}

	public WashingMachineStatus getStatus() {
		return status;
	}

	public void setStatus(WashingMachineStatus status) {
		this.status = status;
	}

	public void switchOn() {
		setItIsOn(true);
	}

	public void switchOff() {
		setItIsOn(false);
	}

	public void open() {
		setDoorIsOpen(true);
	}

	public void close() {
		setDoorIsOpen(false);
	}

	public void load() {

	}

	public void unload() {

	}

	public void iron() {

	}

	public void dry() {

	}

	public void startWash() {
		
	}
	
	public void check() {
		if (isEmpty()) {
			System.out.println("Üresen a mosógép.");
			setCanWeStartWashing(false);
		}
		if (sumDirty > 800) {
			System.out.println("Egyszerre ennyi koszos ruhát nem tud kimostni a mosógép.");
			setCanWeStartWashing(false);
		}
		if (sumDirty < 50) {
			System.out.println("A ruhák nem elég piszkosak a hatékony mosás elindításához.");
			setCanWeStartWashing(false);
		}
		if (whiteDresses && colorDresses) {
			System.out.println("A mosás indítás letiltva, a ruhák össze fogják egymást.");
			setCanWeStartWashing(false);
		}
	}
}
