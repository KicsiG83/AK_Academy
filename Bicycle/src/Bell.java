
public class Bell {
	
	public Bell() {
		
	}

	//TODO ezt a metódust újra gondolni, miután bell.ring(bell) a meghívás menete .... 
	public void ring(Bell bell) {
		System.out.println(bell.toString());
	}
	
	@Override
	public String toString() {
		return "Csing Ling!";
	}
	
}
