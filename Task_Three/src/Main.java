
public class Main {

	public static void main(String[] args) {
		TrafficLight tl10 = new TrafficLight();
		TrafficLight tl3 = new TrafficLight();
		method(tl10, 10);
		System.out.println("---------------");
		method(tl3, 3);
	}

	private static void method(TrafficLight tl, int round) {
		System.out.println(tl.isFree() ? "Az áthladás szabad. " : "Az áthaladás tilos!");
		for (int i = 0; i < round; i++) {
				tl.transition();
				System.out.println(tl.toString() + "\n");
		}
		System.out.println(tl.isFree() ? "Az áthladás szabad. " : "Az áthaladás tilos!");
	}
}
