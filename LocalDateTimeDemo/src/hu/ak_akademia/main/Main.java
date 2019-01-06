package hu.ak_akademia.main;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {

		LocalDateTime silvester = LocalDateTime.of(2018, 12, 31, 23, 59, 59);
		System.out.println(silvester);
		LocalDateTime newYear = silvester.plusSeconds(1L);
		System.out.println(newYear);

		LocalDate leapYear = LocalDate.of(2020, 2, 1);
		for (int i = 0; i < 30; i++) {
			leapYear = leapYear.plusDays(1L);
			System.out.println(leapYear);
		}

		System.out.println("------------------------------");

		for (int year = 1850; year <= 2150; year++) {
			if (LocalDate.of(year, 1, 1).isLeapYear()) {
				System.out.println(year);
			}
		}

	}

}
