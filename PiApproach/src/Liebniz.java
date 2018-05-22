
public class Liebniz extends Ancient{

	
	public Liebniz(int number) {
		printSeparator("\n----------------------Liebniz féle sor-----------------------");
		calculate(number);
	}
	
	public void calculate(int input) {
		setX(Math.PI / 4);
		System.out.println("\u03C0 / 4 közelítő értéke \u2243 " + getX());
		setDenominator(3.0);
		setA(1.0);
		for (int i = 1; i < input; i++) {
			if (i % 2 == 0) {
				setA(getA() + (1 / getDenominator()));
			} else {
				setA(getA() - (1 / getDenominator()));
			}
			setDenominator(getDenominator()+2);
		}
		System.out.println("Liebniz féle sor alapján a közelítő érték \u2243 " + getA());
	}
	
	
	
}
