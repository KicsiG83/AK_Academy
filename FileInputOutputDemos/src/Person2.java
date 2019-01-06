import java.io.Serializable;

public class Person2 implements Serializable {

	private static final long serialVersionUID = 1L;
	private transient int age;
	private String name;

	public Person2(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + " - age=" + age + "]";
	}
}
