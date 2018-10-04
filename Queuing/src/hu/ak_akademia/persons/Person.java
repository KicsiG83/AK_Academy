package hu.ak_akademia.persons;

public class Person {

	private int age;
	private String name;
	private int minWaitingTime;
	private int maxWaitingTime;
	
	
	
	public Person() {
//		this.name = new Name().getTextual();
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMinWaitingTime() {
		return minWaitingTime;
	}
	public void setMinWaitingTime(int minWaitingTime) {
		this.minWaitingTime = minWaitingTime;
	}
	public int getMaxWaitingTime() {
		return maxWaitingTime;
	}
	public void setMaxWaitingTime(int maxWaitingTime) {
		this.maxWaitingTime = maxWaitingTime;
	}
	
	
	
}
