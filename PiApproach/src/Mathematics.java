
public abstract class Mathematics {

	private double x = Math.PI;
	private double a;
	private double denominator;

	public double getX() {
		return x;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getDenominator() {
		return denominator;
	}

	public void setDenominator(double denominator) {
		this.denominator = denominator;
	}

	public void printSeparator(String separator) {
		System.out.println(separator);
	}

	public void calculate(int number) {
	}

}
