package hu.ak_akademia.lotto;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiConsumer;

public class Lotto {

	private int max = 90;
	private int db = 5;
	private Set<Integer> winnerNumbers = new TreeSet<>();
	private Random rn = new Random();

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
	
	public Lot(int a) {
	    
	}

	public BiConsumer<Integer, Integer> lotteryWithStreamApi = (max, db) -> {
	    while (winnerNumbers.size() < db) {
            winnerNumbers.add(rn.nextInt(max) + 1);
        }  
	};
	
	private void lottery() {
		while (winnerNumbers.size() < db) {
			winnerNumbers.add(rn.nextInt(max) + 1);
		}
	}

	public Set<Integer> getWinNum() {
		return winnerNumbers;
	}

}
