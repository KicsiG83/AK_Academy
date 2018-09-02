package hu.ak_akademia.chess;

public class Validator {

	public boolean checkFigureColor(String result) {
		return result.matches("^([1-2]{1})$");
	}

}
