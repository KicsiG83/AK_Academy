package hu.ak_akademia.main;

import hu.ak_akademia.persons.Person;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Person[] persons = new Person[10];
		for(int i = 0; i < persons.length; i++) {
			persons[i] = new Person();
		}
		
		for(int i = 0; i < persons.length; i++) {
			System.out.println(persons[i].getName() + " " +  persons[i].getAge() + " vár " + persons[i].getMinWaitingTime());
		}
	}
}
