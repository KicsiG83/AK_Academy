
public enum Ships {
	CARRIER("Carrier", 5), BATTLESHIP("Battleship", 4), CRUISER("Crusier", 3), SUBMARINE("Submarine",
			3), DESTROYER("Destroyer", 2);
	private String name;
	private int size;

	private Ships(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}
}
