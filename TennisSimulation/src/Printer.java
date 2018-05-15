import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Printer {

	/**
	 * Üdvözlő üzenet
	 * @throws InterruptedException 
	 */
	public static void welcome() throws InterruptedException {
		System.out.println("Üdvözöljük olvasóinkat ezen a jeles Tenisz eseményen, innen "
				+ Tournaments.randomLocation().getTextual()
				+ "\nAhogy az IP címekből látom összegyűlt a világ színe JAVA.\n");
		getInput();
		System.out.println("\nÚgy látom a játékosok csak erre vártak, és a mérkőzés máris kezdetét veszi.");
		TimeUnit.SECONDS.sleep(5);
	}

	/**
	 * Adománybekérés a Titokzatos X-től.
	 */
	private static void getInput()  {
		Scanner sc = new Scanner(System.in);
		int totalRemuneration = 0;
		System.out.println(
				"Mielőtt elkezdenénk a mérkőzést, szeretném körünkben üdövözölni azt a névtelen adományozót, aki a játék összdíjazázását egyedül fogja fedezni.");
		do {
			try {
				System.out.print("Kedves X kérem árulja el az olvasóinknak, hogy mennyi lesz a díjazás: ");
				totalRemuneration = sc.nextInt();
				sc.nextLine();
				if(totalRemuneration <= 0) {
					System.out.println("Attól tartok valami rendszerhiba van a kapcsolatban, de a szakértőink már dolgoznak a problémán.\n");
				}
			} catch (Exception e) {
				sc.nextLine();
				System.out.println(
						"Attól tartok valami rendszerhiba van a kapcsolatban, de a szakértőink már dolgoznak a problémán.\n");
			}
		} while (totalRemuneration <= 0);
		System.out.println("Tisztelt Hölgyeim és Uraim! Önök hisznek a szemüknek? A felajánlás teljes összege: "
				+ totalRemuneration + " Birodalmi váltó!");
		sc.close();
	}

	/**
	 * Kiírja a játékosok nevét a meccs elején.
	 * 
	 * @param playerOne
	 * @param playerTwo
	 */
	public static void players(Player playerOne, Player playerTwo, String array[]) {
		String[] gameArray = array;
		System.out.println("\n" + gameArray[0] + " és " + gameArray[1] + " összecsapásának lehetünk szemtanúi.");
	}

	/**
	 * Kiírja a meccs nyertesének a nevét és a pontszámokat
	 * 
	 * @param playerOne
	 * @param playerTwo
	 * @param playerOneSet
	 * @param playerTwoSet
	 */
	public static void printWinner(Player playerOne, Player playerTwo, int playerOneSet, int playerTwoSet,
			String array[], int index, int min, int max) {
		String[] gameArray = array;
		if (playerOneSet > playerTwoSet) {
			System.out.println("\n" + gameArray[0] + " nyerte a meccset " + playerOneSet + " : " + playerTwoSet);
			Player.winners[index] = gameArray[0];
			Player.losers[index] = gameArray[1];
			Player.point.put(gameArray[0], max);
			Player.point.put(gameArray[1], min);
		} else {
			System.out.println("\n" + gameArray[1] + " nyerte a meccset " + playerTwoSet + " : " + playerOneSet);
			Player.winners[index] = gameArray[1];
			Player.losers[index] = gameArray[0];
			Player.point.put(gameArray[1], max);
			Player.point.put(gameArray[0], min);
		}
	}
}
