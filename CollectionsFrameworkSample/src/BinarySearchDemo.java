import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchDemo {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1000);
		numbers.add(2000);
		numbers.add(97);
		numbers.add(3);
		numbers.add(101);
		numbers.add(1002);
		numbers.add(17);

		Collections.sort(numbers);
		int index = Collections.binarySearch(numbers, 18);
		System.out.println(index);
	}
}