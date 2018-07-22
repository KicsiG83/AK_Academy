package hu.ak_akademia.postmodernwashingmachine;

public enum WashingMachineStatus {
	TURNON("Bekapcsolva"), TURNOFF("Kikapcsolva"),INPROGRESS("Mosási funkció folyamatban.");
	
	private String textual;

	private WashingMachineStatus(String text) {
		textual = text;
	}
	
	public String getTextual() {
		return textual;
	}
}
