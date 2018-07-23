package hu.ak_akademia.sorting;
 
import java.util.Arrays;
 
public class Main {
 
    public static void main(String[] args) {
        new Main().run();
    }
    private void run() {
    	int[] randomArray = new Generate().generateRandomNumbers(4);
        System.out.print("Rendezetlen számok: "+Arrays.toString(randomArray));
//        SortAlgorithm bs = new BubbleSort();
//        SortAlgorithm ss = new SelectionSort();
//        SortAlgorithm is = new InsertionSort();
        SortAlgorithm ms = new MergeSort();
//        System.out.print("\nRendezett számok (bubble): "+Arrays.toString(bs.sort(randomArray)));
//        System.out.print("\nRendezett számok (selection): "+Arrays.toString(ss.sort(randomArray)));
//        System.out.print("\nRendezett számok (insert): "+Arrays.toString(is.sort(randomArray)));
        System.out.print("\nRendezett számok (merge): "+Arrays.toString(ms.sort(randomArray)));
    }
}