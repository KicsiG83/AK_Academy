
public class Nebula extends Orb{

	private static String type = "Nebula";

	public Nebula() {
		super();
	}
	
	public Nebula(int weight, int diameter) {
		super(weight, diameter);
		getType();
	}
	
	public Nebula(String name) {
		super(name);
	}
	
	@Override
	public String getType() {
		return type;
	}
	
}
