package hu.ak_akademia.main;

import java.util.Scanner;

import hu.ak_akademia.person.Person;
import hu.ak_akademia.userinput.UserInput;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		UserInput ui = new UserInput();
		ui.getName(sc);
		sc.close();
	}

}
