import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println("Üdvözlöm!\nKérem adjon meg 10 db lebegőpontos számot!\n");
		new Main().run();
		System.out.println("\nViszlát!");
	}

	private void run() {
		List<Double> myUnsortedList = new UserInput().getInput();
		NormalSort normalSort = new NormalSort();
		normalSort.fillMyArray(myUnsortedList);
		ReverseSort reverseSort = new ReverseSort();
		normalSort.sort();
		reverseSort.sort();
		normalSort.printMyNormalSortedDobules();
		System.out.println("-------------------------");
		reverseSort.printMyReverseDoubles();
	}

}
