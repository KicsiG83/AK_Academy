import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		firstTask();
		printSeparator();
		secondTask();
		printSeparator();
		thirdTask();
		printSeparator();
		fourthTask();
		printSeparator();
		fifthTask();
		printSeparator();
		sixthTask();
	}

	/**
	 * Elsődleges rendezési szempont vezetéknév <br />
	 * Másodlagos rendezési szempont keresztnév
	 */
	private static void firstTask() {
		List<Person> personList = initList();
		Collections.sort(personList);
		printList(personList);
	}

	/**
	 * Elsődleges rendezési szempont keresztnév <br />
	 * Másodlagos rendezési szempont vezetéknév
	 */
	private static void secondTask() {
		List<Person> personList = initList();
		Collections.sort(personList, new FirstNameLastNameComparator());
		printList(personList);
	}

	private static void thirdTask() {
		List<Person> personList = initList();
		Collections.sort(personList, Collections.reverseOrder());
		printList(personList);
	}

	private static void fourthTask() {
		List<Person> personList = initList();
		Collections.sort(personList, Collections.reverseOrder(new FirstNameLastNameComparator()));
		printList(personList);
	}

	private static void fifthTask() {
		List<Person> personList = initList();
		Collections.sort(personList, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				int firstLength = o1.getFirstName().length() + o1.getLastName().length();
				int secondLength = o2.getFirstName().length() + o2.getLastName().length();
				return Integer.compare(firstLength, secondLength);
			}
		});
		printList(personList);
	}

	private static void sixthTask() {
		List<Person> personList = initList();
		Collections.sort(personList, (p1, p2) -> Integer.compare(p2.getFirstName().length() + p2.getLastName().length(),
				p1.getFirstName().length() + p1.getLastName().length()));
		printList(personList);
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

	private static void printList(List<Person> personList) {
		for (Person person : personList) {
			System.out.println(person);
		}
	}

	private static void printSeparator() {
		System.out.println("------------------------------------------------");
	}
}
