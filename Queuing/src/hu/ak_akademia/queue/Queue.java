package hu.ak_akademia.queue;

import java.util.List;

import hu.ak_akademia.persons.Person;

public interface Queue {

	void waiting(List<Person> persons);
	
}
