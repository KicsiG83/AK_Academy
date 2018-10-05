package hu.ak_akademia.userinput;

import java.util.Scanner;

import hu.ak_akademia.person.Person;

public class UserInput {

	public void getName(Scanner sc) {
		System.out.println("A nevek rögzítésekor a vezeték és keresztneveket vesszővel válassza el, amennyiben bevitte az összes nevet, nyomjon egy entert.");
		String result = "";
		do {
			System.out.print("Kérem adja meg a rögzítendő neveket: ");
			result = sc.nextLine();
			if(validator(result)) {
				Person p = new Person();
				String[] names = result.split(", ");
				p.setFirstName(names[0]);
				p.setFirstName(names[1]);
			}else {
				System.out.println("A megadott adat érvénytelen.");
			}
		}while(result.length() > 0);
	}
	
	private boolean validator(String name) {
		return name.matches("^([\\D]+([,]{1})[\\D]+)$");
	}
	
}
