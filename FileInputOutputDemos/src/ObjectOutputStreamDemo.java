import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {

	public static void main(String[] args) {
		new ObjectOutputStreamDemo().run();
	}

	private void run() {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("res/objects.bin"));
				ObjectInputStream in = new ObjectInputStream(new FileInputStream("res/objects.bin"))) {
			out.writeObject(new Person(45, "Géza"));
			out.writeObject(new Person(55, "Aladár"));
			out.writeObject(new Person(35, "Jocó"));

			for (int i = 0; i < 3; i++) {
				Person temp = (Person) in.readObject();
				System.out.println(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
