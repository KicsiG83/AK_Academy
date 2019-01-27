import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.IntPredicate;

public class Main {

	private static LocalDateTime valiDate = LocalDateTime.of(2019, 1, 1, 0, 0);

	public static void main(String[] args) {
		while (valiDate.getYear() < 2020) {
			checkDate(getValueOfValiDate(), num -> num % 184 == 0);
		}
	}

	private static int getValueOfValiDate() {
		return valiDate.getYear() + valiDate.getMonthValue() + valiDate.getDayOfMonth() + valiDate.getHour()
				+ valiDate.getMinute() + valiDate.getSecond();
	}

	private static void checkDate(int valueOfDate, IntPredicate check) {
		if (check.test(valueOfDate)) {
			System.out.println(LocalDate.of(valiDate.getYear(), valiDate.getMonthValue(), valiDate.getDayOfMonth()));
			valiDate = LocalDateTime.of(valiDate.getYear(), valiDate.getMonthValue(), valiDate.getDayOfMonth() + 1, 0, 0, 0);
		} else {
			valiDate = valiDate.plusSeconds(1);
		}
	}
}
