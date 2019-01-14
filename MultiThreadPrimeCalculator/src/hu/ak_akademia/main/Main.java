package hu.ak_akademia.main;

import java.util.HashSet;
import java.util.Set;

import hu.ak_akademia.calculator.Calculator;

public class Main {

    private static Set<Integer> fullSet = new HashSet<>();

    public static void main(String[] args) {
        Main m = new Main();
        m.runOneThread();
        m.runMultiThread();
        m.runParameterizedThread(6);
    }

    private void runOneThread() {
        Thread t1 = new Thread(new Calculator(1, 2_000_000, 1));
        t1.start();

    }

    private void runMultiThread() {
        Thread t1 = new Thread(new Calculator(1, 1_000_000, 2));
        Thread t2 = new Thread(new Calculator(1_000_001, 2_000_000, 2));
        t1.start();
        t2.start();
    }

    private void runParameterizedThread(int numberOfThreads) {
        int numberOfMax = 2_000_000;
        int numberOfResult = numberOfMax / numberOfThreads;
        int start = 0;
        int end = numberOfResult;
        for (int i = 0; i < numberOfThreads; i++) {
            Thread thread = new Thread(new Calculator(start, end, numberOfThreads));
            thread.start();
            start = end + 1;
            end = start + numberOfResult;
            if (end > numberOfMax) {
                end = numberOfMax;
            }
        }
    }

    public static void setFullSet(Set<Integer> set) {
        fullSet.addAll(set);
    }

    public static Set<Integer> getFullSet() {
        return fullSet;
    }

}
