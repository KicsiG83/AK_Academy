import java.util.Random;

public class Universe {

	static Random rn = new Random();
	static int rnNumber;
	private int weight;
	private int diameter;
	private String name;
	
	public Universe() {
		this.getName();
	}
	
	public int getWeight() {
		return weight;
	}
	public int setWeight(int number) {
		return number;
	}
	public int getDiameter() {
		return diameter;
	}
	public int setDiameter() {
		return rn.nextInt(1000);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = Name.randomName().getTextual();
	}
	
	public static int randomNumber() {
		return rnNumber = rn.nextInt(1000);
	}
	
}
