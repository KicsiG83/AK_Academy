
public abstract class Ancient {
	
	private  double x;
	private  double a;
	private  double denominator;
	
	public double getX() {
		return x;
	}

	public void setX(double x) {this.x = x;}

	public double getA() {return a;}

	public void setA(double a) {this.a = a;	}

	public double getDenominator() {return denominator;}

	public void setDenominator(double denominator) {this.denominator = denominator;}

	public  void printSeparator (String separator) {System.out.println(separator);}

	public void calculate(int number) {}
	
}
