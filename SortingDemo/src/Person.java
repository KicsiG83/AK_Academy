
/*
 * Comparable természetes sorrend, csak 1 lehet belőle az osztályon belül, ami megvalósítja ezt az interface-t.
 * Az adott objektumot hasonlítja össze a paraméterben kapott objektummal
 */

public class Person implements Comparable<Person> {

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
	public String toString() {
		return lastName + " " + firstName;
	}

	@Override
	public int compareTo(Person other) {
		int result = this.lastName.compareTo(other.lastName);
		if (result != 0) {
			return result;
		}
		return this.firstName.compareTo(other.firstName);
	}

}
