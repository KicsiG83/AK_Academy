package Calculator;

public class Main {

	public static void main(String[] args) {
		new Main().run();
		
	}
	
	public void run() {
		Operation[] oper = new Operation[4];
		oper[0] = new Addition();
		oper[1] = new Substraction();
		oper[2] = new Multiplication();
		oper[3] = new Division();
	for(int i = 0; i < oper.length; i++) {
		System.out.println(oper[i].calculate(10, 0));
	}
	
	}

	
}
