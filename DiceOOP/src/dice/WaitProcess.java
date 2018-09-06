package dice;

import java.util.Random;

public class WaitProcess {

	private final int MAXWAIT = 10;
	private final int MINWAIT = 1;

	public WaitProcess() {
	}
	
	public void waiting() {
		int waiting = (new Random().nextInt(MAXWAIT) + MINWAIT);
		for (int i = 0; i < waiting; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("...");
		}
	}
	
}
