package ford;

public class FordFigoTitanium extends FordFigo{
	
	public FordFigoTitanium(String color, int chasisNo) {
		super(color, chasisNo);
		//this.color = color;
		//this.chasisNo = chasisNo;
	}
	
	public FordFigoTitanium(int numberPlate, String color, int chasisNo) {
		super(numberPlate, color, chasisNo); // we make a call to the super class constructor
//		this.numberPlate = numberPlate;
//		this.color = color;
//		this.chasisNo = chasisNo;
	}
	
	// method overriding
	@Override
	public void brakingSystem() {
		System.out.println("car abs brake applied...");
	}
	
	public void airbags() {
		System.out.println("cars airbags!!");
	}
	
}
