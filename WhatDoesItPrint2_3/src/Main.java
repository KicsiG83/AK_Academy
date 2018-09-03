
public class Main {

	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		int c = b / a;
		for(int i = b; i >= c; i-=2) {
			if(i == 3 || i == 5) {
				continue;
			}
			System.out.println(a + " <-> " + i);
		}
	}
}
