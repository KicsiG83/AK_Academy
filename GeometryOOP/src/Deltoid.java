
public class Deltoid extends AbstractShape{

	public Deltoid(int width, int height) {
		super(width, height);
	}

	@Override
	public void draw() {
		for (int i = height; i > 0; i--) {
			String rombusStars = new String(new char[width]).replace("\0", SIGN);
			String repeated = new String(new byte[i]).replace("\0", " ");
			System.out.println(repeated + rombusStars);
			width += 2;
		}
		int skew = 3;
		for (int i = 1; i < 3; i++) {
			String rombusStarsDown = new String(new char[skew]).replace("\0", SIGN);
			String repeated = new String(new byte[i + 1]).replace("\0", " ");
			for(int j = 0; j < 2; j++){
				System.out.println(repeated + rombusStarsDown);
			}
			skew -= 2;
		}
	}
}
