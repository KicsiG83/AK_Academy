package hu.ak_akademia.hangman;

import java.util.Scanner;

public class UserInput implements AutoCloseable {

	private Scanner scanner = new Scanner(System.in);

	@Override
	public void close() throws Exception {
		scanner.close();
	}

	public String read() {
		return scanner.nextLine();
	}
}