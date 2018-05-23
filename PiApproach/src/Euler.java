
public class Euler extends Mathematics {

	public Euler(int number) {
		printSeparator("\n-----------------------Euler féle sor-----------------------");
		calculate(number);
	}

	@Override
	public void calculate(int input) {
		System.out.println("\u03C0 = " + getX());
		setDenominator(2.0);
		setA(0.0);
		for (int i = 0; i < input; i++) {
			setA(getA() + (1 / Math.pow(getDenominator(), 2)));
			setDenominator(getDenominator() + 1.0);
		}
		setA(getA() + 1.0);
		setA(Math.sqrt(getA() * 6));
		System.out.println("Euler féle sor alapján a \u03C0 közelítő érték \u2243 " + getA());
	}
}
