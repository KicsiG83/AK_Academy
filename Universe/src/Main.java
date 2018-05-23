import java.util.Random;

public class Main {

	static Random rn = new Random();
	
	public static void main(String[] args) {

		BlackHole blackHole = new BlackHole();
		blackHole.setName(Name.randomName().getTextual());
		blackHole.setWeight();
		blackHole.setElectricCharge(Orb.randomNumber());
		blackHole.setRotation(0.95);
		blackHole.printBlackHole(blackHole.getName(), blackHole.getType(), blackHole.getWeight(), blackHole.getRotation(), blackHole.getElectricCharge());
		
		Globula globula = new Globula();
		globula.setType("globula");
		globula.setWeight();
		globula.printGlobula(Name.randomName().getTextual(), globula.getType(), globula.getWeight());
		
		Blazar blazar = new Blazar();
		blazar.setName(Name.randomName().getTextual());
		blazar.printBlazar(blazar.getName(), blazar.getType(), blazar.isRadioBroadcasting());
		
		BrownDwarf brownDwarf = new BrownDwarf();
		brownDwarf.setName(Name.randomName().getTextual());
		brownDwarf.printData(brownDwarf.getName(), brownDwarf.getType(), brownDwarf.getWeight(), brownDwarf.getDiameter());
	}
}
