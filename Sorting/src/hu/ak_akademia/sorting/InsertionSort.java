package hu.ak_akademia.sorting;

public class InsertionSort implements SortAlgorithm {
 
    @Override
    public int[] sort(int[] numbers) {
        int temp;
        int[] sortNumbers = new int[numbers.length];
        System.arraycopy(numbers, 0, sortNumbers, 0, sortNumbers.length);
 
        loop: for (int i = 1; i < sortNumbers.length; i++) {
            temp = sortNumbers[i];
            for (int j = i; j >= 0;) {
                switch (j) {
                case 0:
                    sortNumbers[j] = temp;
                    j--;
                    break;
                default:
                    if (sortNumbers[j - 1] > temp) {
                        sortNumbers[j] = sortNumbers[j - 1];
                    } else {
                        sortNumbers[j] = temp;
                        continue loop;
                    };
                    j--;
                    break;
                }
            }
        }
        return sortNumbers;
    }
}