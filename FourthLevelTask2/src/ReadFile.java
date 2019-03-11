import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	private String fileName;
	
	public ReadFile(String fileName) {
		this.fileName = fileName;
	}

	public void readFile() {
		String path = "res/" + fileName;
		try (BufferedReader in = new BufferedReader(new FileReader(path))) {
			while (in.ready()) {
				System.out.println(in.readLine());
			}
		} catch (IOException ie) {
			System.out.println("A file beolvasás sikertelen volt.");
			ie.printStackTrace();
		}
	}
}
