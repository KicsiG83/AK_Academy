public class ExerciseThreeCalculator {

	private static int sqrt;
	private static int intSqrt;
	private static int x;

	public static int getX() {
		return x;
	}

	public static void setX(int x) {
		ExerciseThreeCalculator.x = x;
	}

	public static int getSqrt() {
		return sqrt;
	}

	public static void setSqrt(int sqrt) {
		ExerciseThreeCalculator.sqrt = sqrt;
	}

	public static int getIntSqrt() {
		return intSqrt;
	}

	public static void setIntSqrt(int intSqrt) {
		ExerciseThreeCalculator.intSqrt = intSqrt;
	}

	public static void calculate(int number) {
		if (number == 1764) {
			System.out.println("\nBINGO!\nEz egy négyzetszám!\nA 42 négyzete.\n");
		} else {
			setSqrt((int) Math.sqrt(number));
			setIntSqrt((int) Math.pow(sqrt, 2));
			if (number == getIntSqrt()) {
				System.out.println("Ez egy négyzetszám! A(z) " + getSqrt() + " négyzete.");
			} else {
				System.out.println("A megadott szám nem négyzetszám.");
				for (int i = number; i <= 10000; i++) {
					setX((int) Math.sqrt(i));
					setIntSqrt((int) Math.pow(getX(), 2));
					if (i == getIntSqrt()) {
						System.out.println(
								"A legközelebbi nagyobb négyzetszám a " + i + ". Ami a(z) " + getX() + " négyzete.");
						break;
					}
				}
				for (int j = number; j > 0; j--) {
					setX((int) Math.sqrt(j));
					setIntSqrt((int) Math.pow(getX(), 2));
					if (j == getIntSqrt()) {
						System.out.println(
								"A legközelebbi kisebb négyzetszám a " + j + ". Ami a(z) " + getX() + " négyzete.");
						break;
					}
				}
			}
		}
	}
}
