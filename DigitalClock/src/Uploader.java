
public class Uploader implements UploaderInterface {

	private String[][] strArray;
	private String[] dummy = new String[6];

	public void setStrArray(int max) {
		this.strArray = new String[6][max];
	}


	public String[][] getStrArray() {
		return strArray;
	}

	private void uploadSeparator(int number) {
		dummy = new Numbers().colon;
		for (int i = 0; i < dummy.length; i++) {
			strArray[i][number] = dummy[i];
		}
	}

	private void uploadStrArray(int index, String[] dummy) {
		for (int j = 0; j < dummy.length; j++) {
			this.strArray[j][index] = dummy[j];
		}
	}
	@Override
	public void uploadTime(int number, int startIndex, String[] dummy, String[][] strArray) {
		int loopMaxIndex = 2;
		Numbers nr = new Numbers();
		String strNumber = Integer.toString(number);
		if (strNumber.length() == 1) {
			dummy = nr.zero;
			uploadStrArray(startIndex, dummy);
			startIndex++;
			loopMaxIndex = 1;
		}
		for (int j = 0; j < loopMaxIndex; j++) {
			switch (Character.toString(strNumber.charAt(j))) {
			case "0":
				dummy = nr.zero;
				break;
			case "1":
				dummy = nr.one;
				break;
			case "2":
				dummy = nr.two;
				break;
			case "3":
				dummy = nr.three;
				break;
			case "4":
				dummy = nr.four;
				break;
			case "5":
				dummy = nr.five;
				break;
			case "6":
				dummy = nr.six;
				break;
			case "7":
				dummy = nr.seven;
				break;
			case "8":
				dummy = nr.eight;
				break;
			case "9":
				dummy = nr.nine;
				break;
			}
			uploadStrArray(startIndex, dummy);
			startIndex++;
		}
		loopMaxIndex = 2;
	}

	@Override
	public void uploadCharachters(int menuIndex) throws InterruptedException {
		ExactTime et = new ExactTime();
		switch (menuIndex) {
		case 1:
			exactTimeUploadStructure(et);
			break;
		case 2:
			stopperUploadStructureAndPrint(menuIndex);
			break;
		case 3:
			
			break;
		}
	}


	private void stopperUploadStructureAndPrint(int menuIndex) throws InterruptedException {
		int max = 59;
		for (int i = 0; i < 3; i++) {
			if (i == 2) {
				max = 45;
			}
			for (int j = 0; j <= max; j++) {
				if (j == 0) {
					uploadTime(i, 0, dummy, strArray);
					uploadSeparator(2);
					uploadTime(j, 3, dummy, strArray);
				} else {
					if ((int) Math.log10(j) + 1 == 1) {
						uploadTime(i, 0, dummy, strArray);
						uploadSeparator(2);
						uploadTime(j, 3, dummy, strArray);
					} else {
						uploadTime(i, 0, dummy, strArray);
						uploadSeparator(2);
						uploadTime(j, 3, dummy, strArray);
					}
				}
				printAsciiNumber(strArray, menuIndex);
				Thread.sleep(1000L);
			}
		}
	}


	private void exactTimeUploadStructure(ExactTime et) {
		for (int i = 0; i < 5; i++) {
			switch (i) {
			case 0:
				uploadTime(et.getHour(), 0, dummy, strArray);
				break;
			case 1:
				uploadSeparator(2);
				break;
			case 2:
				uploadTime(et.getMinute(), 3, dummy, strArray);
				break;
			case 3:
				uploadSeparator(5);
				break;
			case 4:
				uploadTime(et.getSecond(), 6, dummy, strArray);
				break;
			}
		}
	}

	public void counterTimeUploadStructure(int number) {
		for (int i = 0; i < 5; i++) {
			switch (i) {
			case 0:
				uploadTime(number, 0, dummy, strArray);
				break;
			case 1:
				uploadSeparator(2);
				break;
			case 2:
				uploadTime(number, 3, dummy, strArray);
				break;
			case 3:
				uploadSeparator(5);
				break;
			case 4:
				uploadTime(number, 6, dummy, strArray);
				break;
			}
		}
	}
	
	public void printAsciiNumber(String[][] strArray, int menuIndex) {
		int startPrint = 0;
		if(menuIndex == 2) {
			startPrint = 1;
		}
		for (int i = 0; i < strArray.length; i++) {
			for (int j = startPrint; j < strArray[0].length; j++) {
				System.out.print(strArray[i][j]);
			}
			System.out.println();
		}
	}
	
	public void counterPrinter(Counter ct) throws InterruptedException {
		for(int i = ct.getHour(); i >= 0; i--) {
			for(int j = ct.getMinute(); j >= 0; j--) {
				for(int k = ct.getSecond(); k >= 0; k--) {
					counterTimeUploadStructure(i);
					counterTimeUploadStructure(j);
					counterTimeUploadStructure(k);
				}
			}
		}
		printAsciiNumber(strArray, 1);
		Thread.sleep(1000L);
	}
	
}
