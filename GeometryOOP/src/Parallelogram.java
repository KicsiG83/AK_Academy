
public class Parallelogram extends AbstractShape {

	public Parallelogram(int width, int height) {
		super(width, height);
	}

	@Override
	public void draw() {
		String paralelogrammaStars = new String(new char[width]).replace("\0", SIGN);
		for (int i = height; i > 0; i--) {
			String repeated = new String(new byte[i]).replace("\0", " ");
			System.out.println(repeated + paralelogrammaStars);
		}
	}
}
