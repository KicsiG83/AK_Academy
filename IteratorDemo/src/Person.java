import java.util.Iterator;
import java.util.Objects;

/*
 * Comparable természetes sorrend, csak 1 lehet belőle az osztályon belül, ami megvalósítja ezt az interface-t.
 * Az adott objektumot hasonlítja össze a paraméterben kapott objektummal
 */

public class Person implements Iterable<Character> {

	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
	}

	@Override
	public Iterator<Character> iterator() {
		return new Iterator<Character>() {
			int index = 0;

			@Override
			public boolean hasNext() {
				return index < lastName.length();
			}

			@Override
			public Character next() {
				return lastName.charAt(index++);
			}

		};
	}

	@Override
	public String toString() {
		return lastName + " " + firstName;
	}

}
