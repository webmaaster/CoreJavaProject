
public class LoopingDemo {

	public static void main(String[] args) {

		//System.out.println("Welcome to Java");
		//System.out.println("Welcome to Java");
		
		//1. initial value for the loop to start
		//2. the condition for how long the loop should run
		//3. a step to get closer to the condition in step 2 to fail
		
		//print welcome to java 10 times using while loop
		int i = 1; // 1.
		while(i <= 10) { // 2.
			System.out.println("Welcome to Java");
			i = i + 1; // 3.
		}
		
		System.out.println("_________________________________");
		int j = 1;
		do {
			System.out.println("Welcome to Java");
			j = j + 1; // j++
		}while(j <= 10);
		
		System.out.println("_________________________________");
		for(int k=1; k<=10; k++) {
			System.out.println("Welcome to Java");
		}
		 
		System.out.println("_________________________________");
		//print numbers from 1 to 10
		for(int a=1; a<=10; a++) {
			System.out.println(a);
		}
		
		System.out.println("_________________________________");
		// print even numbers between 1 and 20
		for(int s=1; s<=20; s++) {
			if(s % 2 == 0) {
				System.out.println(s + " is an even number");
			}
		}
		
		
		//
	}

}
// i = 1, 1 <= 10, true, i = 2
// i = 2, 2 <= 10, true, i = 3
// i = 3, 3 <= 10, true, i = 4




// i = 10, 10 <= 10, true, i = 11
// i = 11, 11 <= 10, false
