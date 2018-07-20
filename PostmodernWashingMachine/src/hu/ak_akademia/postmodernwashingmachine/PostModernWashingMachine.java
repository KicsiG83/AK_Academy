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
	public static int sumDirty;
	private boolean empty;
	private boolean itIsOn;
	private boolean door;
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
					sumDirty = sumDirty - al.get(index).getDirty();
					valid = true;
				}
			} while (!valid && al.size() > index);
			al.removeAll(loadDress);
			Dress.jo=true;
			return al;
		}else {
			System.out.println("Nincs ilyen színű ruha kupac.");
			Dress.jo=false;
			return al;
		}
	}
	
	public boolean isLoaded() {
		return loaded;
	}

	public void setLoaded(boolean loaded) {
		this.loaded = loaded;
	}

	public static int getSumDirty() {
		return sumDirty;
	}

	public static void setSumDirty(int number) {
		sumDirty = number;
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
		return door;
	}

	public void setDoorIsOpen(boolean doorIsOpen) {
		this.door = doorIsOpen;
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

	public void unload() {

	}

	public void startWash(ArrayList<Dress> arrayList) throws InterruptedException {
		check(arrayList);
		if(canWeStartWashing) {
			//ide betenni az ajtónyitást ... 
			System.out.println("---------------- Mosás elindítva. ----------------");
			wash(arrayList);
			System.out.println("---------------- Mosás vége. ----------------");
			System.out.println(arrayList);
			System.out.println("---------------- Szárítás elindítva. ---------------- ");
			System.out.println(arrayList);
			dry(arrayList);
			System.out.println("---------------- Szárítás vége. ----------------");
			System.out.println(arrayList);
			System.out.println("---------------- Vasalás elindítva. ----------------");
			System.out.println(arrayList);
			iron(arrayList);
			System.out.println("---------------- Vasalás vége. ----------------");
			System.out.println(arrayList);
			//ajtó nyitás + kipakolás
			System.out.println("A ruhák mosva, vasalva, teregetve.");
			arrayList.clear();
		}else {
			System.out.println("---------------- Mosás nem indítható. ----------------");
		}
	}

	private void iron(ArrayList<Dress> arrayList) {
		for(int i = 0; i < arrayList.size(); i++) {
			arrayList.get(i).iron();
		}
	}

	public void wash(ArrayList<Dress> arrayList) throws InterruptedException {
		while (sumDirty > 30) {
			for (int i = 0; i < arrayList.size(); i++) {
					arrayList.get(i).cleanCustom();
				System.out.println(arrayList.get(i).getName() + " - koszosság: " + arrayList.get(i).getDirty() + " Szín: " + arrayList.get(i).getColor() );
				System.out.println("Összkoszosság: " + getSumDirty());
				System.out.println("Vizesség: " + arrayList.get(i).getWet());
				System.out.println("Tartósság: " + arrayList.get(i).getDurability());
			}
			Thread.sleep(1000);
		}
	}

	private void dry(ArrayList<Dress> arrayList) {
		for(int i = 0; i < arrayList.size(); i++) {
			arrayList.get(i).dry();
		}
	}

	public boolean check(ArrayList<Dress> arrayList) {
		if (isEmpty()) {
			System.out.println("Üresen a mosógép.");
			return canWeStartWashing = false;
		}else if (sumDirty > 800) {
			System.out.println("Egyszerre ennyi koszos ruhát nem tud kimosni a gép.");
			return canWeStartWashing = false;
		}else if (sumDirty < 50) {
			System.out.println("A ruhák nem elég piszkosak, nem szükségs kimosni.");
			arrayList.clear();
			return canWeStartWashing = false;
		}else {
			System.out.println("Ellenőrzés OK. Kezdhetjük a mosást.");
			return canWeStartWashing = true;
		}
	}
}
