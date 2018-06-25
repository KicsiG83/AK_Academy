
public class Check {

	public static void checkNumberLength(int number) {
		int length = (int) (Math.log10(number)+1);
		String strNumber = Integer.toString(number);
		char dig = strNumber.charAt(length - (length));
		String digit = dig + "";
		int numberOfDigit = Integer.parseInt(digit);
//		for(int i = 0; i < numberOfDigit; i++) {
//			Convert.convert(numberOfDigit);
//		}
	}
	
	public static void checkNumber(int number) {
		while(number > 1000) {
			int newNumber = number - 1000;
		}
		if(number > 100) {
		}
	}
	
}
