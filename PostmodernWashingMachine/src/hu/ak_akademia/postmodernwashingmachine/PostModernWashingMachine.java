package hu.ak_akademia.postmodernwashingmachine;

import java.util.ArrayList;

public class PostModernWashingMachine {

	/*
	 *A mosógép csak bekapcsolt állapotban reagál a műveletekre!
	 *A mosógép nem kapcsolható be ha már be van kapcsolva, ekkor hibaüzenetet ad vissza ez a metódus!
	 *A mosógép nem kapcsolható ki ha már ki van kapcsolva, ekkor hibaüzenetet ad vissza ez a metódus!
	 *A PostModernWashingMachine osztály tartsa nyilván magáról, hogy épp be van-e kapcsolva!
	 *A PostModernWashingMachine osztály tartsa nyilván magáról, hogy épp nyitva van-e az ajtaja!
	 *A PostModernWashingMachine osztály tartsa nyilván magáról, hogy épp milyen állapotban van a következők közül: kikapcsolt, bekapcsolt, mosás folyamatban!
	 *		switchOn metódusa, amivel bekapcsolható!
	 *		switchOff metódusa, amivel kikapcsolható!
 	 *		open metódusa, amivel kinyitható az ajtaja!
	 *		close metódusa, amivel becsukható az ajtaja!
	 *		load metódusa, aminek a segítségével több ruhát is betehetünk a gépbe egyszerre!
	 *		unload metódusa, ami kiadja a mosógépben éppen bent lévő ruhákat!
	 *		iron metódusa, ami a betöltött ruhákat kivasalja!
	 *		dry metódusa, ami a betöltött ruhákat megszárítja!
	 *Legyen a PostModernWashingMachine osztálynak egy startWash metódusa, ami elindítja a mosást és kimossa a betöltött ruhákat, de csak akkor, ha a check metódus ezt jóváhagyja egy OK üzenettel!
	 * 
	 */

	private boolean canWeStartWashing;
	private int sumDirty;
	private boolean empty;
	private boolean itIsOn;
	private boolean doorIsOpen;
	private WashingMachineStatus status;
	private boolean loaded;
	public ArrayList<Dress> loadDress = new ArrayList<Dress>();

	public ArrayList<Dress> load(ArrayList<Dress> al) {
		boolean valid = false;
		int index = 0;
		if (al.size() > 0) {
			do {
				sumDirty = sumDirty + al.get(index).getDirty();
				if (sumDirty <= 800) {
					loadDress.add(al.get(index));
					index++;
				} else {
					valid = true;
				}
			} while (!valid && al.size() > index);
			al.removeAll(loadDress);
			
			/*
			 * 
			 * Ide kell betenni a mosás indítását meg a többit
			 * Ha az al > 0 akkor újra kell futtatni, ha kisebb, akkor kilép és nem fog kelleni visszatérési érték.
			 * 
			 */
			
			return al;
		}else {
			System.out.println("Nincs ilyen színű ruha kupac.");
			return al;
		}
	}
	
	public boolean isLoaded() {
		return loaded;
	}

	public void setLoaded(boolean loaded) {
		this.loaded = loaded;
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
		if(canWeStartWashing) {
			
		}else {
			System.out.println("Mosás nem indítható.");
		}
	}
	
	public boolean check(Dress d) {
		if (isEmpty()) {
			System.out.println("Üresen a mosógép.");
			return canWeStartWashing = false;
		}else if (sumDirty > 800) {
			System.out.println("Egyszerre ennyi koszos ruhát nem tud kimosni a gép.");
			return canWeStartWashing = false;
		}else if (sumDirty < 50) {
			System.out.println("A ruhák nem elég piszkosak, nem szükségs kimosni.");
			return canWeStartWashing = false;
		}else if (d.isColorDresses() && d.isWhiteDresses()) {
			System.out.println("A mosás indítás letiltva, a ruhák össze fogják egymást.");
			return canWeStartWashing = false;
		}else {
			System.out.println("Ellenőrzés OK. Kezdhetjük a mosást.");
			return canWeStartWashing = true;
		}
	}
}
