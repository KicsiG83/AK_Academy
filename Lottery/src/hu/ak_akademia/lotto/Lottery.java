package hu.ak_akademia.lotto;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lottery {

    private int maximum;
    private int piece;
    private Set<Integer> winnerNumbers = new TreeSet<>();
    private Random rn = new Random();

    public Lottery() {
        this.maximum = 90;
        this.piece = 5;
    }

    public Lottery(int max, int db) {
        if (max < db) {
            System.out.println("Érvénytelen paraméter.");
        } else {
            this.maximum = max;
            this.piece = db;
        }
    }

    public void draw() {
        while (winnerNumbers.size() < piece) {
            winnerNumbers.add(rn.nextInt(maximum) + 1);
        }
    }

    public Set<Integer> getWinNum() {
        return winnerNumbers;
    }

    @Override
    public String toString() {
        return "Lottery [winnerNumbers=" + winnerNumbers + "]";
    }
    
    
}
