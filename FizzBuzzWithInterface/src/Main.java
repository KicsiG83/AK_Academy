
public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Fizz fizz = new Fizz();
		Buzz buzz = new Buzz();
		int number = new UserInterface().getUserInput();
		for (int i = 1; i <= number; i++) {
			if (fizz.check(i) && !buzz.check(i)) {
				System.out.println(i + fizz.process());
			} else if (buzz.check(i) && !fizz.check(i)) {
				System.out.println(i + buzz.process());
			} else if (fizz.check(i) && buzz.check(i)) {
				System.out.println(i + fizz.process() + buzz.process());
			} else {
				System.out.println(i);
			}
		}
	}
}
