
public class MathematicalCalculation {

	public static void wallisLine(int input) {
		System.out.println("\n-----------------------Wallis féle sor-----------------------");
		double x = Math.PI / 2;
		double counter = 2.0;
		double denominator = 1.0;
		double a = 0.0;
		System.out.println("\u03C0 / 2 közelítő értéke \u2243 " + x);
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
	
	/*
	 * A Viètel sor megoldása Balázsé. 
	 * Matematikailag elbuktam ezt a feladatot.
	 */
	public static void vietleLine(int input) {
		System.out.println("\n-----------------------Viètel féle sor-----------------------");
		double x = 2 / Math.PI;
		System.out.println("\n2 / \u03C0 közelítő értéke \u2243 " + x);
		double denominator = 2.0;
		double b=Math.sqrt(2) / denominator;
		double a=b;
		while(input>0) {
			b = Math.sqrt(2+2*b) / denominator;
			a = a*b;
			input--;
		}
		System.out.println("Viètel féle sor alapján a közelítő érték \u2243 " + a);
	}
	
}