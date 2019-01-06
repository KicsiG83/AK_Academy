import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(new FileReader("res/input.txt"))) {
			while (in.ready()) {
				System.out.println(in.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
