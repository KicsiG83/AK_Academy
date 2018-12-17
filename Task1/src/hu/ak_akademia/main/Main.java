package hu.ak_akademia.main;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		for(int i = -99; i < 30; i++) {
			if(i % 3 != 0 && i < 0) {
				System.out.println(i);
			}
		}
	}
}
