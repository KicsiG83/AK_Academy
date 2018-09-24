
public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Names names = new Names();
		new UserInput().getUserInput(names.getNames());
		new Print().printResult(names.getNames());
	}
}
