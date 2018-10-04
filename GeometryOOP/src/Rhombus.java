
public class Rhombus extends AbstractShape {

	public Rhombus(int width, int height) {
		super(width, height);
	}

	@Override
	public void draw() {
		print(width);
		int originalHeight = height;
		for (int i = width; i < originalHeight; i++) {
			String starsDown = new String(new char[height+2]).replace("\0", SIGN);
			String repeated = new String(new byte[i + 1]).replace("\0", " ");
			System.out.println(repeated + starsDown);
			height -= 2;
		}
	}
}
