package hu.ak_akademia.spacecrafts;

public class AbstractAircraft implements CanFly {

	private String name;

	public AbstractAircraft(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void fly() {
		System.out.println("flying high in the sky");
	}

}
