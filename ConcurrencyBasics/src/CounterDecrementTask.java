
public class CounterDecrementTask implements Runnable {

	private Counter counter;

	public CounterDecrementTask(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			counter.decrement();
		}
	}
}
