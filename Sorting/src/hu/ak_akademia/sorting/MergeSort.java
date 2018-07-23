package hu.ak_akademia.sorting;

public class MergeSort implements SortAlgorithm {

	@Override
	public int[] sort(int[] array) {
		int[] sortNumber = new int[array.length];
		if (sortNumber.length < 2) {
			return sortNumber;
		}
		int mid = array.length/2;
		int[] left = new int[mid];
		int[] right = new int[array.length - mid];
		for(int i = 0 ; i < mid; i++) {
			left[i] = array[i];
		}
		for(int i = mid ; i < array.length; i++) {
			right[i-mid] = array[i];
		}
		sort(left);
		sort(right);
		
		return sortNumber;
	}

}
