
public class Trapezoid extends AbstractShape {

	public Trapezoid(int width, int height) {
		super(width, height);
	}

	@Override
	public void draw() {
		for (int i = height; i > 0; i--) {
			String trapezeStars = new String(new char[height]).replace("\0", SIGN);
			String repeated = new String(new byte[i]).replace("\0", " ");
			System.out.println(repeated + trapezeStars);
			height += 2;
		}
	}
}
