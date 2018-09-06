package dice.experiment;

public class ExperimentSearchValue {
	
	public int searchValue(int[] inputArray, int index) {
		int value = inputArray[0];
		for (int i = 0; i < inputArray.length; i++) {
			switch (index) {
			case 1:
				if (inputArray[i] < value) {
					value = inputArray[i];
				}
				break;
			case 2:
				if (inputArray[i] > value) {
					value = inputArray[i];
				}
				break;
			default:
				value = value + inputArray[i];
				break;
			}
		}
		return value;
	}
}
