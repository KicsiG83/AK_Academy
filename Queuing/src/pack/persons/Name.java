package pack.persons;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Name {

	PRISOKA("Piroska"), IRENKE("Irénke"), ATTILA("Attila"), ANDRAS("András"), OTTO("Ottó"), BALAZS("Balázs"), ZOLTAN(
			"Zoltán"), KAROLY("Károly"), MARIKA("Marika"), GIZIKE("Gizike"), MICIKE("Micike"), MANCIKA("Mancika");

	private String textual;

	private static final List<Name> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static Name randomName() {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}

	private Name(String text) {
		textual = text;
	}

	public String getTextual() {
		return randomName().textual;
	}

}
