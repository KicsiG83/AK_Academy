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


	private boolean canWeStartWashing;
	private int sumDirty;
	private boolean empty;
	private boolean itIsOn;
	private boolean doorIsOpen;
	private WashingMachineStatus status;
	private boolean loaded;

	public boolean isLoaded() {
		return loaded;
	}

	public void setLoaded(boolean loaded) {
		this.loaded = loaded;
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
	
	public boolean check(Dress d) {
		if (isEmpty()) {
			System.out.println("Üresen a mosógép.");
			setCanWeStartWashing(false);
		}else if (sumDirty > 800) {
			System.out.println("Egyszerre ennyi koszos ruhát nem tud kimosni a gép.");
			setCanWeStartWashing(false);
		}else if (sumDirty < 50) {
			System.out.println("A ruhák nem elég piszkosak, nem szükségs kimosni.");
			setCanWeStartWashing(false);
		}else if (d.isColorDresses() && d.isWhiteDresses()) {
			System.out.println("A mosás indítás letiltva, a ruhák össze fogják egymást.");
			setCanWeStartWashing(false);
		}else {
			System.out.println("Ellenőrzés OK. Kezdhetjük a mosást.");
			setCanWeStartWashing(true);
		}
		return canWeStartWashing;
	}
}
