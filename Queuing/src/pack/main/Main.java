package pack.main;

import java.util.Random;

import pack.people.Name;
import pack.people.People;
import pack.queue.CQueue;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		CQueue q = new CQueue();
		for (int i = 0; i < 6; i++) {
			q.fillList(createPerson());
		}
		q.printList();
	}

	private People createPerson() {
		int age = new Random().nextInt(100 - 10) + 10;
		int wait = getWatingTime(age);
		People p = new People(Name.randomName().getTextual(), age, wait);
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
