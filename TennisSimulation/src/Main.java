
public class Main {

	public static void main(String[] args) throws InterruptedException {

		Player playerOne = new Player();
		Player playerTwo = new Player();
		Printer.welcome();
		String[] playerArray = createFirstArray();
		Player.randomPlayer(Player.indexOfEightPlayerArray, playerArray);
		Player.fillPairArrays(playerArray, playerArray.length);
		Player.print();
		Game.letsPlay(playerOne, playerTwo, playerArray, 4, 8, 0);
		Player.printWinnerAndLoser(1);
		Player.emptyPlayerlist();
		Player.randomPlayer(Player.indexOfFourPlayerLosers, Player.losers);
		Player.fillPairArrays(Player.losers, Player.losers.length);
		System.out.println("\n---------------------Csata az 5-8 közötti helyekért.---------------------");
		Game.setArrayIndex(0);
		Game.letsPlay(playerOne, playerTwo, Player.losers, 1, 3, 1);
		Player.emptyPlayerlist();
		Player.twoPlayer(0,1);
		Player.fillPairArrays(Player.losersLosers, Player.losersLosers.length);
		Game.setArrayIndex(0);
		System.out.println("\n---------------------Csata a 7-8 helyért.---------------------");
		Game.letsPlay(playerOne, playerTwo, Player.losersLosers, 0, 1, 4);
		Player.emptyPlayerlist();
		Player.twoPlayer(2,3);
		Player.fillPairArrays(Player.losersWinner, Player.losersWinner.length);
		Game.setArrayIndex(0);
		System.out.println("\n---------------------Csata az 5-6 helyért.---------------------");
		Game.letsPlay(playerOne, playerTwo, Player.losersLosers, 1, 2, 4);
		Player.emptyPlayerlist();
		Player.fillPairArrays(Player.winners, Player.winners.length);
		Game.setArrayIndex(0);
		System.out.println("\n---------------------Csata az 1-4 közötti helyekért.---------------------");
		Game.letsPlay(playerOne, playerTwo, Player.winners, 2, 4, 2);
		Player.emptyPlayerlist();
		Player.twoPlayer(0,1);
		Player.fillPairArrays(Player.winnersLosers, Player.winnersLosers.length);
		Game.setArrayIndex(0);
		System.out.println("\n---------------------Csata a 3-4 helyért.---------------------");
		Game.letsPlay(playerOne, playerTwo, Player.winnersLosers, 0, 1, 4);
		Player.emptyPlayerlist();
		Player.twoPlayer(2,3);
		Player.fillPairArrays(Player.winnersWinners, Player.winnersWinners.length);
		Game.setArrayIndex(0);
		System.out.println("\n---------------------Csata az 1-2 helyért.---------------------");
		Game.letsPlay(playerOne, playerTwo, Player.winnersWinners, 1, 2, 4);
		Player.point();
		Printer.calculateRemuneration(Printer.getTotalRemuneration());
		/*
		 * A printer és a game osztályban visszakapcsolni a várakozást!
		 */
	}

	private static String[] createFirstArray() {
		String[] playerArray = new String[8];
		for(int i = 0; i < playerArray.length; i++) {
			playerArray[i] = Player.getName(i);
		}
		return playerArray;
	}
}
