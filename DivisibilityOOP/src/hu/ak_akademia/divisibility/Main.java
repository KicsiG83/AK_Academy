
package hu.ak_akademia.divisibility;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		DivisionCheck[] dc = new DivisionCheck[10];
		int number = new UserInput().getNumber();
		fillDivisionCheckArray(dc);
		callDivisionCheck(dc, number);
	}

	private void callDivisionCheck(DivisionCheck[] dc, int number) {
		String separator = " ";
		System.out.println("A(z) " + number + " osztói: ");
		for (DivisionCheck divisionCheck : dc) {
			if (divisionCheck.isDivisible(number)) {
				System.out.print(divisionCheck + separator);
			}
		}
	}

	private void fillDivisionCheckArray(DivisionCheck[] dc) {
		for (int i = 0; i < dc.length; i++) {
			dc[i] = new IntegerDivisionCheck(i + 1);
		}
	}
}
