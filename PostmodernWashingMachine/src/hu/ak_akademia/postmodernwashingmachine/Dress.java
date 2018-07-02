package hu.ak_akademia.postmodernwashingmachine;

public class Dress implements Washable {

	private int dirty;
	private int color;
	private int name;
	private int durability;
	private int wet;
	
	/**
	 * A ruha ki van vasalva
	 */
	private boolean ironed;

	/**
	 * A ruha szakadt
	 */
	private boolean torn;
	
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
	public void clean(PostModernWashingMachine pmm) {
		pmm.check();
	}

	@Override
	public void dry() {

	}

	@Override
	public void iron() {

	}

}
