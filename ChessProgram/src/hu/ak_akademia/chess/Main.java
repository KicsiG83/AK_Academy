package hu.ak_akademia.chess;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		UserInput ui = new UserInput();
		Player playerOne = new Player();
		Player playerTwo = new Player();
		getUsersName(sc, ui, playerOne, playerTwo);
		selectFigureColor(sc, ui, playerOne, playerTwo);
		sc.close();

	}

	private static void getUsersName(Scanner sc, UserInput ui, Player playerOne, Player playerTwo) {
		playerOne.setName(ui.getUserName(sc));
		playerTwo.setName(ui.getUserName(sc));
	}

	private static void selectFigureColor(Scanner sc, UserInput ui, Player playerOne, Player playerTwo) {
		playerOne.setFigureColorWhite(ui.getFigureColor(playerOne, sc));
		if (!playerOne.isFigureColorWhite()) {
			playerTwo.setFigureColorWhite(true);
		}
		System.out.println(playerOne.getName() + " választotta a "
				+ (playerOne.isFigureColorWhite() ? "Fehér" : "Fekete") + " színt.");
		System.out.println(playerTwo.getName() + " választotta a "
				+ (playerTwo.isFigureColorWhite() ? "Fehér" : "Fekete") + " színt.");
	}

}
