
public class Globula extends Universe{

	public Globula() {
		super();
	}
	
	public Globula(int weight, int diameter) {
		super(weight, diameter);
	}
	
	public Globula(String name) {
		super(name);
	}
	
	public void printGlobula(String inputName, String inputType, int inputWeight) {
		System.out.println(inputName + " - " + inputType + ". \nA súlya: " + inputWeight + " millió kg.");
	}
	
}
