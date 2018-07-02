import java.time.LocalTime;

public class ExactTime {

	private LocalTime now = LocalTime.now();
	private int hour;
	private int minute;
	private int second;

	public ExactTime() {
		setHour();
		setMinute();
		setSecond();
	}

	public int getHour() {
		return hour;
	}

	public void setHour() {
		this.hour = now.getHour();
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute() {
		this.minute = now.getMinute();
		;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond() {
		this.second = now.getSecond();
	}
}
