
public class CounterIncrementTask implements Runnable {

	private Counter counter;

	public CounterIncrementTask(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			counter.increment();
		}
	}
}
