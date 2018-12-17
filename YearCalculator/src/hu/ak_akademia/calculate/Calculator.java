package hu.ak_akademia.calculate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.function.BiConsumer;

public class Calculator {

    private String currentDate;
    private int calculatedNumber;

    public Calculator() {
        calculateCurrentDate();
    }

    public int getCalculatedNumber() {
        return calculatedNumber;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public BiConsumer<String, String> calc = (currentYearText, userInputYearText) -> {
        calculatedNumber = Integer.parseInt(currentYearText) - Integer.parseInt(userInputYearText);
    };

    public void printYear() {
        String printedYear = "0";
        switch(Integer.toString(calculatedNumber).length()){
        case 5:
            printedYear = cutter(1);
            break;
        case 6:
            printedYear = cutter(2);
            break;
        case 7:
            printedYear = cutter(3);
            break;
        }
        System.out.println(printedYear + " Éves.");
    }
    
    private String cutter(int max) {
        return Integer.toString(calculatedNumber).substring(0, max);
    }

    private void calculateCurrentDate() {
        Calendar c = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        currentDate = df.format(c.getTime());
    }
}
