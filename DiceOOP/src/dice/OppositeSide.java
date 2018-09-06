package dice;

public class OppositeSide {

	public int getOppositeSide(int number) {
		int opposite = 0;
		switch (number) {
		case 1:
			opposite = 6;
			break;
		case 2:
			opposite = 5;
			break;
		case 3:
			opposite = 4;
			break;
		case 4:
			opposite = 3;
			break;
		case 5:
			opposite = 2;
			break;
		case 6:
			opposite = 1;
			break;
		}
		return opposite;
	}
}
