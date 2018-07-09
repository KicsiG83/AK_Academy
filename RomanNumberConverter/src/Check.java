
public class Check {

	public boolean checkArabicNumber(String userInput) {
		try {
			if (Integer.parseInt(userInput) <= 0) {
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
	
	public boolean checkUserInput(String userInput, int index) {
		if (index == 1) {
			try {
				if (Integer.parseInt(userInput) <= 0) {
					System.out.println("A megadott érték érvénytelen.");
					return false;
				} else {
					return true;
				}
			} catch (Exception e) {
				System.out.println("A megadott érték érvénytelen.");
				return false;
			}
		} else {
			if (userInput.matches("^M{0,}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$")) {
				return true;
			} else {
				System.out.println("Az input érvénytelen.");
				return false;
			}
		}
	}
}
