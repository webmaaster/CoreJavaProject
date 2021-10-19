package roompack;

public class Room {

	int length; 
	int breadth;
	int height;
	int roomNo;
	String roomColor;
	
	// CPD = Copy paste detector
	// PMD = Program Mistake Detector
	
	public Room(int length, int breadth, int height){
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	public Room(int length, int breadth, int height, String roomColor){
		this(length, breadth, height); // has to be the first line
//		this.length = length;
//		this.breadth = breadth;
//		this.height = height;
		this.roomColor = roomColor;
	}
	
	public Room(int length, int breadth, int height, int roomNo, String roomColor){
		this(length, breadth, height, roomColor); // has to be the first line
//		this.length = length;
//		this.breadth = breadth;
//		this.height = height;
//		this.roomColor = roomColor;
		this.roomNo = roomNo;
	}
	
	public int calculateFloorArea() {
		int floorArea = length * breadth;
		return floorArea;
	}
	
//	int costOfPaintingWalls() {
//		int cost = (2 * length * height) + (2 * breadth * height) * 1;
//		return cost;
//	}
	
	public int costOfPaintingWalls(int rate) {
		int cost = (2 * length * height) + (2 * breadth * height) * rate;
		return cost;
	}
}
