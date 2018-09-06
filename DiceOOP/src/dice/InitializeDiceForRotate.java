package dice;

public class InitializeDiceForRotate {

	public void initDice(Dice dice) {
		System.out.println("\nKocka pörgetéséhez dobás folyamatban ... ");
		new WaitProcess().waiting();
		int number = dice.cast();
		dice.setFaceTop(number);
		dice.setFaceBottom(new OppositeSide().getOppositeSide(number));
		System.out.println("A dobás után a kocka tetején " + dice.getFaceTop() + " az alján pedig "
				+ dice.getFaceBottom() + " pötty található.\nPörgetés folyamatban ...");
		dice.setDiceSides(0, dice.getFaceTop());
		dice.setDiceSides(1, dice.getFaceBottom());
		new WaitProcess().waiting();
	}

}
