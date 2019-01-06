import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileWriterDemo {

	public static void main(String[] args) throws IOException {

		try (DataOutputStream out = new DataOutputStream(new FileOutputStream("res/myBinaryFile.bin"));
				DataInputStream in = new DataInputStream(new FileInputStream("res/myBinaryFile.bin"))) {
			// Ha write(100)-at adok meg, akkor a file mérete 404bit lesz, ha csak egy
			// byte-ot adok hozzá, akkor 401
			out.writeByte(100);
			for (int i = 1; i <= 100; i++) {
				out.writeInt(i);
			}
			// Ha ez elmarad, akkor a readInt elcsúszik és téves számokat ad vissza!!!
			in.readByte();
			for (int i = 1; i <= 100; i++) {
				System.out.println(in.readInt());
			}
		}
	}
}
