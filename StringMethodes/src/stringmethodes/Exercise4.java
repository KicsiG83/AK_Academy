package stringmethodes;

public class Exercise4 {
	public static void main(String[] args) {
		isLonger("karalábé", 5);
		isLonger("borjúpecsenye", 15);
	}

	public static boolean isLonger(String text, int number) {
		if (text.length() > number) {
			System.out.println("A String hossza nagyobb!");
			return true;
		} else {
			System.out.println("Nem a String hossza nagyobb!");
			return false;
		}
	}
}
