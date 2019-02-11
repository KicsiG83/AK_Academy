package hu.ak_akademia.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import hu.ak_akademia.spacecrafts.CanFly;
import hu.ak_akademia.spacecrafts.Raptor;
import hu.ak_akademia.spacecrafts.Viper;

public class Main {

	private Random rn = new Random();
	private List<CanFly> spaceCrafts = new ArrayList<>();

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		initSpacecrafts(30);
		printSpacecrafts();
	}

	private void initSpacecrafts(int maxSpaceCraft) {
		for (int i = 0; i < maxSpaceCraft; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				spaceCrafts.add(new Viper("Vipera_" + getRandomNumber()));
			} else {
				spaceCrafts.add(new Raptor("Raptor_" + getRandomNumber()));
			}
		}
	}

	private void printSpacecrafts() {
		for (CanFly canFly : spaceCrafts) {
			canFly.fly();
		}
	}

	private int getRandomNumber() {
		return rn.nextInt(10000);
	}
	
}
