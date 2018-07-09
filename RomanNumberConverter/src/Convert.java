import java.util.TreeMap;

public class Convert {

	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public final static TreeMap<Integer, String> arabicToRoman = new TreeMap<Integer, String>();
	static {
		arabicToRoman.put(1000, "M");
		arabicToRoman.put(900, "CM");
		arabicToRoman.put(500, "D");
		arabicToRoman.put(400, "CD");
		arabicToRoman.put(100, "C");
		arabicToRoman.put(90, "XC");
		arabicToRoman.put(50, "L");
		arabicToRoman.put(40, "XL");
		arabicToRoman.put(10, "X");
		arabicToRoman.put(9, "IX");
		arabicToRoman.put(5, "V");
		arabicToRoman.put(4, "IV");
		arabicToRoman.put(1, "I");
	}

	public final static TreeMap<String, Integer> romanToArabic = new TreeMap<String, Integer>();
	static {
		romanToArabic.put("M", 1000);
		romanToArabic.put("CM", 900);
		romanToArabic.put("D", 500);
		romanToArabic.put("CD", 400);
		romanToArabic.put("C", 100);
		romanToArabic.put("XC", 90);
		romanToArabic.put("L", 50);
		romanToArabic.put("XL", 40);
		romanToArabic.put("X", 10);
		romanToArabic.put("IX", 9);
		romanToArabic.put("V", 5);
		romanToArabic.put("IV", 4);
		romanToArabic.put("I", 1);
	}

	public String toRoman(int number) {
		int index = arabicToRoman.floorKey(number);
		if (number == index) {
			System.out.print(arabicToRoman.get(index));
			return arabicToRoman.get(number);
		}
		System.out.print(arabicToRoman.get(index));
		return arabicToRoman.get(index) + toRoman(number - index);
	}

	public int toArabic(String userInput) {
		setNumber(getNumber());
		if (userInput.length() > 0) {
			String digit = Character.toString(userInput.charAt(0));
			String index = romanToArabic.floorKey(digit);
			int substringIndex = 1;
			while (userInput.length() > 0) {
				if (digit.equals("C") || digit.equals("X") || digit.equals("I")) {
					if (userInput.length() > 1) {
						String secondDigit = Character.toString(userInput.charAt(1));
						String concatDigit = digit + secondDigit;
						if (concatDigit.equals("CM") || concatDigit.equals("CD") || concatDigit.equals("XC")
								|| concatDigit.equals("XL") || concatDigit.equals("IX") || concatDigit.equals("IV")) {
							index = concatDigit;
							substringIndex = 2;
						}
					}
				}
				setNumber(getNumber() + romanToArabic.get(index));
				return toArabic(userInput.substring(substringIndex, userInput.length()));
			}
		}
		return number;
	}
}
