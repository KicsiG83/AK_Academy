package hu.ak_akademia.chess;

public class Player {

	private String name;
	private boolean figureColorWhite;

	public Player() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFigureColorWhite() {
		return figureColorWhite;
	}

	public void setFigureColorWhite(boolean figureColorWhite) {
		this.figureColorWhite = figureColorWhite;
	}

}
