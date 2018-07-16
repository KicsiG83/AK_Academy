
public class Main {

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		String userInput = new UserInput().getUserInput();
		Mixer mixi = new Mixer();
		mixi.mixString(userInput);
		String[] array = mixi.getMixedString();
		String[] sep = mixi.getSeparatorCharacters();
		for(int i = 0; i < mixi.getMixedString().length; i++) {
			System.out.println(array[i]);
			System.out.println(sep[i]);
		}	
	}
}
