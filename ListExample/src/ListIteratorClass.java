import java.util.List;
import java.util.ListIterator;

public class ListIteratorClass {

	public static <E> void replace(List<E> list, String val, List<? extends E> newVals) {
		for(ListIterator<E> it = list.listIterator(); it.hasNext();) {
			E element = it.next();
			if(element.equals(val)) {
				it.remove();
				for (E newval : newVals) {
					it.add(newval);
				}
			}
			System.out.print(element + " ");
		}
	}	
}
