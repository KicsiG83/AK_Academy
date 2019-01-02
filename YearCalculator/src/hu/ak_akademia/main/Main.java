package hu.ak_akademia.main;

import hu.ak_akademia.calculate.Calculator;
import hu.ak_akademia.userinput.UserInput;

public class Main {

    public static void main(String[] args) {

        UserInput ui = new UserInput();
        ui.getInput();
        new Calculator().calculetWithLocalDateTime(ui.getBirthDate());
    }

}
