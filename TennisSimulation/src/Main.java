
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
		Game.letsPlay(playerOne, playerTwo, Player.losers, 1, 3, 1);
		Player.emptyPlayerlist();
		Player.twoPlayer(0,1);
		Player.fillPairArrays(Player.losersLosers, Player.losersLosers.length);
		System.out.println("\n---------------------Csata az 7-8 helyért.---------------------");
		Game.letsPlay(playerOne, playerTwo, Player.losersLosers, 0, 1, 4);
		Player.emptyPlayerlist();
		Player.twoPlayer(2,3);
		Player.fillPairArrays(Player.losersWinner, Player.losersWinner.length);
		System.out.println("\n---------------------Csata az 5-6 helyért.---------------------");
		Game.letsPlay(playerOne, playerTwo, Player.losersLosers, 1, 2, 4);
		Player.emptyPlayerlist();
		Player.randomPlayer(Player.indexOfFourPlayerWinners, Player.winners);
		System.out.println("\n---------------------Csata az 1-4 közötti helyekért.---------------------");
		Game.letsPlay(playerOne, playerTwo, Player.losersLosers, 2, 4, 2);
		Player.emptyPlayerlist();
		Player.twoPlayer(0,1);
		Player.fillPairArrays(Player.winnersLosers, Player.winnersLosers.length);
		System.out.println("\n---------------------Csata az 3-4 helyért.---------------------");
		Game.letsPlay(playerOne, playerTwo, Player.losersLosers, 0, 1, 4);
		Player.emptyPlayerlist();
		Player.twoPlayer(2,3);
		Player.fillPairArrays(Player.winnersWinners, Player.winnersWinners.length);
		System.out.println("\n---------------------Csata az 1-2 helyért.---------------------");
		Game.letsPlay(playerOne, playerTwo, Player.losersLosers, 1, 2, 4);
		Player.point();
		
		
		/*
		 * A printer osztályban visszakapcsolni a várakozást és a game osztályban is!
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
