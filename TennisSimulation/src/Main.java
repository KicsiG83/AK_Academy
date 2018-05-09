import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Üdvözöljük olvasóinkat ezen a jeles Tenisz eseményen.\nAhogy az IP címekből látom összegyűlt a világ színe JAVA :)");
		System.out.println("");

		Random random = new Random();
		Player playerOne = new Player();
		Player playerTwo = new Player();

		playerOne.setName(new Name("Andre", "Agassi"));
		playerTwo.setName(new Name("Rafael", "Nadal"));
		int playerOnePoint = 0;
		int playerTwoPoint = 0;
		for(int i = 0; i < 3; i++) {
			do{
				int point = random.nextInt((2 - 1) + 1);
				if(point == 0) {
					playerOnePoint++;
				}else {
					playerTwoPoint++;
				}
			}while(playerOnePoint < 6 && playerTwoPoint < 6);
			System.out.println(playerOne.getName() + " - " + playerOnePoint + " vs. " + playerTwo.getName() + " - " + playerTwoPoint);
		}

		
		
		
		
		sc.close();
	}

}
