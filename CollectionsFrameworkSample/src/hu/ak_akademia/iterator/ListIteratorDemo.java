package hu.ak_akademia.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
 
public class ListIteratorDemo {
 
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(21);
        numbers.add(6);
        numbers.add(42);
        numbers.add(100);
        numbers.add(21);
        numbers.add(3, -100);
 
        Collections.sort(numbers);
//        Collections.reverse(numbers);
//        Collections.shuffle(numbers);
 
        printNumbersWithForLoop(numbers);
        System.out.println("----------");
        printNumbersWithForEachLoop(numbers);
        System.out.println("----------");
        printNumbersWithIterator(numbers);
        System.out.println("----------");
        printNumbersWithListIterator(numbers);
    }
 
    private static void printNumbersWithListIterator(List<Integer> numbers) {
        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
 
    private static void printNumbersWithIterator(List<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
 
    private static void printNumbersWithForEachLoop(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
 
    private static void printNumbersWithForLoop(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
 
}
