import java.util.Random;

public class Main {

	static Random rn = new Random();
	
	public static void main(String[] args) {

		Universe blackHole = new BlackHole();
		blackHole.setName(Name.randomName().getTextual());
		blackHole.setWeight(rnNumber());
		blackHole.setDiameter();
		System.out.println(blackHole.getName() + " " + blackHole.getWeight() + " " + blackHole.getWeight());
		
		
	}
	public static int rnNumber() {
		return rn.nextInt(10000);
	}
}
