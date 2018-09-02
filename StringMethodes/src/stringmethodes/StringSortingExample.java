package stringmethodes;

import java.util.Arrays;

public class StringSortingExample {
	public static void main(String[] args) {
		String text = "Hétsikű koponyányimonyó";
		// a toCharArray metódus megfogja a String összes betűjét az elejétől a végéig és egyesével betetszi őket egy karaktertömbbe
		char[] characters = text.toCharArray();
		// kiíratjuk ezt a karaktertömböt
		System.out.println(Arrays.toString(characters));
		// a compareTo metódus megvizsgálja, hogy ABC sorrendben melyik String van elölrébb
		// ha a vizsgált előrébb van, mint a parméterként kapott másik ("a".compareTo("z")), akkor negatív számot vissza
		// ha mindkettő azonos értéká (pl. "alma".compareTo("alma")), akkor 0-át ad vissza
		// ha a vizsgált hátrébb van, mint a vizsgálandó (pl "zeller".compareTo("alma")), akkor pozitív számot ad vissza
		System.out.println(text.compareTo("Alma"));
		System.out.println(text.compareTo("Hétsikű koponyányimonyó"));
		System.out.println(text.compareTo("Zeller"));

		// felveszünk egy String tömböt, benne nevekkel
		String[] names = { "Zoli", "Pisti", "Klári", "Dóri", "Ottó", "Sanyi" };
		// sorba rendezzük őket a saját metódusunk alapján
		System.out.println(Arrays.toString(arrayToLexicographicalOrder(names)));
		// az Arrays osztálynak van egy saját sorbarendező metódusa, az Arrays.sort
		Arrays.sort(names);
		// kiírjuk a sorbarendezett tömböt
		System.out.println(Arrays.toString(names));

	}

	// ezzel a metódussal ABC-sorrendben tudunk rendezni egy String tömböt
	public static String[] arrayToLexicographicalOrder(String[] array) {
		// a külső ciklus egyesével végigmegy a tömb szavain
		for (int i = 0; i < array.length; i++) {
			// a belső ciklus minden egyes szónál végigmegy az összes, utána következő szón
			for (int j = i; j < array.length; j++) {
				// ha a baloldaon lévő, vizsgálandó szó hátrébb van az ABC-ben, mint a jobboldali, vizsgált szó
				// akkor ki kell cserélnünk a két szót pl. zeller alma (ki kell cserélni)
				// ha az almát beteszem a zeller helyére, akkor ez lesz: alma alma (eltűnt a zeller, nem tudom megcserélni)
				// ezért egy ideiglenes helyre el kell tárolnom az egyiket, hogy ki tudjam őket cserélni
				// (1.lépés) 1 = zeller; 2 = alma; temp = [üres]
				// (2.lépés) 1 = zeller; 2 = alma; temp = zeller
				// (3.lépés) 1 = alma; 2 = alma; temp = zeller
				// (4.lépés) 1 = alma; 2 = zeller; temp = zeller
				// most kicseréltük a két szót, innentől kezdve a temp-re (ideiglenes változó nincs szükség)
				if (array[i].compareTo(array[j]) > 0) {
					// ezt egy ideiglenes segédváltozó sgítségével tudjuk megtenni
					// az ABC-rendben hátrébb lévő szót kivisszük egy ideiglenes helyre
					String temp = array[i];
					// az ABC-rendben elölrébb lévő szót elhelyezzük az ABC-rendben elölrébb lévő szó helyére
					array[i] = array[j];
					// majd az ideiglenes változóból visszahelyettesítjük az ABC-rendben hátrébb lévő szót
					array[j] = temp;
				}
			}
		}
		return array;
	}

}
