import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Producer implements Runnable {

	private List<Integer> numbers = new ArrayList<>();
	private Random rn = new Random();

	private Hand hand;

	public Producer(Hand drop) {
		this.hand = drop;
		fillList();
	}

	public void run() {
		try {
			for(int i = 0; i < 5; i++) {
				int temp = rn.nextInt(numbers.size());
				hand.put(temp);
				numbers.remove(temp);
				Thread.sleep(rn.nextInt(5_000));
			}
		} catch (InterruptedException e) {
			System.out.println("The producer has been interrupted.");
		}
	}
	
	private void fillList() {
		for(int i = 1; i <= 90; i++ ) {
			numbers.add(i);
		}
	}
}
