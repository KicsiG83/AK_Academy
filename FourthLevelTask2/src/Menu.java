
public class Menu {

	String inputFileName;
	String outputFileName;

	public String getInputFileName() {
		return inputFileName;
	}

	public void setInputFileName(String inputFileName) {
		this.inputFileName = inputFileName;
	}

	public String getOutputFileName() {
		return outputFileName;
	}

	public void setOutputFileName(String outputFileName) {
		this.outputFileName = outputFileName;
	}

	public void printMenu() {
		System.out.println("------------------------");
		if (inputFileName == null) {
			System.out.println("1 - Forrás file kiválasztása: (jelenleg: <forrás file név>)");
		} else {
			System.out.println("1 - Forrás file kiválasztása: (jelenleg: <" + inputFileName + ">)");
		}
		if (outputFileName == null) {
			System.out.println("2 - Cél file kiválasztása: (jelenleg: <cél file név>)");
		} else {
			System.out.println("2 - Cél file kiválasztása: (jelenleg: <" + outputFileName + ">)");
		}
		System.out.println("3 - Szöveges file-ok összehasonlítása");
		System.out.println("4 - Kilépés");
		System.out.println("------------------------");
	}

}
