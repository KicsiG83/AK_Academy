
public class BrownDwarf extends Star {

	private static String type = "Barna törpe";

	@Override
	public String getType() {
		return type;
	}
	
	public BrownDwarf() {
		this.setName(Name.randomName().getTextual());
	}
	
}
