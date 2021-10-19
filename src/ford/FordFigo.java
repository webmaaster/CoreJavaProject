package ford;

public class FordFigo {

	int numberPlate;
	String color;
	int chasisNo;
	
	public FordFigo(String color, int chasisNo) {
		this.color = color;
		this.chasisNo = chasisNo;
	}

	public FordFigo(int numberPlate, String color, int chasisNo) {
		this(color, chasisNo);
		this.numberPlate = numberPlate;
//		this.color = color;
//		this.chasisNo = chasisNo;
	}
	
	public void switchOn() {
		System.out.println("car switched on...");
	}
	
	public void switchOff() {
		System.out.println("car switched off...");
	}
	
	public void unlock() {
		System.out.println("car unlocked...");
	}
	
	public void lock() {
		System.out.println("car locked...");
	}
	
	public void brakingSystem() {
		System.out.println("car manual brake applied...");
	}
}
