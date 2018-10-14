package pack.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import pack.people.People;

public class CQueue implements IQueue {

	private Queue<People> people = new LinkedList<>();

	@Override
	public void fillList(People p) {
		people.add(p);
	}

	@Override
	public void printList() {
		Iterator<People> iterator = people.iterator();
		while (iterator.hasNext()) {
			People people = iterator.next();
			System.out.println(people.getName() + " (" + people.getAge() + ")");
			people.checkOut(people.getCheckOutTime());
			System.out.println(people.getName() + " (" + people.getAge() + ") " + people.getCheckOutTime()
					+ " másodpercet várakozott.");
		}
	}
}
