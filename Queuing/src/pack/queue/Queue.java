package pack.queue;

import java.util.LinkedList;
import java.util.List;

import pack.persons.Person;

public class Queue implements IQueue {

	private List<Person> persons = new LinkedList<>();

	@Override
	public void fillList(Person person) {
		persons.add(person);
	}

	@Override
	public void printList() {
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i).getName() + " (" + persons.get(i).getAge() + ")");
			for (int j = 0; j < persons.get(i).getCheckOutTime(); j++) {
				persons.get(i).checkOut();
			}
			System.out.println(persons.get(i).getName() + " (" + persons.get(i).getAge() + ") "
					+ persons.get(i).getCheckOutTime() + " másodpercet várakozott.");
		}
	}
}
