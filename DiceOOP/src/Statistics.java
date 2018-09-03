
public class Statistics {

	private int count1;
	private int count2;
	private int count3;
	private int count4;
	private int count5;
	private int count6;

	public void counter(int number) {
		switch (number) {
		case 1:
			count1++;
			break;
		case 2:
			count2++;
			break;
		case 3:
			count3++;
			break;
		case 4:
			count4++;
			break;
		case 5:
			count5++;
			break;
		case 6:
			count6++;
			break;
		}
	}

	public void printStatistics() {
		int numberOfCast = 0;
		System.out.println("\nDobás statisztika: ");
		for (int i = 1; i <= 6; i++) {
			switch (i) {
			case 1:
				numberOfCast = count1;
				break;
			case 2:
				numberOfCast = count2;
				break;
			case 3:
				numberOfCast = count3;
				break;
			case 4:
				numberOfCast = count4;
				break;
			case 5:
				numberOfCast = count5;
				break;
			case 6:
				numberOfCast = count6;
				break;
			}
			System.out.println(numberOfCast + " db " + i + " dobott.");
		}
	}
}
