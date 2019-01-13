
public class PrintNumbersTask implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000L);
				System.out.println(i + 1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
