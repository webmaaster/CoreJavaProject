
//import java.util.*; // importes all the classes inside the java.util package // not good practice
import java.util.Scanner;

public class SwitchCaseDemo {

	public static void menuProcessing(int receivedOption) {
		switch(receivedOption) {
		case 1:
			System.out.println("Add a student option is selected");
			break;
		case 2:
			System.out.println("Remove a student option is selected");
			break;
		case 3:
			System.out.println("Update a student option is selected");
			break;
		case 4:
			System.out.println("List all student option is selected");
			break;
		case 5:
			System.out.println("Exiting system.....");
			System.exit(0);
		}
		//
	}
	
	public static void main(String[] args) {
		
		System.out.println("1. Add a student");
		System.out.println("2. Remove a student");
		System.out.println("3. Update a student");
		System.out.println("4. List all students");
		System.out.println("5. Exit");
		
		// hey create a stream with the keyboard(System.in) as the source
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your menu option:");
		int option = scan.nextInt(); // we get an int input from the keyboard
		
		menuProcessing(option);
		
	}

}
