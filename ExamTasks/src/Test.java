public class Test {

	private boolean cleanUpComplete;
	private int counter;
	private boolean prepared;

	private void cleanUp() {
		cleanUpComplete = true;
	}

	private void doIt() {
		executePreparationSteps();
		execute();
		cleanUp();
	}

	private void count(long bigNumber) {
		counter++;
	}

	private void execute() {
		if (!validate()) {
			System.out.println("Validációs hiba!");
			return;
		}
		doSomeRealWork();
		printResult();
	}

	private void executePreparationSteps() {  
		prepared = !prepared;
	}
	
	private void count(int bigNumber) {  
		counter += 3;
	} 
	
	private void printResult() {  
		System.out.println(counter);
	} 
	
	private boolean validate() {
		if (!prepared) {
			System.out.println("Nincs előkészítve a feldolgozáshoz."); 
			return false;
		}
		if (cleanUpComplete) { 
			System.out.println("Már feldolgozva."); 
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {   
		Test whatDoesItPrint = new Test(); 
		whatDoesItPrint.doIt(); 
	} 
	
	
	private void doSomeRealWork() {     
		for (int i = 100; i >= 72; i--) {   
			long bigNumber = 2; 
			count(bigNumber);
		} 
	} 
}