
public class ThreeGoodCalculator {

	public static void calculate(int number) {
		if (number == 1764) {
			System.out.println("BINGO!\nEz egy négyzetszám! A 42 négyzete.");
		} else {
			int sqrt = (int) Math.sqrt(number);
			int intSqrt = (int) Math.pow(sqrt, 2);
			if (number == intSqrt) {
				System.out.println("Ez egy négyzetszám! A " + sqrt + " négyzete.");
			} else {
				System.out.println("A megadott szám nem négyzetszám.");
				for (int i = number; i <= 10000; i++) {
					int x = (int) Math.sqrt(i);
					intSqrt = (int) Math.pow(x, 2);
					if (i == intSqrt) {
						System.out.println("A legközelebbi nagyobb négyzetszám a " + i + ". Ami a " + x + " négyzete.");
						break;
					}
				}
				for (int j = number; j > 0; j--) {
					int x = (int) Math.sqrt(j);
					intSqrt = (int) Math.pow(x, 2);
					if (j == intSqrt) {
						System.out.println("A legközelebbi kisebb négyzetszám a " + j + ". Ami a " + x + " négyzete.");
						break;
					}
				}
			}
		}
	}	
}
