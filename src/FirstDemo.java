
public class FirstDemo {

	static int myInstanceVariable = 50;
	
	// define a method to find the cube of a number
	public static int findCube(int myNumber) {
		int ans = myNumber * myNumber * myNumber;
		return ans;
	}
	
	// define a method which prints the percentage of a number
	public static double numberPercentage(double myNumber, double totalNumber) {
		double ans = myNumber * totalNumber / 100;
		return ans;
	}
	
	// method definition
	public static void findSquare() {
		int myNumber = 10;
		int ans = myNumber * myNumber;
		System.out.println("The square of " + myNumber + " is " + ans);
	}

	public static void sumOfTwoNumbers() {
		// declare variables
		int num1 = 10;
		int num2 = 20;

		// process
		int num3 = num1 + num2;

		// output
		System.out.println("num3");
		System.out.println(num3);

		System.out.println("Sum of " + num1 + " and " + num2 + " is " + num3);
	}

	public static void main(String[] args) {

		findSquare(); // method invocation
		sumOfTwoNumbers();
		
		int returnedAns = findCube(5);
		System.out.println("The cube of 5 is " + returnedAns);
		
		returnedAns = findCube(10);
		System.out.println("The cube of 10 is " + returnedAns);
		
		System.out.println("The cube of 3 is " + findCube(3));
		
		System.out.println("MyInstance Variable value is: " + myInstanceVariable);
		
		System.out.println("Percentage of 20 is " + numberPercentage(4.0, 100.0));
	}

}

// scopes of a variable
// 2 scopes
// local variables
// instance variables


// input 
// process
// output

// 8 primitive data types
// byte
// short
// int
// long
// float 
// double
// char
// boolean