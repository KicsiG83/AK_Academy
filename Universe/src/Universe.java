import java.util.Random;

public class Universe {

	static Random rn = new Random();
	static int rnNumber;
	private int weight;
	private int diameter;
	private String name;
	private String type	;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Universe() {
		setName(Name.randomName().getTextual());
		setWeight();
		setDiameter();
	}
	public Universe(String name) {
		this.name = name;
		setDiameter();
		setWeight();
	}
	public Universe(int weight, int diameter) {
		setName(Name.randomName().getTextual());
		this.weight = weight;
		this.diameter = diameter;
	}

	public int getWeight() {
		return weight;
	}
	public int setWeight() {
		return weight = rn.nextInt(1000);
	}
	public int getDiameter() {
		return diameter;
	}
	public int setDiameter() {
		return diameter = rn.nextInt(1000);
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
	
	public static void printData (String inputName, String inputType, int inputWeight, int inputDiameter) {
		String printName = inputName;
		String printType = inputType;
		int printWeight = inputWeight;
		int printDiameter = inputDiameter;
		System.out.println(printName + " - " + printType + ". \nA súlya: " + printWeight + " millió kg. \nÁtmérője: " + printDiameter + " millió km.\n");
	}
}
