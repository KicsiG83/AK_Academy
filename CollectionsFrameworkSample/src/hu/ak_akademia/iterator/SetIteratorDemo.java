package hu.ak_akademia.iterator;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
 
public class SetIteratorDemo {
 
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(9);
        numbers.add(3);
        numbers.add(12);
        numbers.add(9);
 
        printNumbersWithForEach(numbers);
        System.out.println("----------");
        printNumbersWithIterator(numbers);
        System.out.println("----------");
        printNumbersWithIterator(numbers);
    }
 
    private static void printNumbersWithForEach(Set<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
 
    private static void printNumbersWithIterator(Set<Integer> numbers) {
        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
            System.out.println(number);
        }
    }
}