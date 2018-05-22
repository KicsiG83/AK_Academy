
public class Euler extends Ancient{

	public Euler(int number) {
		printSeparator("\n-----------------------Euler féle sor-----------------------");
		calculate(number);
	}
	
	public void calculate (int input) {
		setX(Math.pow(Math.PI, 2) / 6);
		System.out.println("\u03C0\u00b2 / 6 közelítő értéke \u2243 " + getX());
		setDenominator(2.0);
		setA(0.0);
		for (int i = 0; i < input; i++) {
			setA(getA() + (1 / Math.pow(getDenominator(), 2)));
			setDenominator(getDenominator()+1.0);
		}
		setA(getA() + 1.0);
		System.out.println("Euler féle sor alapján a közelítő érték \u2243 " + getA());
	}
}
