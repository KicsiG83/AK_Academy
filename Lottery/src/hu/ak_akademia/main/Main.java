package hu.ak_akademia.main;

import hu.ak_akademia.lot.Lot;

public class Main {

	public static void main(String[] args) {

		new Main().run();

	}

	private void run() {

		Lot lottery = new Lot();
		System.out.println(lottery.getWinNum());
		
		System.out.println("-----------------------");
		
		Lot parametersLottery = new Lot(10, 10);
		System.out.println(parametersLottery.getWinNum());
		
	}

}
