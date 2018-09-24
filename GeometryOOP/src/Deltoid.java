
public class Deltoid extends AbstractShape{

	public Deltoid(int width, int height) {
		super(width, height);
	}

	@Override
	public void draw() {
		print(width);
		for (int i = 1; i < 3; i++) {
			String starsDown = new String(new char[height]).replace("\0", SIGN);
			String repeated = new String(new byte[i + 1]).replace("\0", " ");
			for(int j = 0; j < 2; j++){
				System.out.println(repeated + starsDown);
			}
			height -= 2;
		}
	}
}
