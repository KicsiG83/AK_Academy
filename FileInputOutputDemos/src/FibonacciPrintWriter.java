import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringJoiner;

public class FibonacciPrintWriter {

	private static long a = 0;
	private static long b = 1;
	private static long temp;

	public static void main(String[] args) {
		try (PrintWriter out = new PrintWriter(new FileWriter("res/output.txt"))) {
			StringJoiner sj = new StringJoiner(", ");
			for (int i = 0; i < 50; i++) {
				temp = a + b;
				if (i == 0) {
					sj.add(Long.toString(a));
				} else if (i == 1) {
					sj.add(Long.toString(b));
				} else {
					if (i % 5 == 0) {
						sj.add("\n" + temp);
					} else {
						sj.add(Long.toString(temp));
					}
					a = b;
					b = temp;
				}
			}
			out.println(sj);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
