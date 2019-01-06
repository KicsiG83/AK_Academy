import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	
	private static String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

	public static void main(String[] args) {

		try (PrintWriter out = new PrintWriter(new FileWriter("res/printWriterDemoOutput.txt"))) {
			for (int i = 0; i < 52; i++) {
				out.println(letters);
				letters = letters.substring(1, 52) + letters.substring(0, 1);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
