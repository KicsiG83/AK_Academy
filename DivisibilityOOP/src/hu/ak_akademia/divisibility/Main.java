package hu.ak_akademia.divisibility;

public class Main {

	/*
	 * megvizsgálja 1-től 10-ig, hogy melyik számmal osztható!
	 * 
	 * A program az oszthatóság vizsgálathoz OOP-s elveknek megfelelően külön
	 * példányokat használjon!
	 * 
	 * Legyen ennek egy konkrét megvalósítása, ami IntegerDivisionCheck néven fut és
	 * ami konstruktora paramétereként vár egy egész számot, amit el is tárol egy
	 * példányváltozójában és amivel való oszthatóságot vizsgálni fogja!
	 * 
	 * A példányváltozóhoz hozz létre egy accessor (getter) metódust!
	 * 
	 * Az isDivisible metódus legyen megvalósítva az IntegerDivisionCheck osztályban
	 * is és azt ellenőrizze, hogy a paraméterként megadott felhasználói szám
	 * osztható-e az IntegerDivisionCheck példány létrehozásakor megadott számmal!
	 * Ha igen, akkor térjen vissza true értékkel, különben false-szal!
	 * 
	 * Az IntegerDivisionCheck osztályból hozz létre 10 példányt és tedd be őket egy
	 * DivisionCheck típusú tömbbe!
	 * 
	 * A példányok létrehozásakor add meg nekik 1-től 10-ig a számokat, hogy az
	 * ezzel a számmal történő oszthatóságot vizsgálják majd!
	 * 
	 * Az 1-től 10-ig való számokkal történő oszthatóságot vizsgáld meg úgy a
	 * felhasználó által megadott számra, hogy a 10 példány mindegyikén meghívod az
	 * isDivisible metódust!
	 * 
	 * Írd ki a standard kimenetre, hogy a felhasználó által megadott szám melyik
	 * számmal osztható 1-től 10-ig!
	 */

	public static void main(String[] args) {

		new Main().run();

	}

	public void run() {
		int number = new UserInput().getNumber();
		System.out.println(new IntegerDivisionCheck(10).isDivisible(number));
	}

}
