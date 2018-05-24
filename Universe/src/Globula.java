
public class Globula extends Nebula{

	private static String type = "Globula";
	
	@Override
	public String getType() {
		return type;
	}

	public Globula() {
		this.setWeight();
		this.setName(Name.randomName().getTextual());
		this.setType(getType());
		this.setWeight();
	}
	
	public Globula(int weight, int diameter) {
		super(weight, diameter);
	}
	
	public Globula(String name) {
		super(name);
	}
}
