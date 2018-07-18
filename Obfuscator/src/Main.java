
public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		String userInput = new UserInput().getUserInput();
		Mixer mixi = new Mixer();
		mixi.splitter(userInput);
		mixi.mixer();
		String[] mixedArray = mixi.getMixedString();
		printResult(mixedArray);
	}

	private void printResult(String[] mixedArray) {
		for (int i = 0; i < mixedArray.length; i++) {
			System.out.print(mixedArray[i]);
		}
	}
}
