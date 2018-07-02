package Calculator;

public interface Operation {

	/**
	 * Az interface nem példányosítható!
	 * @param a
	 * @param b
	 * @return
	 * 
	 * Nem hozhatunk létre Operation oper = new Operation();-t! 
	 */
	
	public abstract double calculate (double a, double b);
	
}
