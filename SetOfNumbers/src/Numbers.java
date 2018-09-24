import java.util.LinkedHashSet;
import java.util.Set;

public class Numbers {

	private Set<Integer> numbers = new LinkedHashSet<>();

	public Set<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(int number) {
		this.numbers.add(number);
	}
}
