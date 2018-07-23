package hu.ak_akademia.sorting;
 
public class BubbleSort implements SortAlgorithm {
 
    @Override
    public int[] sort(int[] numbers) {
 
        int[] sortedNumber = new int[numbers.length];
        System.arraycopy(numbers, 0, sortedNumber, 0, numbers.length);
 
        for (int j = 1; j < sortedNumber.length; j++) {
            for (int i = 0; i < sortedNumber.length - j; i++) {
                if (sortedNumber[i] > sortedNumber[i + 1]) {
                    swap(sortedNumber, i, i + 1);
                }
            }
        }
        return sortedNumber;
    }
 
    private void swap(int[] sortedNumbers, int i, int j) {
        int temp = sortedNumbers[j];
        sortedNumbers[j] = sortedNumbers[i];
        sortedNumbers[i] = temp;
 
    }
 
}