
public class Rhombus extends AbstractShape {

	public Rhombus(int width, int height) {
		super(width, height);
	}

	@Override
	public void draw() {
		print(width);
		for (int i = 1; i < 3; i++) {
			String starsDown = new String(new char[height]).replace("\0", SIGN);
			String repeated = new String(new byte[i + 1]).replace("\0", " ");
			System.out.println(repeated + starsDown);
			height -= 2;
		}
	}
}
