
public class Triangle extends AbstractShape {

	public Triangle(int width, int height) {
		super(width, height);
	}

	@Override
	public void draw() {
		int rowSignCount = 1;
		int offset = width / (height - 1);
		for (int row = 1; row <= height; row++) {
			String stars = new String(new char[row == 1 ? 1 : rowSignCount - 1]).replace("\0", SIGN);
			System.out.println(stars);
			rowSignCount = rowSignCount + offset;
		}
	}
}
