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



/*

void merge(int a[], int low, int mid, int high) {
  // subarray1 = a[low..mid], subarray2 = a[mid+1..high], both sorted
  int N = high-low+1;
  int b[N]; // discuss: why do we need a temporary array b?
  int left = low, right = mid+1, bIdx = 0;
  while (left <= mid && right <= high) // the merging
    b[bIdx++] = (a[left] <= a[right]) ? a[left++] : a[right++];
  while (left <= mid) b[bIdx++] = a[left++]; // leftover, if any
  while (right <= high) b[bIdx++] = a[right++]; // leftover, if any
  for (int k = 0; k < N; k++) a[low+k] = b[k]; // copy back
}

*/
