import java.util.List;

public class NormalSort implements Sorting {

	private static double[] originalArray = new double[10];

	public NormalSort() {
	}

	public static double[] getOriginalArray() {
		return originalArray;
	}

	public void fillMyArray(List<Double> orignalList) {
		for (int i = 0; i < orignalList.size(); i++) {
			originalArray[i] = orignalList.get(i);
		}
	}

	@Override
	public void sort() {
		for (int i = 1; i < originalArray.length; i++) {
			for (int j = 0; j < originalArray.length - i; j++) {
				if (originalArray[j] > originalArray[j + 1]) {
					changeSequence(originalArray, j, j + 1);
				}
			}
		}
	}

	private void changeSequence(double[] originalArray, int i, int j) {
		double temp = originalArray[j];
		this.originalArray[j] = this.originalArray[i];
		this.originalArray[i] = temp;
	}

	public void printMyNormalSortedDobules() {
		for (int i = 0; i < originalArray.length; i++) {
			System.out.println(originalArray[i]);
		}
	}

}
