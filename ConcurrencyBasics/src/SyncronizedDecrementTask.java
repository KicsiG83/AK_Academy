
public class SyncronizedDecrementTask implements Runnable {

	private SyncronizedCounter counterSyncronized;

	public SyncronizedDecrementTask(SyncronizedCounter counterSyncronized) {
		this.counterSyncronized = counterSyncronized;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			counterSyncronized.decrement();
		}
	}
}
