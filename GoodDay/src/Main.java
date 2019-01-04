import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.IntPredicate;

public class Main {

    private Set<LocalDate> dateSet = new TreeSet<>();
    private LocalDateTime valiDate = LocalDateTime.of(2019, 1, 1, 0, 0);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        while (valiDate.getYear() < 2020) {
            checkDate(getValueOfValiDate(), num -> num % 184 == 0);
        }
        System.out.println(dateSet + " - " + dateSet.size());
    }

    private int getValueOfValiDate() {
        return valiDate.getYear() + valiDate.getMonthValue() + valiDate.getDayOfMonth() + valiDate.getHour() + valiDate.getMinute()
                + valiDate.getSecond();
    }

    private void checkDate(int valueOfDate, IntPredicate check) {
        if (check.test(valueOfDate)) {
            dateSet.add(LocalDate.of(valiDate.getYear(), valiDate.getMonthValue(), valiDate.getDayOfMonth()));
            valiDate = LocalDateTime.of(valiDate.getYear(), valiDate.getMonthValue(), valiDate.getDayOfMonth() + 1, 0, 0, 0);
        } else {
            valiDate = valiDate.plusSeconds(1);
        }
    }
}
