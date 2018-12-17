package hu.ak_akademia.sublist;

import java.util.ArrayList;
import java.util.List;

public class SubListDemo {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Artúr");
		names.add("Gergő");
		names.add("Andris");
		names.add("Andris");
		names.add("Petya");
		names.add("Béla");

		List<String> subList = names.subList(1, 3);

		System.out.println("Eredeti lista: " + names);
		System.out.println("Részlista    : " + subList);

		subList.add("Kati");

		System.out.println("Eredeti lista: " + names);
		System.out.println("Részlista    : " + subList);

		subList.remove("Gergő");

		System.out.println("Eredeti lista: " + names);
		System.out.println("Részlista    : " + subList);

		subList.clear();

		System.out.println("Eredeti lista: " + names);
		System.out.println("Részlista    : " + subList);

//		 eredeti lista módosítása esetén a részlista érvényét veszti
//		
//		 names.add("Karesz");
//		
//		 System.out.println("Eredeti lista: " + names);
//		 System.out.println("Részlista : " + subList); // <-- kivételt dob
	}

}