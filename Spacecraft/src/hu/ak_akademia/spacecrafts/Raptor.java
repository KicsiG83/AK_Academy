package hu.ak_akademia.spacecrafts;

public class Raptor extends AbstractAircraft{

	public Raptor(String name) {
		super(name);
	}

	@Override
	public void fly() {
		String name = super.getName();
		System.out.println("flying Raptor: " + name);
	}
	
}
