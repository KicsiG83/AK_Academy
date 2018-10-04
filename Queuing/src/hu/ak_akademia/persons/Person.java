package hu.ak_akademia.persons;

import java.util.Random;

public abstract class Person implements IPerson {

	private int age;
	private String name;
	private int checkOutTime;
	private Type type;

	protected Person() {
		this.name = Name.randomName().getTextual();
		this.age = new Random().nextInt(100 - 10) + 10;
		this.type = Type.randomType();
		checkOut(type);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public void checkOut(Type type) {
		int max = 0;
		int min = 0;
		switch (type) {
		case YOUNGADULT:
			min = 1;
			max = 6;
			break;
		case ADULT:
			min = 4;
			max = 8;
			break;
		default:
			min = 8;
			max = 12;
			break;
		}
		this.checkOutTime = new Random().nextInt(max - min) + min;
	}

	public int getWaitingTime() {
		return checkOutTime;
	}
}
