package hu.ak_akademia.main;

import java.util.LinkedList;
import java.util.List;

import hu.ak_akademia.persons.CreatePerson;
import hu.ak_akademia.persons.Person;
import hu.ak_akademia.queue.Waiting;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		List<Person> persons = new LinkedList<>();
		int maxPersonNumber = 10;
		fillPersonsArray(persons, maxPersonNumber);
		new Waiting().waiting(persons);
	}

	private void fillPersonsArray(List<Person> persons, int maxIteration) {
		for (int i = 0; i < maxIteration; i++) {
			persons.add(new CreatePerson());
		}
	}
}
