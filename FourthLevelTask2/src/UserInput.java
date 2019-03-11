import java.util.Scanner;

public class UserInput {

	public void getInput() {
		Scanner sc = new Scanner(System.in);
		int result;
		Menu myMenu = new Menu();
		do {
			myMenu.printMenu();
			System.out.print("válasszon a menüpontokból: ");
			result = sc.nextInt();
			sc.nextLine();
			switch (result) {
			case 1:
				System.out.print("Adja meg a file nevét: ");
				String firstFileName = sc.nextLine();
				ReadFile firstFileReader = new ReadFile(firstFileName);
				firstFileReader.readFile();
				myMenu.setInputFileName(firstFileName);
				break;
			case 2:
				System.out.print("Adja meg a file nevét: ");
				String secondFileName = sc.nextLine();
				ReadFile secondFileReader = new ReadFile(secondFileName);
				secondFileReader.readFile();
				myMenu.setOutputFileName(secondFileName);
				break;
			case 3:
				break;
			default:
				break;
			}
		} while (result != 4);
		sc.close();
		System.out.println("Viszlát");
	}

}
