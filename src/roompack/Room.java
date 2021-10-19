package roompack;

public class Room {

	private int length; 
	private int breadth;
	private int height;
	private int roomNo;
	private String roomColor;
	
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
	
	// getters and setters
	// accessorrand mutators
	
	public int getLength() {
		return length;
	}	
	
	public int getBreadth() {
		return breadth;
	}

	public int getHeight() {
		return height;
	}
	
	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		if(roomNo > 0) {
			this.roomNo = roomNo;
		}
	}

	public String getRoomColor() {
		return roomColor;
	}

	public void setRoomColor(String roomColor) {
		this.roomColor = roomColor;
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
