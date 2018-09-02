package stringmethodes;

public class StringExamples {
	public static void main(String[] args) {
		String a = "AnDrIs";
		String b = "ANDR";
		b += "IS";
		System.out.println(a);
		System.out.println(b);
		System.out.println(isEqualTo(a, b));
		System.out.println(a.equalsIgnoreCase(b));
	}

	public static boolean isEqualTo(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
