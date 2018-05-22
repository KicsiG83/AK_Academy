
public class Blazar extends ComplexObject{

	private String type = "Blazár";
	private boolean radioBroadcasting = true;

	public boolean isRadioBroadcasting() {
		return radioBroadcasting;
	}

	@Override
	public String getType() {
		return type;
	}
	
	public void printBlazar (String inputName, String inputType, boolean radioBroadcasting) {
		String printName = inputName;
		String printType = inputType;
		boolean printRadioBroadcasting = radioBroadcasting;
		System.out.println("\n" + printName + " - " + printType + "\n" + (printRadioBroadcasting? "Erős rádiósugárzást bocsát ki." : " nem bocsát ki rádiósugárzást.") );
	}
	
}
