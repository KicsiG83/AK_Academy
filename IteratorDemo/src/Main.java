import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String[] args) {

		printPersonLastNameCharacters();
		printList();
		printListWithListIterator();
		printMap();
		System.out.println("-------------------------");
		printMapWithInLine();
		printSet();
	}

	private static void printPersonLastNameCharacters() {
		Person p = new Person("Jakab", "Gipsz");
		for (Character character : p) {
			System.out.print(character);
		}
		System.out.println();
	}

	/**
	 * Iterator, az utolsó ; után nem kell növelni az értékét, mert addig megy, amíg
	 * van következő elem! A for ciklus első sora az iterator next() metódusa, ami a
	 * lista aktuális Objektumára mutat.
	 */
	private static void printList() {
		List<Person> personList = initList();
		for (Iterator<Person> it = personList.iterator(); it.hasNext();) {
			Person p = it.next();
			System.out.println(p.toString());
		}
	}

	private static void printListWithListIterator() {
		List<Person> personList = initList();
		for (ListIterator<Person> it = personList.listIterator(); it.hasNext();) {
			Person p = it.next();
			System.out.println(p.toString());
		}
		System.out.println("------------------------------");
		for (ListIterator<Person> it = personList.listIterator(personList.size()); it.hasPrevious();) {
			int currentIndex = it.previousIndex();
			it.previous();
			if (currentIndex % 3 == 0) {
				it.remove();
			} else if (currentIndex % 5 == 0) {
				it.set(new Person("Aladár", "Németh" + currentIndex));
			} else {
			}
		}
		for (Person person : personList) {
			System.out.println(person);
		}
	}

	private static void printMapWithInLine() {
		Map<Integer, Person> myMap = initMap();
		for (Entry<Integer, Person> entry : myMap.entrySet()) {
			System.out.println(entry.getKey() + " ---->> " + entry.getValue());
		}
	}

	private static void printMap() {
		Map<Integer, Person> myMap = initMap();
		Set<Entry<Integer, Person>> entrySet = myMap.entrySet();
		for (Entry<Integer, Person> entry : entrySet) {
			System.out.println(entry.getKey() + " ---->> " + entry.getValue());
		}
	}

	private static void printSet() {
		Set<Person> mySet = initSet();
		for (Iterator<Person> myIterartor = mySet.iterator(); myIterartor.hasNext();) {
			Person p = myIterartor.next();
			System.out.println(p);
		}
	}

	private static List<Person> initList() {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Jakab", "Gipsz"));
		personList.add(new Person("Jakab", "Kis"));
		personList.add(new Person("Aladár", "Kassai"));
		personList.add(new Person("Béla", "Nagy"));
		personList.add(new Person("Aladár", "Németh"));
		personList.add(new Person("Péter", "Balog"));
		personList.add(new Person("Kázmér", "Tót"));
		personList.add(new Person("Huba", "Tóth"));
		personList.add(new Person("Kristóf", "Szabó"));
		personList.add(new Person("Zoltán", "Kovács"));
		personList.add(new Person("Zalán", "Kovács"));
		personList.add(new Person("Vivien", "Balogh"));
		return personList;
	}

	private static Map<Integer, Person> initMap() {
		Map<Integer, Person> personMap = new HashMap<>();
		personMap.put(ThreadLocalRandom.current().nextInt(1000), new Person("Jakab", "Gipsz"));
		personMap.put(ThreadLocalRandom.current().nextInt(1000), new Person("Jakab", "Kis"));
		personMap.put(ThreadLocalRandom.current().nextInt(1000), new Person("Aladár", "Kassai"));
		personMap.put(ThreadLocalRandom.current().nextInt(1000), new Person("Béla", "Nagy"));
		personMap.put(ThreadLocalRandom.current().nextInt(1000), new Person("Aladár", "Németh"));
		personMap.put(ThreadLocalRandom.current().nextInt(1000), new Person("Péter", "Balog"));
		personMap.put(ThreadLocalRandom.current().nextInt(1000), new Person("Kázmér", "Tót"));
		personMap.put(ThreadLocalRandom.current().nextInt(1000), new Person("Huba", "Tóth"));
		personMap.put(ThreadLocalRandom.current().nextInt(1000), new Person("Kristóf", "Szabó"));
		personMap.put(ThreadLocalRandom.current().nextInt(1000), new Person("Zoltán", "Kovács"));
		personMap.put(ThreadLocalRandom.current().nextInt(1000), new Person("Zalán", "Kovács"));
		personMap.put(ThreadLocalRandom.current().nextInt(1000), new Person("Vivien", "Balogh"));
		return personMap;
	}

	private static Set<Person> initSet() {
		Set<Person> personSet = new HashSet<>();
		personSet.add(new Person("Jakab", "Gipsz"));
		personSet.add(new Person("Jakab", "Kis"));
		personSet.add(new Person("Aladár", "Kassai"));
		personSet.add(new Person("Béla", "Nagy"));
		personSet.add(new Person("Aladár", "Németh"));
		personSet.add(new Person("Péter", "Balog"));
		personSet.add(new Person("Kázmér", "Tót"));
		personSet.add(new Person("Huba", "Tóth"));
		personSet.add(new Person("Kristóf", "Szabó"));
		personSet.add(new Person("Zoltán", "Kovács"));
		personSet.add(new Person("Zalán", "Kovács"));
		personSet.add(new Person("Vivien", "Balogh"));
		return personSet;
	}

}
