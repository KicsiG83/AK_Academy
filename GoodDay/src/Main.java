import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.IntPredicate;

public class Main {

    private static Set<LocalDate> dateSet = new TreeSet<>();
    private static LocalDateTime valiDate = LocalDateTime.of(2019, 1, 1, 0, 0);

    public static void main(String[] args) {
        while (valiDate.getYear() < 2020) {
            valiDate = valiDate.plusSeconds(1);
            int valueOfValiDate = valiDate.getYear() + valiDate.getMonthValue() + valiDate.getDayOfMonth() + valiDate.getHour() + valiDate.getMinute()
                    + valiDate.getSecond();
            checkDate(valueOfValiDate, num -> num % 184 == 0);
        }
        System.out.println(dateSet);
    }

    private static void checkDate(int valueOfDate, IntPredicate test) {
        if (test.test(valueOfDate)) {
            dateSet.add(LocalDate.of(valiDate.getYear(), valiDate.getMonthValue(), valiDate.getDayOfMonth()));
        }
    }
}
