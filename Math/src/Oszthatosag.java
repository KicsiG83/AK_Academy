
public class Oszthatosag {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 2;
		int c = a%b;
		if(a%b == 0) {
			System.out.println(a + " / " + b + " = " + c);
			System.out.println("Nincs marad�k");
		}
		else {
			System.out.println(a + " / " + b + " = " + c);
			System.out.println(c + " a marad�k");
		}
		
	}

}
