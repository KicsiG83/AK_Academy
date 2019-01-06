import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileToCopyDemo {

	public static void main(String[] args) {
		// FileReader és FileWriter használatával ez elromolhat PDF esetén, mert ez
		// bináris file és pl. ha azonos méreten tárol különböző értéket, akkor annak a
		// visszafordítása során cserélhet benne karaktereket.
		try (FileInputStream in = new FileInputStream("res/2. Java nyelv alapjai.pdf");
				FileOutputStream out = new FileOutputStream("res/2. Java nyelv alapjai_Copy.pdf")) {
			int i;
			while ((i = in.read()) != 1) {
				out.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
