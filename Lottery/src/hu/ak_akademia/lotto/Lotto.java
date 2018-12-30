package hu.ak_akademia.lotto;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {

	private int max = 90;
	private int db = 5;
	private Set<Integer> winnerNumbers = new TreeSet<>();

	public Lotto() {
		lottery();
	}

	public Lotto(int max, int db) {
		if (max < db) {
			System.out.println("Érvénytelen paraméter.");
		} else {
			this.max = max;
			this.db = db;
		}
		lottery();
	}

	private void lottery() {
		Random rn = new Random();
		while (winnerNumbers.size() < db) {
			winnerNumbers.add(rn.nextInt(max) + 1);
		}
	}

	public Set<Integer> getWinNum() {
		return winnerNumbers;
	}

}
