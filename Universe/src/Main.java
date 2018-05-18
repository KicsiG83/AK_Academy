import java.util.Random;

public class Main {

	static Random rn = new Random();
	
	public static void main(String[] args) {

		Universe blackHole = new BlackHole();
		blackHole.setName(Name.randomName().getTextual());
		blackHole.setWeight();
		blackHole.setDiameter();
		System.out.println(blackHole.getName() + " " + blackHole.getWeight() + " " + blackHole.getDiameter());
		
		
		Globula globula = new Globula();
		System.out.println(globula.getName() + " " + globula.getWeight() + " " + globula.getDiameter());
		
		Globula gl = new Globula(100, 200);
		System.out.println(gl.getName() + " " + gl.getWeight() + " " + gl.getDiameter());
		
	}
}
