
public class Main {

	public static void main(String[] args) {
		Fizz fizz = new Fizz();
		Buzz buzz = new Buzz();
		int number = new UserInterface().getUserInput();
		for (int i = 1; i <= number; i++) {
			System.out.println(i + (fizz.check(i) ? fizz.process() : "") + (buzz.check(i) ? buzz.process() : ""));
		}
	}
}
