
public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Dictionary dict = new Dictionary();
		dict.addWordPair("Apple", "Alma");
		dict.addWordPair("Apple", "óma");
		dict.addWordPair("Apple", "Ama");
		dict.addWordPair("Pineapple", "Ama");

		System.out.println(dict.getHunagrianWord("Pineapple"));
		System.out.println(dict.getHunagrianWord("Ama"));
	}
}
