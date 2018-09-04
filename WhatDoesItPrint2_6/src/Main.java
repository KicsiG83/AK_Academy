
public class Main {

	public static void main(String[] args) {
		int g = +2 - (2 + 3);
		int h = -g;
		int i = -0 + ++h;
		outer: switch (i) {
		default:
		case 4:
			inner: switch (i + 6) {
			default:
				System.out.println("eh, ");
				break inner;
			case 10:
				System.out.println("good news everyone!");
				break outer;
			}
		case 1:
		case 3:
		case 0:
		case 10:
			System.out.println("wha?");
		}
	}
}
