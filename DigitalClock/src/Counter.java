import java.util.Scanner;

public class Counter {

	private int hour;
	private int minute;
	private int second;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public Counter() {
	}

	public void setter(int controller, int number) {
		switch (controller) {
		case 1:
			setHour(number);
			break;
		case 2:
			setMinute(number);
			break;
		case 3:
			setSecond(number);
			break;
		}
	}

	public Counter(Scanner sc) {
		getUserInput(sc, "Kérem adja meg az órákat: ", 1);
		getUserInput(sc, "Kérem adja meg a perceket: ", 2);
		getUserInput(sc, "Kérem adja meg a másodperceket: ", 3);
	}

	public void getUserInput(Scanner sc, String message, int controller) {
		boolean isValid = false;
		int max = 0;
		switch (controller) {
		case 1:
			max = 99;
			break;
		case 2:
			max = 59;
			break;
		case 3:
			max = 59;
			break;
		}
		do {
			try {
				System.out.print(message);
				int number = sc.nextInt();
				sc.nextLine();
				if (number < 0 || number > max) {
					System.out.println("A megadott adat érvénytelen.");
				} else {
					setter(controller, number);
					isValid = true;
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("A meadott adat érvénytelen.");
			}
		} while (!isValid);
	}

}
