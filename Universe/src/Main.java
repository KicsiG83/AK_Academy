import java.util.Random;

public class Main {

	public static void main(String[] args) {

		printRandomObject();
	}

	public static void printRandomObject() {
		Orb[] array = { new BlackHole(), new Blazar(), new BrownDwarf(), new Globula(), new Comet(), new DwarfPlanet(),
				new Galaxis(), new GiantPlanet(), new Meteoroid(), new Moon(), new Nova(), new Planet(),
				new Nebula(130, 159), new Pulsar(), new RedGiant(), new DwarfPlanet(Name.randomName()) };
		for (int i = 0; i < 50; i++) {
			System.out.println(array[new Random().nextInt(array.length)].toString());
		}
	}
}
