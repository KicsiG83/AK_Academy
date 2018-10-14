package pack.people;

public abstract class AbstractPeople implements IPeople {

	private String name;
	private int age;
	private int checkOutTime;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public void checkOut(int number) {
		try {
			Thread.sleep(number * 1_000L);
		} catch (InterruptedException e) {
			System.out.println("Várakozás megszakítva.");
		}
	}

	public AbstractPeople(String name, int age, int checkOutTime) {
		this.name = name;
		this.age = age;
		this.checkOutTime = checkOutTime;
	}

	public int getCheckOutTime() {
		return checkOutTime;
	}
}
