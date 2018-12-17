package hu.ak_akademia.main;

import hu.ak_akademia.calculate.Calculator;
import hu.ak_akademia.userinput.UserInput;

public class Main {

    public static void main(String[] args) {

        new UserInput().getInput();
        Calculator c = new Calculator();
        c.calc.accept(c.getCurrentDate(), UserInput.getBirthDate());
        c.printYear();
    }

}
