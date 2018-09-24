import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Numbers numbers = new Numbers();
		new UserInput().getUserInput(numbers.getNumbers());
		callPrinter(numbers);
	}

	private void callPrinter(Numbers numbers) {
		Print print = new Print();
		print.printResult("1. Számok kevert sorrendben:", new HashSet<>(numbers.getNumbers()));
		print.printResult("2. Számok beviteli sorrendben:", numbers.getNumbers());
		print.printResult("3. Számok növekvő sorrendben:", new TreeSet<>(numbers.getNumbers()));
		List<Integer> list = new ArrayList<Integer>(numbers.getNumbers());
		Collections.sort(list, Collections.reverseOrder());
		print.printResult("4. Számok csökkenő sorrendben:", new LinkedHashSet<Integer>(list));
	}
}
