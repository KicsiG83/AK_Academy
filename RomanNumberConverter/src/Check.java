
public class Check {

	public boolean checkArabicNumber(String userInput) {
		try {
			int number = Integer.parseInt(userInput);
			if (number <= 0) {
				System.out.println("A megadott érték érvénytelen.");
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			System.out.println("A megadott érték érvénytelen.");
			return false;
		}
	}

	public boolean checkRomanNumber(String userInput) {
		if (userInput.matches("^M{0,}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$")) {
			return true;
		} else {
			System.out.println("Az input érvénytelen.");
			return false;
		}
	}
}
