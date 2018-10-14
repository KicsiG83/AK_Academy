package hu.ak_akademia.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hu.ak_akademia.userinput.UserInput;

public class Main {

	public static void main(String[] args) {

		new Main().run();

	}

	private void run() {
		Scanner sc = new Scanner(System.in);
		List<String> charList = new ArrayList<>();
		String result = new UserInput().getUserInput(sc);
		sc.close();
		fillArrayList(result, charList);
		printArrayList(charList);
	}

	private void printArrayList(List<String> charList) {
		System.out.println(charList);
	}

	private void fillArrayList(String result, List<String> charList) {
		for (int i = 0; i < result.length(); i++) {
			charList.add(Character.toString(result.charAt(i)));
		}
	}
}
