
public class Main {

	public static void main(String[] args) throws InterruptedException {
		//new Main().run();
		new StatisticsForSix().diceForSix();
	}

	private void run() throws InterruptedException {
		Statistics stat = new Statistics();
		Dice[] dices = new Dice[100];
		for (int i = 0; i < 100; i++) {
			dices[i] = new Dice();
			dices[i].setFaceTop(dices[i].cast());
			stat.counter(dices[i].getFaceTop());
			System.out.println(dices[i].toString());
		}
		stat.printStatistics();
		new Dice().rotate();
	}
}
