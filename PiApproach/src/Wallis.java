
public class Wallis extends Mathematics {

	private double counter;

	public double getCounter() {
		return counter;
	}

	public void setCounter(double counter) {
		this.counter = counter;
	}

	public Wallis(int number) {
		printSeparator("\n-----------------------Wallis féle sor-----------------------");
		calculate(number);
	}

	@Override
	public void calculate(int input) {
		setCounter(2.0);
		setDenominator(1.0);
		setA(0.0);
		System.out.println("\u03C0 = " + getX());
		for (int i = 0; i < input; i++) {
			if (i == 0) {
				setA(getCounter() / getDenominator());
				setDenominator(getDenominator() + 2);
			} else {
				if (i % 2 == 0) {
					setA(getA() * (getCounter() / getDenominator()));
					setDenominator(getDenominator() + 2);
				} else {
					setA(getA() * (getCounter() / getDenominator()));
					setCounter(getCounter() + 2);
				}
			}
		}
		setA(getA() * 2);
		System.out.println("Wallis féle sor alapján a közelítő érték \u2243 :" + getA());
	}

}
