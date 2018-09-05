
public class Bicycle {

	private Wheel[] wheel = new Wheel[2];
	private Bell bell;
	private Chain chain;
	private Computer computer;
	private Frame frame;
	private Lamp lamp;
	private Pedal pedal;
	private Saddle saddle;
	private SteeringWheel steeringWheel;
	private Brake brake;
	private int speed;
	private Gear gear;
	private int distance;

	public Bicycle() {
		this.wheel[0] = new Wheel("front");
		this.wheel[1] = new Wheel("back");
		this.bell = new Bell(); 
		this.chain = new Chain();
		this.computer = new Computer();
		this.frame = new Frame();
		this.lamp = new Lamp();
		this.pedal = new Pedal(); //
		this.saddle = new Saddle(); //
		this.steeringWheel = new SteeringWheel();//
		this.brake = new Brake(); //
	}

	public Brake getBrake() {
		return brake;
	}

	public void setBrake(Brake brake) {
		this.brake = brake;
	}

	public Wheel[] getWheel() {
		return wheel;
	}

	public void setWheel(Wheel[] wheel) {
		this.wheel = wheel;
	}

	public Bell getBell() {
		return bell;
	}

	public void setBell(Bell bell) {
		this.bell = bell;
	}

	public Chain getChain() {
		return chain;
	}

	public void setChain(Chain chain) {
		this.chain = chain;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public Frame getFrame() {
		return frame;
	}

	public void setFrame(Frame frame) {
		this.frame = frame;
	}

	public Lamp getLamp() {
		return lamp;
	}

	public void setLamp(Lamp lamp) {
		this.lamp = lamp;
	}

	public Pedal getPedal() {
		return pedal;
	}

	public void setPedal(Pedal pedal) {
		this.pedal = pedal;
	}

	public Saddle getSaddle() {
		return saddle;
	}

	public void setSaddle(Saddle saddle) {
		this.saddle = saddle;
	}

	public SteeringWheel getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(SteeringWheel steeringWheel) {
		this.steeringWheel = steeringWheel;
	}
}
