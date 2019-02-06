import java.util.Comparator;

/*
 *  A Comparator interface compare metódusa a paraméterben kapott 2 azonos objektumot hasonlítja egymáshoz. 
 */
public class FirstNameLastNameComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		int result = p1.getFirstName().compareTo(p2.getFirstName());
		if( result != 0) {
			return result;
		}
		return p1.getLastName().compareTo(p2.getLastName());
	}

}
