
public class TrafficLight {

	private Color color;
	boolean free;

	{
		setColor(Color.S);
		setFree(false);
	}

	public TrafficLight() {

	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean isFree() {
		return (getColor().equals(Color.Z)) ? true : false;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public void transition() {
		switch (getColor()) {
		case S:
			setColor(Color.P);
			break;
		case P:
			setColor(Color.PS);
			break;
		case Z:
			setColor(Color.S);
			break;
		default:
			setColor(Color.Z);
			break;
		}
	}

	@Override
	public String toString() {
		return getColor().getTextual();
	}
}
