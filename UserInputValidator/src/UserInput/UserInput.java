package UserInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {

	public List<String> getUserInput() {
		Scanner sc = new Scanner(System.in);
		List<String> results = new ArrayList<>();
		String result = "";
		do {
			System.out.print("Adjon meg egy vizsgálandó értéket (kilépés exit kulcsszóval): ");
			result = sc.nextLine();
			if(!result.equals("exit")){
				results.add(result);
			}
		} while (!result.equals("exit"));
		sc.close();
		return results;
	}

}
