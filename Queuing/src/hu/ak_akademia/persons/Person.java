package hu.ak_akademia.persons;

import java.util.Random;

public class Person {

	private int age;
	private String name;
	private int minWaitingTime;
	private int maxWaitingTime;
	
	public Person() {
		this.name = Name.randomName().getTextual();
		this.age = new Random().nextInt(100) + 5;
		this.minWaitingTime = setMinWaitingTime(age);
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public int getMinWaitingTime() {
		return minWaitingTime;
	}
	
	public void setMaxWaitingTime(int age) {
		//TODO a számokat a min-hez igazítani
		if(age < 18) {
			this.maxWaitingTime = new Random().nextInt(6) + 1;
		}else if(age > 18 && age < 60) {
			this.maxWaitingTime = new Random().nextInt(6) + 1;
		}else {
			this.maxWaitingTime = new Random().nextInt(6) + 1;
		}
	}
	
	public int getMaxWaitingTime() {
		return maxWaitingTime;
	}
	
	public int setMinWaitingTime(int age) {
		if(age < 18) {
			return new Random().nextInt(6) + 1;
		}else if(age > 18 && age < 60) {
			return new Random().nextInt(8) + 4;
		}else {
			return new Random().nextInt(12) + 8;
		}
	}
	
}
