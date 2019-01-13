import java.util.Random;

public class Consumer implements Runnable {

	private Hand hand;

	public Consumer(Hand drop) {
		this.hand = drop;
	}

	public void run() {
		Random random = new Random();
		try {
			for (int i = 0; i < 5; i++) {
				System.out.print(hand.take() + " ");
				Thread.sleep(random.nextInt(5_000));
			}
		} catch (InterruptedException e) {
			System.out.println("The consumer has been interrupted.");
		}
	}

}
