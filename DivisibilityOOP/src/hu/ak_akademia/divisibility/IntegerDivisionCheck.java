package hu.ak_akademia.divisibility;

public class IntegerDivisionCheck implements DivisionCheck {

	private int accessor;

	public int getAccessor() {
		return accessor;
	}

	public IntegerDivisionCheck(int accessor) {
		this.accessor = accessor;
	}

	@Override
	public boolean isDivisible(int userEnteredNumber) {
		return userEnteredNumber % getAccessor() == 0;
	}

	@Override
	public String toString() {
		return Integer.toString(getAccessor());
	}

}
