
public class Numbers {
	
	private static int z;
	private static int y;
	private static int length;
	private static String strNumber;
	private static boolean minusNumber;
	private static String[][] strArray;
	public static int[] numberArray;
	private static String[] dummy = new String[6];
	private static final String[] minus = { "         ", "         ", "  ______ ", " /_____/ ", "         ", "         " };
	private final static String[] zero = { "_______   ", "\\   _  \\  ", "/  /_\\  \\ ", "\\  \\_/   \\", " \\_____  /","       \\/ " };
	private final static String[] one = { " ____ ", "/_   |", " |   |", " |   |", " |___|","      " };
	private final static String[] two = { "________  ", "\\_____  \\ ", " /  ____/ ", "/       \\ ", "\\_______ \\","        \\/" };
	private final static String[] three = { "________  ", "\\_____  \\ ", "  _(__  < ", " /       \\", "/______  /","       \\/ " };
	private final static String[] four = { "   _____  ", "  /  |  | ", " /   |  |_", "/    ^   /", "\\____   | ", "     |__|" };
	private final static String[] five = { " .________", " |   ____/", " |____  \\ ", " /       \\", "/______  /","       \\/ " };
	private final static String[] six = { "  ________", " /  _____/", "/   __  \\ ", "\\  |__\\  \\", " \\_____  /","       \\/ " };
	private final static String[] seven = { "_________ ", "\\______  \\", "    /    /", "   /    / ", "  /____/  ","          " };
	private final static String[] eight = { "  ______  ", " /  __  \\ ", " >      < ", "/   --   \\", "\\______  /","       \\/ " };
	private final static String[] nine = { " ________ ", "/   __   \\", "\\____    /", "   /    / ", "  /____/  ","          " };
	
	public static String getStrNumber() {
		return strNumber;
	}

	public static void setStrNumber(String strNumber) {
		Numbers.strNumber = strNumber;
	}

	public static void numbers(int number) {
		number = getNumberLength(number);
		strArray = new String[6][length];
		strArray = uploadMinusSign(strArray);
		strNumber = Integer.toString(number);
		numberArray = new int[strNumber.length()];
		getDigitFromNumber(strNumber, numberArray);
		getAsciiForUpload(z, strArray, numberArray);
		printAsciiNumber(strArray);
	}

	private static int getNumberLength(int number) {
		if(number == 0) {
			length = 1;
		}else{
			if(number < 0) {
				number = number * -1;
				minusNumber = true;
			}
			length = (int) Math.log10(number) + 1;
		}
		return number;
	}

	private static String[][] uploadMinusSign(String[][] strArray) {
		if(minusNumber) {
			length = length + 1;
			strArray = new String[6][length];
			dummy = minus;
			for(z = 0; z < dummy.length; z++) {
				strArray[z][y] = dummy[z];
			}
			z = 1;
			y = 1;
		};
		return strArray;
	}

	private static int getAsciiForUpload(int z, String[][] strArray, int[] array) {
		for (int i = 0; i < getStrNumber().length(); i++) {
			switch (array[i]) {
			case 0:
				dummy = zero;
				break;
			case 1:
				dummy = one;
				break;
			case 2:
				dummy = two;
				break;
			case 3:
				dummy = three;
				break;
			case 4:
				dummy = four;
				break;
			case 5:
				dummy = five;
				break;
			case 6:
				dummy = six;
				break;
			case 7:
				dummy = seven;
				break;
			case 8:
				dummy = eight;
				break;
			case 9:
				dummy = nine;
				break;
			}
			uploadKfcArray(z, strArray);
			z++;
		}
		return z;
	}

	private static void uploadKfcArray(int z, String[][] strArray) {
		for(int j = 0; j < dummy.length; j++) {
			strArray[j][z] = dummy[j]; 
		}
	}

	private static void getDigitFromNumber(String strNumber, int[] array) {
		int digit;
		for(int i = 0; i < array.length; i++) {
			String digitNumber = strNumber.charAt(i)+ "";
			digit = Integer.parseInt(digitNumber);
			array[i] = digit;
		}
	}

	private static void printAsciiNumber(String[][] strArray) {
		for(int i = 0; i < strArray.length; i++) {
			for(int j = 0; j < strArray[0].length; j++) {
				System.out.print(strArray[i][j]);
			}
			System.out.println();
		}
	}
}
