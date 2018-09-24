import java.util.ArrayList;
import java.util.List;

public class Names {

	private List<String> names = new ArrayList<>();

	public List<String> getNames() {
		return names;
	}

	public void setNames(String name) {
		this.names.add(name);
	}

	public Names() {
	}
}
