import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyDemo {

	public static void main(String[] args) {
		try (FileReader in = new FileReader("res/copy-from.txt"); FileWriter out = new FileWriter("res/copy-to.txt")) {
			while (in.ready()) {
				out.write(in.read());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
