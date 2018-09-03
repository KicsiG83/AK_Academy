import java.util.ArrayList;
import java.util.List;

public class StatisticsForSix {

	//TODO Ezt az osztályt újra kell gondolni!!! 
	
	private int six;
	private int counter = 0;
	private List<Integer> statList = new ArrayList<>();

	public int getSix() {
		return six;
	}

	public void setSix(int six) {
		this.six = six;
	}

	public void diceForSix() {
		Dice dice = new Dice();
		boolean finish = false;
		do {
			statList.add(dice.cast());
			if (statList.get(counter) == 6) {
				checkSix(counter);
			}
			counter++;
		} while (!finish);
		System.out.println("Össz dobások száma: " + counter);
	}

	private boolean checkSix(int index) {
		six = 1;
		int end = statList.size();
		if (end > 5) {
			end = 5;
		}
		boolean valid = false;
		for (int i = 1; i < end; i++) {
			int temp = index - i;
			if (statList.get(temp) == 6) {
				six++;
			} else {
				if (six == 1) {
					valid = true;
				} else {
					six = 0;
					break;
				}
			}
		}
		return valid;
	}
}
