
public class Numbers {

	public static void numbers(int number) {
		int digit = 0;
		int length = 0;
		String[] minus = { "         ", "         ", "  ______ ", " /_____/ ", "         ", "         " };
		String[] zero = { "_______   ", "\\   _  \\  ", "/  /_\\  \\ ", "\\  \\_/   \\", " \\_____  /","       \\/ " };
		String[] one = { " ____ ", "/_   |", " |   |", " |   |", " |___|" };
		String[] two = { "________  ", "\\_____  \\ ", " /  ____/ ", "/       \\ ", "\\_______ \\","        \\/" };
		String[] three = { "________  ", "\\_____  \\ ", "  _(__  < ", " /       \\", "/______  /","       \\/ " };
		String[] four = { "   _____  ", "  /  |  | ", " /   |  |_", "/    ^   /", "\\____   | ", "     |__|" };
		String[] five = { " .________", " |   ____/", " |____  \\ ", " /       \\", "/______  /","       \\/ " };
		String[] six = { "  ________", " /  _____/", "/   __  \\ ", "\\  |__\\  \\", " \\_____  /","       \\/ " };
		String[] seven = { "_________ ", "\\______  \\", "    /    /", "   /    / ", "  /____/  " };
		String[] eight = { "  ______  ", " /  __  \\ ", " >      < ", "/   --   \\", "\\______  /","       \\/ " };
		String[] nine = { " ________ ", "/   __   \\", "\\____    /", "   /    / ", "  /____/  " };
		
		String[][] strArray = new String[4][4];
		
		if(number < 0) {

		//minus
			
		};
		if(number == 0) {
			length = 1;
		}else {
			length = (int) Math.log10(number) + 1;
		}
		int[] array = new int[length];
		String strNumber = Integer.toString(number);
		for(int i = 0; i < array.length; i++) {
			String digitNumber = strNumber.charAt(i)+ "";
			digit = Integer.parseInt(digitNumber);
			array[i] = digit;
		}
		for (int i = 0; i < length; i++) {
			switch (array[i]) {
			case 0:
				// Ide kell betenni a tárolási logikát.
//				strArray[][] = zero;
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			}
		}
	}
}
