import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Person {

    private Integer number;
    private Set<Integer> guess = new LinkedHashSet<>();
    private boolean questioner;
    private Random rn = new Random();
    
    public Person(boolean questioner) {
        this.questioner = questioner;
        this.number = rn.nextInt(100) + 1;
    }

    public Integer getNumber() {
        return number;
    }

    public Set<Integer> getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess.add(guess);
    }

    public boolean isQuestioner() {
        return questioner;
    }
    
    public int getGuess(int bound) {
        return rn.nextInt(bound);
    }
    
}
