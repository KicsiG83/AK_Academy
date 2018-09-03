
public class Main {

	public static void main(String[] args) throws InterruptedException {
		 new Main().run();
	}

	private void run() throws InterruptedException {
		int sixTest = 15;
		int xTimes = 5;
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
		System.out.println("\nStatisztikai vizsgálat " + sixTest + " körben, minimum, maximum és átlagos dobások számára: \n");
		new Experiment().calculateCast(sixTest, xTimes);
	}
}
