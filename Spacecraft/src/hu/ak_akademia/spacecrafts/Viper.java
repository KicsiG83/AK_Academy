package hu.ak_akademia.spacecrafts;

public class Viper extends AbstractAircraft{

	public Viper(String name) {
		super(name);
	}

	@Override
	public void fly() {
		String name = super.getName();
		System.out.println(name + " is flyin'");
	}
	
}
