
public class Main {

	public static void main(String[] args) throws InterruptedException {

		Player playerOne = new Player();
		Player playerTwo = new Player();
		Printer.welcome();
		String[] playerArray = createFirstArray();
		Player.randomPlayer(Player.indexOfArray, playerArray);
		Player.fillPairArrays(playerArray, playerArray.length);
		Player.print();
		Game.letsPlay(playerOne, playerTwo, playerArray, 4, 8);
		Player.printWinnerAndLoser(1);
		Player.emptyPlayerlist();
		Player.randomPlayer(Player.indexOfLoserArray, Player.losers);
		Player.fillPairArrays(Player.losers, Player.losers.length);
		System.out.println("\n---------------------Csata az 5-8 közötti helyekért.---------------------");
		Game.letsPlay(playerOne, playerTwo, Player.losers, 1, 3);
		Player.point();
		
	}

	private static String[] createFirstArray() {
		String[] playerArray = new String[8];
		for(int i = 0; i < playerArray.length; i++) {
			playerArray[i] = Player.getName(i);
		}
		return playerArray;
	}
}
