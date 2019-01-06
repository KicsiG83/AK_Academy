import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemoWithTransient {

	public static void main(String[] args) {

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("res/objects.bin"));
				ObjectInputStream in = new ObjectInputStream(new FileInputStream("res/objects.bin"))) {
			out.writeObject(new Person2(45, "Géza"));
			out.writeObject(new Person2(55, "Aladár"));
			out.writeObject(new Person2(35, "Jocó"));

			for (int i = 0; i < 3; i++) {
				Person2 temp = (Person2) in.readObject();
				System.out.println(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
