package string;

public class StringDemo {

	public static void main(String[] args) {
		
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		
		float f1 = 3.2f;
		double d1 = 1.2;
		
		boolean flag = true;
		
		char ch = 'd';
		
		//Room r1 = new Room();
		String name = new String("John");
		String address = new String("Atlanta");
		String message = "welcome"; // better approach
		
		message = "hello";
		
		String data = "hello";
		char myCh = data.charAt(2);
		System.out.println(myCh);
		
	}

}
