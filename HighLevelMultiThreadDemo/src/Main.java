import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.task1();
	}

	private void task1() {
		/*
		 * A Runnable interfészt implementáló feladat osztály írja ki a paraméterként
		 * kapott pozitív egész szám osztóit!
		 */
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(new PrintDivisorsTask(1000));
		executor.shutdown();
		try {
			executor.awaitTermination(2L, TimeUnit.HOURS);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("\ncső\n");
	}
}
