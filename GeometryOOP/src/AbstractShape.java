
public abstract class AbstractShape implements Shape {

	protected int width;
	protected int height;

	public AbstractShape(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void print(int index) {
		for (int i = height; i > 0; i--) {
			String stars = new String(new char[index]).replace("\0", SIGN);
			String repeated = new String(new byte[i]).replace("\0", " ");
			System.out.println(repeated + stars);
			index += 2;
		}
	}
}
