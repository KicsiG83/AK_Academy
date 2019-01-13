import java.util.List;
import java.util.Random;

public class PrintInfinityMessageTask implements Runnable {

	private List<String> messages = List.of("Egy", "Kettő", "Három", "Négy", "Öt", "Hat", "Hét");
	private Random rn = new Random();

	@Override
	public void run() {
		for (;;) {
			try {
				System.out.println(messages.get(rn.nextInt(messages.size())));
				Thread.sleep(4000L);
			} catch (Exception e) {
				System.out.println("This Thread is interrupted!");
				return;
			}
		}
	}
}
