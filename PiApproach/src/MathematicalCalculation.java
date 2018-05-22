
public class MathematicalCalculation {

	public static void eulersLine(int input) {
		System.out.println("\n-----------------------Euler féle sor-----------------------");
		double x = Math.pow(Math.PI, 2) / 6;
		System.out.println("\u03C0\u00b2 / 6 = " + x);
		double denominator = 2.0;
		double a = 0.0;
		for (int i = 0; i < input; i++) {
			a = a + (1 / Math.pow(denominator, 2));
			denominator++;
		}
		a = a + 1.0;
		System.out.println("Euler féle sor alapján a közelítő érték \u2243 " + a);
	}

	public static void liebniz(int input) {
		System.out.println("\n----------------------Liebniz féle sor-----------------------");
		double x = Math.PI / 4;
		System.out.println("\u03C0 / 4 = " + x);
		double denominator = 3.0;
		double a = 1.0;
		for (int i = 1; i < input; i++) {
			if (i % 2 == 0) {
				a = a + (1 / denominator);
				denominator += 2;
			} else {
				a = a - (1.0 / denominator);
				denominator += 2;
			}
		}
		System.out.println("Liebniz féle sor alapján a közelítő érték \u2243 " + a);
	}

	public static void wallisLine(int input) {
		System.out.println("\n-----------------------Wallis féle sor-----------------------");
		double x = Math.PI / 2;
		double counter = 2.0;
		double denominator = 1.0;
		double a = 0.0;
		System.out.println("\u03C0 / 2 = " + x);
		for(int i = 0; i < input; i++) {
			if(i == 0 ) {
				a = counter / denominator;
				denominator += 2;
			}else {
				if(i % 2 == 0) {
					a = a * (counter / denominator);
					denominator+=2;
				}
				else {
					a = a * (counter / denominator);
					counter+=2;
				}
			}
		}
		System.out.println("Wallis féle sor alapján a közelítő érték \u2243 :" + a);
	}
	
	public static void vietleLine(int input) {
		System.out.println("\n-----------------------Viètel féle sor-----------------------");
		double x = 2 / Math.PI;
		System.out.println("\n2 / \u03C0 = " + x);
		double a = 0.0;
		for (int i = 0; i < input; i++) {
			if (i == 0) {
				a = Math.sqrt(2.0) / 2;
			} else {
				a = a * (Math.sqrt(2.0 + 2 * a)) / 2;
			}
		}
		System.out.println("Viètel féle sor alapján a közelítő érték \u2243 " + a);
	}
	
}