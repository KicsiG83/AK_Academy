package hu.ak_akademia.sorting;

public class SelectionSort implements SortAlgorithm {

	@Override
	public int[] sort(int[] array) {
		int[] sortedNumber = new int[array.length];
		System.arraycopy(array, 0, sortedNumber, 0, array.length);
		int minIndex = 0;
		int temp;
		for (int i = 0; i < sortedNumber.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < sortedNumber.length; j++) {
				if (sortedNumber[minIndex] > sortedNumber[j]) {
					minIndex = j;
				}
			}
			temp = sortedNumber[i];
			sortedNumber[i] = sortedNumber[minIndex];
			sortedNumber[minIndex] = temp;
		}
		return sortedNumber;
	}

}