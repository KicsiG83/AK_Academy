import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;

public class CalculateDivisorsTask implements Callable<Set<Integer>> {

	private int number;

	public CalculateDivisorsTask(int number) {
		this.number = number;
	}

	@Override
	public Set<Integer> call() throws Exception {
		Set<Integer> set = new TreeSet<>();
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				set.add(i);
			}
		}
		return set;
	}

	public int getNumber() {
		return number;
	}

}
