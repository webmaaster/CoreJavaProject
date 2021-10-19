package roompack;
public class RoomDemo {

	public static void main(String[] args) {
		
		//int marks = 25;
		int marks;
		marks = 25;
		
		//Room r1;
		//r1 = new Room();
		
		Room r1 = new Room(200, 100, 150);
		
//		r1.length = 200;
//		r1.breadth = 100;
//		r1.height = 150;
		
		System.out.println("Area of room r1 : " + r1.calculateFloorArea());
		System.out.println("Cost of painting the walls of romm r1 : " + r1.costOfPaintingWalls(2));
		
		Room r2 = new Room(500, 300, 150);
		
//		r2.length = 500;
//		r2.breadth = 300;
//		r2.height = 150;
		
		System.out.println("Area of room r2 : " + r2.calculateFloorArea());
		System.out.println("Cost of painting the walls of romm r2 : " + r2.costOfPaintingWalls(1));
		
		
		Room r3 = new Room(300, 200, 100, 101, "blue");
		//r3.length = 700;
		//r3.breadth = 500;
		//r3.setLength(700);
		//r3.setBreadth(500);
		System.out.println(r3.getLength());
		System.out.println(r3.getBreadth());
		
		
		
		
		
		
		
		
	}

}
