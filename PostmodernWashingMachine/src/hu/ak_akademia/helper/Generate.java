package hu.ak_akademia.helper;

import java.util.Random;

public class Generate {

	String[] colors = { "Fehér", "Fekete", "Piros", "Kék", "Szürke", "Zöld", "Sárga" };
	Random rn = new Random();

	public int generateDirty() {
		return rn.nextInt(100) + 1;
	}

	public String randomColor() {
		int index = rn.nextInt(colors.length);
		return colors[index];
	}

}
