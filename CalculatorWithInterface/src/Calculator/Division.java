package Calculator;

public class Division implements Operation {

	@Override
	public double calculate(double a, double b) {
		if (b == 0) {
			throw new IllegalArgumentException("A 0-val való osztás tilos!");
		} else {
			return a / b;
		}
	}

}
