
public class Fizz implements Operation {

	@Override
	public boolean check(int number) {
		return number % 3 == 0;
	}

	@Override
	public String process() {
		return " fizz";
	}
}
