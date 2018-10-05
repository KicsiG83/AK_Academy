package pack.main;

import java.util.Random;

import pack.persons.Name;
import pack.persons.Person;
import pack.queue.Queue;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Queue q = new Queue();
		for (int i = 0; i < 6; i++) {
			q.fillList(createPerson());
		}
		q.printList();
	}

	private Person createPerson() {
		int age = new Random().nextInt(100 - 10) + 10;
		int wait = getWatingTime(age);
		Person p = new Person(Name.randomName().getTextual(), age, wait);
		return p;
	}

	private static int getWatingTime(int age) {
		int max = 0;
		int min = 0;
		if (age < 18) {
			min = 1;
			max = 6;
		} else if (age > 18 && age < 60) {
			min = 4;
			max = 8;
		} else {
			min = 8;
			max = 12;
		}
		return new Random().nextInt(max - min) + min;
	}
}
