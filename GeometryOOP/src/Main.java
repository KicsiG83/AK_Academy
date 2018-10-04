
public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		Shape[] array = new Shape[1];
//		array[0] = new Triangle(100, 5);
//		array[1] = new Rectangle(6, 3);
		array[0] = new Rhombus(1, 5);
//		array[3] = new Parallelogram(4, 3);
//		array[4] = new Trapezoid(4, 3);
//		array[5] = new Square(3);
//		array[6] = new Deltoid(1, 3);
		print(array);
	}

	private void print(Shape[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i].draw();
			breakLine();
		}
	}

	private void breakLine() {
		System.out.println("\n---------------------------------------\n");
	}
}
