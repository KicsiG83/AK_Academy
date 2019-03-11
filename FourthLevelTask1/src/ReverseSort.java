import java.util.ArrayList;
import java.util.List;

public class ReverseSort implements Sorting {

	private List<Double> myReverseSortedDobules = new ArrayList<>();

	public ReverseSort() {
	}

	@Override
	public void sort() {
		double[] tempArray = NormalSort.getOriginalArray();
		for (int i = tempArray.length - 1; i >= 0; i--) {
			myReverseSortedDobules.add(tempArray[i]);
		}
	}

	public void printMyReverseDoubles() {
		for (Double double1 : myReverseSortedDobules) {
			System.out.println(double1);
		}
	}

}