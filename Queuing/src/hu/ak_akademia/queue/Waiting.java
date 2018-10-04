package hu.ak_akademia.queue;

import java.util.List;

import hu.ak_akademia.persons.Person;

public class Waiting implements Queue {

	@Override
	public void waiting(List<Person> persons) {
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i).getName() + " nevű személyt várjuk a 01-es ablaknál ("
					+ persons.get(i).getAge() + ").");
			for (int j = 0; j < persons.get(i).getWaitingTime(); j++) {
				sleep(1);
			}
			System.out.println(persons.get(i).getName() + " befejezte az ügyintézést (" + persons.get(i).getAge()
					+ "). Az ügyintézés " + persons.get(i).getWaitingTime() + " másodpercig tartott.");
		}
		System.out.println("A várósor kiürült.");
	}

	private void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1_000L);
		} catch (InterruptedException e) {
			System.out.println("Várakozás megszakítva.");
		}
	}
}
