
public class Check {

	public boolean checkArabicNumber(String userInput) {
		boolean valid = false;
		try {
			int number = Integer.parseInt(userInput);
			if(number <=0) {
				System.out.println("A megadott érték érvénytelen.");
				valid = false;
			}else {
				valid = true;
			}
		}catch (Exception e) {
			System.out.println("A megadott érték érvénytelen.");
			valid = false;
		}
		return valid;
	}
	
}
