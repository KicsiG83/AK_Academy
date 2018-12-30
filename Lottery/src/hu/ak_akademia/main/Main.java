package hu.ak_akademia.main;

import hu.ak_akademia.lotto.Lotto;

public class Main {

	public static void main(String[] args) {

		new Main().run();

	}

	private void run() {

		Lotto lottery = new Lotto();
		System.out.println(lottery.getWinNum());
		
		System.out.println("-----------------------");
		
		Lotto parametersLottery = new Lotto(10, 10);
		System.out.println(parametersLottery.getWinNum());
		
	}

}
