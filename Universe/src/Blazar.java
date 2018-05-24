
public class Blazar extends Quasar{

	private String type = "Blazár";
	private boolean radioBroadcasting = true;

	public boolean isRadioBroadcasting() {
		return radioBroadcasting;
	}

	@Override
	public String getType() {
		return type;
	}
	
	public Blazar () {
		this.setName(Name.randomName().getTextual());
	}
	
	@Override
	public String toString() {
		return getName() + " - " + getType() + ". \nA súlya: " + getWeight() + " millió kg. \nÁtmérője: " + getDiameter() + " millió km.\n" + (radioBroadcasting? "Erős rádiósugárzást bocsát ki." : "Meglepő módon nem bocsát ki rádiósugárzást.") + "\n";
	}
	
}
