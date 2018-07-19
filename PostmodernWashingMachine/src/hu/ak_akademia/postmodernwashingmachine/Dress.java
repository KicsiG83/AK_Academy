package hu.ak_akademia.postmodernwashingmachine;

import hu.ak_akademia.helper.Generate;

public class Dress implements Washable {

	/*
	 *A ruhák tartsák magukról nyilván, 
	 *		hogy ki vannak-e épp vasalva!
	 *A ruhák tartsák magukról nyilván, 
	 *		hogy szakadtak-e!
	 *A ruhák tartsák magukról nyilván, 
	 *		hogy mennyire vizesek! 
	 *			Ez egy pozitív egész szám, ami 0 és 100 közötti. 0 jelenti a teljesen záraz, a 100 a teljesen vizes állapotot.
	 *
	 *A ruha osztályoknak override-old a toString-jét!
	 */
	
	private int dirty;
	private String name;
	private String color;
	private int durability;
	private int wet;
	private boolean whiteDresses;
	private boolean colorDresses;
	private boolean ironed;
	private boolean torn;
	private static int i = 1;
	private Generate g = new Generate();
	
	public Dress(String message) {
		setName(message+ "_" + i);
		setDirty(g.generateDirty());
		setColor(g.randomColor());
		setDurability(100);
		setWet(0);
		i++;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
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
	
	public String toString() {
		return "Név: " + getName() + " Koszosság: " + getDirty() +  " Szín: " + getColor() + " Tartósság: " + getDurability() + " Vizesség: " + getWet() + " Vasalt? " + isIroned() + " Szakadt? " + isTorn(); 
	}

}
