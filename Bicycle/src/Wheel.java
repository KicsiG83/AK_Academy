
public class Wheel {

	private int max = 7;
	private int pressure;
	private boolean slime;

	public boolean isSlime() {
		return slime;
	}

	public Wheel(String name) {
		fillSlime(true);
		
	}

	public void puffUp() {
		Validator validator = new Validator();
		boolean valid = validator.getMaxPressure(pressure, max);
		while (!valid) {
			pressure++;
			valid = validator.getMaxPressure(pressure, max);
		}
	}

	public void fillSlime(boolean filled) {
		this.slime = filled;
	}

	@Override
	public String toString() {
		if (pressure == 7) {
			if (slime) {
				return "A kerék felfújva " + max + " bar nyomásra és feltöltve defektgátló folyadékkal!";
			} else {
				return "A kerék felfújva " + max + " bar nyomásra és nincs feltöltve defektgátló folyadékkal!";
			}
		} else {
			if (slime) {
				return "A kerék lapos és fel van töltve defektgátló folyadékkal!";
			} else {
				return "A kerék lapos és nincs feltöltve defektgátló folyadékkal!";
			}
		}
	}
}
