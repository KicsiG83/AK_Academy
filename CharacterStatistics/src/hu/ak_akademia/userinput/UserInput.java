package hu.ak_akademia.userinput;

import java.util.Scanner;

public class UserInput {

	public String getUserInput(Scanner sc) {
		String userInput = "";
		do {
			System.out.print("Kérem adjon meg egy szöveget: ");
			userInput = sc.nextLine();
			if(userInput.length()<1) {
				System.out.println("A megadott adat érvénytelen.");
			}
		}while(userInput.length()<1);
		return userInput;
	}
	
}
