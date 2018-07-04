package hu.ak_akademia.postmodernwashingmachine;

public class Dress implements Washable {

	private int dirty;
	private int color;
	private int name;
	private int durability;
	private int wet;
	private boolean whiteDresses;
	private boolean colorDresses;
	private boolean ironed;
	private boolean torn;

	public Dress() {

	}

	public boolean isWhiteDresses() {
		return whiteDresses;
	}

	public void setWhiteDresses(boolean whiteDresses) {
		this.whiteDresses = whiteDresses;
	}

	public boolean isColorDresses() {
		return colorDresses;
	}

	public void setColorDresses(boolean colorDresses) {
		this.colorDresses = colorDresses;
	}

	public int getDirty() {
		return dirty;
	}

	public void setDirty(int dirty) {
		this.dirty = dirty;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}

	public int getWet() {
		return wet;
	}

	public void setWet(int wet) {
		this.wet = wet;
	}

	public boolean isIroned() {
		return ironed;
	}

	public void setIroned(boolean ironed) {
		this.ironed = ironed;
	}

	public boolean isTorn() {
		return torn;
	}

	public void setTorn(boolean torn) {
		this.torn = torn;
	}

	@Override
	public void clean(Dress d) {
		d.setDirty(getDirty() - 1);
		d.setDurability(getDurability() - 1);
		while (getWet() <= 100) {
			d.setWet(getWet() + 1);
		}
	}

	@Override
	public void dry(Dress d) {
		while(getWet() == 0) {
			d.setWet(getWet() - 1);
		}
	}

	@Override
	public void iron(Dress d) {

	}

}
