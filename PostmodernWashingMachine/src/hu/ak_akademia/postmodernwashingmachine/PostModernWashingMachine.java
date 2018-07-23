package hu.ak_akademia.postmodernwashingmachine;

import java.util.ArrayList;

public class PostModernWashingMachine {

	private boolean canWeStartWashing;
	public static int sumDirty;
	private boolean empty;
	private boolean itIsOn;
	private boolean door;
	private WashingMachineStatus status;
	private boolean loaded;
	public ArrayList<Dress> loadDress = new ArrayList<Dress>();

	public ArrayList<Dress> load(ArrayList<Dress> al) throws InterruptedException {
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
			Dress.valid = true;
			setLoaded(true);
			System.out.println("Összkoszosság: " + getSumDirty() + " Betöltött ruhák: " + loadDress);
			Thread.sleep(2000);
			startWash(loadDress);
			return al;
		} else {
			System.out.println("Kevés vagy nincs ilyen színű ruha kupac.");
			Dress.valid = false;
			setLoaded(false);
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
		System.out.println(isDoorIsOpen() ? "Ajtó nyitva" : "Ajtó zárva.");
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
		if (isDoorIsOpen()) {
			System.err.println("Az ajtó már nyitva van!");
		} else {
			setDoorIsOpen(true);
		}
	}

	public void close() {
		if (isDoorIsOpen()) {
			System.err.println("Az ajtó már csukva van!");
		} else {
			setDoorIsOpen(false);
		}
	}

	public void unload(ArrayList<Dress> arrayList) {
		arrayList.clear();
	}

	public void startWash(ArrayList<Dress> arrayList) throws InterruptedException {
		check(arrayList);
		if (canWeStartWashing) {
			switchOn();
			System.out.println(WashingMachineStatus.TURNON.getTextual());
			if (!isDoorIsOpen()) {
				setDoorIsOpen(true);
			}
			System.out.println(WashingMachineStatus.INPROGRESS.getTextual());
			System.out.println(isLoaded() ? "A ruhák betöltve. " : "A ruhák nincsenek betöltve.");
			setDoorIsOpen(false);
			if (!isDoorIsOpen()) {
				wash(arrayList);
				dry(arrayList);
				iron(arrayList);
				setDoorIsOpen(true);
				isDoorIsOpen();
				unload(arrayList);
				switchOff();
				System.out.println(isItIsOn() ? WashingMachineStatus.TURNON.getTextual()
						: WashingMachineStatus.TURNOFF.getTextual());
				System.out.println(new Print().getClothesAreCovered());
				Thread.sleep(1500);
			}
		} else {
			System.out.println(isLoaded() ? "A ruhák betöltve. " : "A ruhák nincsenek betöltve.");
			System.out.println("---------------- Mosás nem indítható. ----------------");
		}
	}

	private void iron(ArrayList<Dress> arrayList) throws InterruptedException {
		System.out.println(arrayList + "\n---------------- Vasalás elindítva. ----------------");
		Thread.sleep(1000);
		System.out.println(arrayList + "\n---------------- Vasalás vége. ----------------");
		for (int i = 0; i < arrayList.size(); i++) {
			arrayList.get(i).iron();
		}
		Thread.sleep(1000);
		System.out.println(arrayList);
	}

	public void wash(ArrayList<Dress> arrayList) throws InterruptedException {
		System.out.println("---------------- Mosás elindítva. ----------------");
		while (sumDirty > 30) {
			for (int i = 0; i < arrayList.size(); i++) {
				arrayList.get(i).cleanCustom();
				System.out.println(arrayList.get(i).getName() + " - koszosság: " + arrayList.get(i).getDirty()
						+ " Szín: " + arrayList.get(i).getColor());
				System.out.println("Összkoszosság: " + getSumDirty());
				System.out.println("Vizesség: " + arrayList.get(i).getWet());
				System.out.println("Tartósság: " + arrayList.get(i).getDurability());
			}
			Thread.sleep(1000);
		}
		System.out.println("---------------- Mosás vége. ----------------\n" + arrayList);
	}

	private void dry(ArrayList<Dress> arrayList) throws InterruptedException {
		System.out.println("---------------- Szárítás elindítva. ----------------\n" + arrayList);
		Thread.sleep(1000);
		for (int i = 0; i < arrayList.size(); i++) {
			arrayList.get(i).dry();
		}
		System.out.println("---------------- Szárítás vége. ----------------");
	}

	public boolean check(ArrayList<Dress> arrayList) {
		if (isEmpty()) {
			System.out.println("Üresen a mosógép.");
			return canWeStartWashing = false;
		} else if (sumDirty > 800) {
			System.out.println("Egyszerre ennyi koszos ruhát nem tud kimosni a gép.");
			return canWeStartWashing = false;
		} else if (sumDirty < 50) {
			System.out.println("A ruhák nem elég piszkosak, nem szükségs kimosni.");
			arrayList.clear();
			return canWeStartWashing = false;
		} else {
			System.out.println("Ellenőrzés OK. Kezdhetjük a mosást.");
			return canWeStartWashing = true;
		}
	}
}
