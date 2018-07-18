package hu.ak_akademia.postmodernwashingmachine;

import java.util.ArrayList;

public class Main {

	/*
	 *A mosás során másodpercenként hívja meg a mosás alatt lévő ruhák clean metódusát, aminek a hatására a ruhák 1-gyel tisztábbak lesznek, vagyis csökken a koszossági mutatójuk 1-gyel!
	 *A mosás akkor fejeződjön be, ha a mosás alatt lévő ruhák összkoszossága kisebb, mint 30!
	 *Mosás alatt ne lehessen kinyitni a mosógép ajtaját, ekkor hibaüzenetet adjon vissza az open metódus és ne nyíljon ki!
	 *Ha már be van csukva az ajtaja a mosógépnek, akkor ne lehessen újra becsukni, ekkor a close metódus adjon vissza egy hibaüzenetet!
	 *A mosás során minden egyes clean metódushívás hatására a ruhák, különböző mértékben - a rá éppen jellemző rátával - csökkentsék a durability-jét a ruhának!
	 *A mosógép metódusainak meghívása tájékoztassa a felhasználót a standard kimeneten, hogy melyik művelet került meghívásra és annak mi az eredménye!
	 *Ha egy ruha durability-je eléri a nullát, akkor szakadjon el!
	 *A Main osztály main metódusában hozz létre egy mosógépet és hozz létre koszos ruhákat, kapcsold be a mosógépet, nyisd ki az ajtaját, töltsd be a kosos ruhákat és mosd ki őket! 
	 *Amint a mosás befejeződik, 
	 *		szárítsd meg a ruhákat, 
	 *		vasaltasd ki őket, 
	 *		majd nyisd ki az ajtaját, 
	 *		vedd ki a ruhákat a gépből és kapcsold ki 
	 *		azt és teregesd ki a ruhákat a standard kimenetre a ruhák toString-jének meghívásával! 
	 * 
	 */
	
	private ArrayList<Dress> whiteDressArrayList = new ArrayList<Dress>();
	private ArrayList<Dress> colorDressArrayList = new ArrayList<Dress>();
	
	public static void main(String[] args) {
		new Main().run();
		
//		Dress zokni = new Socks();
//		pmwm.setEmpty(false);
//		pmwm.setDoorIsOpen(true);
//		zokni.setWhiteDresses(true);
//		pmwm.setSumDirty(80);
//		zokni.setColorDresses(false);
//		zokni.setWhiteDresses(true);
//		
//		System.out.println(pmwm.check(zokni));
		
	}

	private void run() {
		for(int i = 0; i < 10; i++) {
//			Dress ts = new Tshirt();
//			Dress s = new Socks();
//			Dress p = new Pants();
			Dress up = new Underpants();
//			checkColor(ts);
//			checkColor(s);
//			checkColor(p);
			checkColor(up);
		}
		printColor();
		System.out.println("----------------------------------------------------------------");
		printWhite();
		PostModernWashingMachine pmwm = new PostModernWashingMachine();
		pmwm.loadDressToWashingMachine(whiteDressArrayList);
		System.out.println(" Betöltött ruhák: " + pmwm .loadDress);
		
	}

	private void checkColor(Dress d) {
		if(d.getColor().equals("Fehér")){
			whiteDressArrayList.add(d);
		}else {
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
