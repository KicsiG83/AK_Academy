
public class Numbers {

	public static void numbers(int number) {
		int length = 0;
		int z= 0;
		int y = 0;
		String[] dummy = new String[6];
		String[] minus = { "         ", "         ", "  ______ ", " /_____/ ", "         ", "         " };
		String[] zero = { "_______   ", "\\   _  \\  ", "/  /_\\  \\ ", "\\  \\_/   \\", " \\_____  /","       \\/ " };
		String[] one = { " ____ ", "/_   |", " |   |", " |   |", " |___|","      " };
		String[] two = { "________  ", "\\_____  \\ ", " /  ____/ ", "/       \\ ", "\\_______ \\","        \\/" };
		String[] three = { "________  ", "\\_____  \\ ", "  _(__  < ", " /       \\", "/______  /","       \\/ " };
		String[] four = { "   _____  ", "  /  |  | ", " /   |  |_", "/    ^   /", "\\____   | ", "     |__|" };
		String[] five = { " .________", " |   ____/", " |____  \\ ", " /       \\", "/______  /","       \\/ " };
		String[] six = { "  ________", " /  _____/", "/   __  \\ ", "\\  |__\\  \\", " \\_____  /","       \\/ " };
		String[] seven = { "_________ ", "\\______  \\", "    /    /", "   /    / ", "  /____/  " };
		String[] eight = { "  ______  ", " /  __  \\ ", " >      < ", "/   --   \\", "\\______  /","       \\/ " };
		String[] nine = { " ________ ", "/   __   \\", "\\____    /", "   /    / ", "  /____/  ","          " };
		boolean minusNumber = false;
		if(number == 0) {
			length = 1;
		}else{
			if(number < 0) {
				number = number * -1;
				minusNumber = true;
			}
			length = (int) Math.log10(number) + 1;
		}
		String[][] strArray = new String[6][length];
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
		String strNumber = Integer.toString(number);
		int[] array = new int[strNumber.length()];
		getDigitFromNumber(strNumber, array);
		for (int i = 0; i < strNumber.length(); i++) {
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
			for(int j = 0; j < dummy.length; j++) {
				strArray[j][z] = dummy[j]; 
			}
			z++;
		}
		printAsciiNumber(strArray);
	}

	private static void getDigitFromNumber(String strNumber, int[] array) {
		int digit;
		for(int i = 0; i < strNumber.length(); i++) {
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
