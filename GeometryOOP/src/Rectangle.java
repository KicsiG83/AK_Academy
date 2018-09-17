
public class Rectangle extends AbstractShape {


	public Rectangle(int width, int height) {
		super(width, height);
	}

	@Override
	public void draw() {
        String lines = new String(new char[width]).replace("\0", SIGN);
        for (int i = 0; i < height; i++) {
            System.out.println(lines);
        }
	}
}
