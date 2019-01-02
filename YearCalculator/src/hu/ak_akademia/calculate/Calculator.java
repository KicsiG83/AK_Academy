package hu.ak_akademia.calculate;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculator {

    public void calculetWithLocalDateTime(String birthDate) {
        LocalDateTime fromDateTime = LocalDateTime.of(cutter(birthDate, 0, 4), cutter(birthDate, 4, 6), cutter(birthDate, 6, 8), 0, 0, 0);
        System.out.println(ChronoUnit.YEARS.between(fromDateTime, LocalDateTime.now()) + " éves");
    }

    private int cutter(String birthDate, int startIndex, int endIndex) {
        return Integer.parseInt(birthDate.substring(startIndex, endIndex));
    }
}
