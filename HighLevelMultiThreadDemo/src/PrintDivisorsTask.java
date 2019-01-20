public class PrintDivisorsTask implements Runnable {

	private int number;

	public PrintDivisorsTask(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				System.out.println(i);
			}
		}
	}
}
