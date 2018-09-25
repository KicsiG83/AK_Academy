import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> characters = new ArrayList<>();
		characters.add("A");
		characters.add("B");
		characters.add("C");
		characters.add("D");
		characters.add("E");
		characters.add("F");
		characters.add("D");

		List<String> numbers = new ArrayList<>();
		numbers.add("1");
		numbers.add("2");
		numbers.add("3");

		replace(characters, "D", numbers);
		System.out.println("\n-----------------------------\n");
		new ListIteratorClass().replace(characters, "D", numbers);
		
	}

	public static <E> void replace(List<E> list, String val, List<? extends E> newVals) {
		for(int i = 0; i< list.size(); i++) {
			if(list.get(i).equals(val)) {
				list.remove(i);
				list.addAll(i, newVals);
			}
			System.out.print(list.get(i)+ " ");
		}
	}
}
