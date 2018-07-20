package hu.ak_akademia.postmodernwashingmachine;

import java.util.ArrayList;

public class Main {

	/*
	 * Mosás alatt ne lehessen kinyitni a mosógép ajtaját, ekkor hibaüzenetet adjon
	 * vissza az open metódus és ne nyíljon ki! Ha már be van csukva az ajtaja a
	 * mosógépnek, akkor ne lehessen újra becsukni, ekkor a close metódus adjon
	 * vissza egy hibaüzenetet! A mosás során minden egyes clean metódushívás
	 * hatására a ruhák, különböző mértékben - a rá éppen jellemző rátával -
	 * csökkentsék a durability-jét a ruhának! A mosógép metódusainak meghívása
	 * tájékoztassa a felhasználót a standard kimeneten, hogy melyik művelet került
	 * meghívásra és annak mi az eredménye! Ha egy ruha durability-je eléri a
	 * nullát, akkor szakadjon el! A Main osztály main metódusában hozz létre egy
	 * mosógépet és hozz létre koszos ruhákat, kapcsold be a mosógépet, nyisd ki az
	 * ajtaját, töltsd be a koszos ruhákat és mosd ki őket! Amint a mosás
	 * befejeződik, szárítsd meg a ruhákat, vasaltasd ki őket, majd nyisd ki az
	 * ajtaját, vedd ki a ruhákat a gépből és kapcsold ki azt és teregesd ki a
	 * ruhákat a standard kimenetre a ruhák toString-jének meghívásával!
	 * 
	 */

	private ArrayList<ArrayList<Dress>> allDress = new ArrayList<ArrayList<Dress>>();
	private ArrayList<Dress> whiteDressArrayList = new ArrayList<Dress>();
	private ArrayList<Dress> colorDressArrayList = new ArrayList<Dress>();

	public static void main(String[] args) throws InterruptedException {
		new Main().run();
	}

	private void run() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			Dress ts = new Tshirt();
			Dress s = new Socks();
			Dress p = new Pants();
			Dress up = new Underpants();
			checkColor(ts);
			checkColor(s);
			checkColor(p);
			checkColor(up);
		}
		System.out.print("Színes ruhák: ");
		printColor();
		System.out.println("----------------------------------------------------------------");
		System.out.print("Fehér ruhák: ");
		printWhite();
		allDress.add(colorDressArrayList);
		allDress.add(whiteDressArrayList);
		PostModernWashingMachine pmwm = new PostModernWashingMachine();
		
		for (int j = 0; j < allDress.size(); j++) {
			while (Dress.jo || allDress.get(j).size()>0) {
				pmwm.setSumDirty(0);
				pmwm.load(allDress.get(j));
				System.out.println("Összkoszosság: " + pmwm.getSumDirty() + " Betöltött ruhák: " + pmwm.loadDress);
				pmwm.startWash(pmwm.loadDress);
			}
		}
	}

	private void checkColor(Dress d) {
		if (d.getColor().equals("Fehér")) {
			whiteDressArrayList.add(d);
		} else {
			colorDressArrayList.add(d);
		}
	}

	private void printWhite() {
		System.out.println(whiteDressArrayList);
	}

	private void printColor() {
		System.out.println(colorDressArrayList);

	}

}
