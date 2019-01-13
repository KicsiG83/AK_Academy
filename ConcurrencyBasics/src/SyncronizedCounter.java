
public class SyncronizedCounter {

	private int counter = 0;

	public synchronized void increment() {
		counter++;
	}

	public synchronized void decrement() {
		counter--;
	}

	public int getCounter() {
		return counter;
	}
}
