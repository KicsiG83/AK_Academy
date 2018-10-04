package hu.ak_akademia.printreversedword;

import java.util.Scanner;

public class GetInput {

	public String getInput() {
		String result= "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Kérem adjon megy egy szót: ");
			result = sc.nextLine();
			if(result.length()== 0) {
				System.out.println("A megadott szó túl rövid.");
			}
		}while(result.length()<1);
		sc.close();
		return result;
	}
	
}
