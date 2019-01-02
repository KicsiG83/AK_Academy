package hu.ak_akademia.calculate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Calculator {

    public void calculetWithLocalDateTime(String birthDate) {
        LocalDate fromDateTime = LocalDate.of(cutter(birthDate, 0, 4), cutter(birthDate, 4, 6), cutter(birthDate, 6, 8));
        System.out.println(ChronoUnit.YEARS.between(fromDateTime, LocalDate.now()) + " éves");
    }

    private int cutter(String birthDate, int startIndex, int endIndex) {
        return Integer.parseInt(birthDate.substring(startIndex, endIndex));
    }
}
