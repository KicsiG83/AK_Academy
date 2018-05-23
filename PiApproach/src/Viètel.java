
public class Viètel extends Mathematics {

	private double b;

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public Viètel(int number) {
		printSeparator("\n-----------------------Viètel féle sor-----------------------");
		calculate(number);
	}

	@Override
	public void calculate(int input) {
		System.out.println("\u03C0 = " + getX());
		setDenominator(2.0);
		setB(Math.sqrt(2) / getDenominator());
		setA(b);
		while (input > 0) {
			setB(Math.sqrt(2 + 2 * b) / getDenominator());
			setA(getA() * getB());
			input--;
		}
		setA(Math.pow(getA(), -1)*2);
		System.out.println("Viètel féle sor alapján a közelítő érték \u2243 " + getA());
	}
}