import java.util.Calendar;
import java.util.Random;

public class DwarfPlanet extends SolarSystem{

	static Random rn = new Random();
	private static String type = "Törpebolygó";
	private static int min = 2006;
	private static int max = Calendar.getInstance().get(Calendar.YEAR);

	@Override
	public String getType() {
		return type;
	}

	public static int getMin() {
		return min;
	}

	public static  int getMax() {
		return max;
	}

	public static int getYearOfDiscovery(int min, int max){
	    return rn.ints(min,(max+1)).findFirst().getAsInt();
	}
	
	@Override
	public String toString() {
		return "\n" + getName() + " - " + getType() + ". \nA súlya: " + getWeight() + " millió kg. \n"
				+ "Felfedezésének éve: " + getYearOfDiscovery(getMin(), getMax()) + "\n";
	}

}
