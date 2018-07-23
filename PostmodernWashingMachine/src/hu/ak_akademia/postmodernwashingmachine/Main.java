package hu.ak_akademia.postmodernwashingmachine;

import java.util.ArrayList;

public class Main {

	private ArrayList<ArrayList<Dress>> allDress = new ArrayList<ArrayList<Dress>>();
	private ArrayList<Dress> whiteDressArrayList = new ArrayList<Dress>();
	private ArrayList<Dress> colorDressArrayList = new ArrayList<Dress>();

	public static void main(String[] args) throws InterruptedException {
		new Main().run();
	}

	private void run() throws InterruptedException {
		generateClothes();
		letsGo();
	}

	private void generateClothes() {
		for (int i = 0; i < 10; i++) {
			Dress tshirt = new Tshirt();
			Dress socks = new Socks();
			Dress pants = new Pants();
			Dress underPants = new Underpants();
			checkColor(tshirt);
			checkColor(socks);
			checkColor(pants);
			checkColor(underPants);
		}
		printClothes();
	}

	private void checkColor(Dress d) {
		if (d.getColor().equals("Fehér")) {
			whiteDressArrayList.add(d);
		} else {
			colorDressArrayList.add(d);
		}
	}

	private void printClothes() {
		System.out.println("Fehér ruhák: \n" + whiteDressArrayList
				+ "\n----------------------------------------------------------------\n" + "Színes ruhák: \n"
				+ colorDressArrayList);
	}

	private void letsGo() throws InterruptedException {
		PostModernWashingMachine pmwm = new PostModernWashingMachine();
		allDress.add(whiteDressArrayList);
		allDress.add(colorDressArrayList);
		for (int j = 0; j < allDress.size(); j++) {
			while (Dress.valid || allDress.get(j).size() > 0) {
				PostModernWashingMachine.setSumDirty(0);
				pmwm.load(allDress.get(j));
			}
		}
	}
}
