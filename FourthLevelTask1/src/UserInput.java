import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {

	private List<Double> myList = new ArrayList<>();

	public UserInput() {
	}

	public List<Double> getInput(){
		Scanner sc = new Scanner(System.in);
		int i = 1;
		do {
			System.out.print("Kérem adja meg a(z) " + i + " számot: ");
			try {
				double result = sc.nextDouble();
				sc.nextLine();
				myList.add(result);
				i++;
			}catch (Exception e) {
				sc.nextLine();
				System.out.println("A megadott paraméter nem jó, kérem próbálja újra!");
			}
		}while(myList.size()<10);
		sc.close();
		return myList;
	}
	
}
