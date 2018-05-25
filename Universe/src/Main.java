import java.util.Random;

public class Main {

	public static void main(String[] args) {

		tombbasztatas();
	}

	public static void tombbasztatas() {
		for (int i = 0; i < 10; i++) {
			Orb[] array = { new BlackHole(), new Blazar(), new BrownDwarf(), new Globula(), new Comet(), new DwarfPlanet() , new Galaxis(), new GiantPlanet(), new Meteoroid(), new Moon()};
			System.out.println(array[new Random().nextInt(array.length)].toString());
		}
	}
}
