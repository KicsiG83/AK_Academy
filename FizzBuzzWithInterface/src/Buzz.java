
public class Buzz implements Operation {

	@Override
	public boolean check(int number) {
		return number % 5 == 0;
	}

	@Override
	public String process() {
		return " buzz";
	}
}
