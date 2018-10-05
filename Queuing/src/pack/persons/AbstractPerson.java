package pack.persons;

public abstract class AbstractPerson implements IPerson {

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
	public void checkOut() {
		try {
			Thread.sleep(1_000L);
		} catch (InterruptedException e) {
			System.out.println("Várakozás megszakítva.");
		}
	}

	public AbstractPerson(String name, int age, int checkOutTime) {
		this.name = name;
		this.age = age;
		this.checkOutTime = checkOutTime;
	}


	public int getCheckOutTime() {
		return checkOutTime;
	}
}
