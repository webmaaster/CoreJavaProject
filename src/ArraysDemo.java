
public class ArraysDemo {

	public static void main(String[] args) {
		int englishMark = 30;
		int mathMark = 40;
		int scienceMark = 35;
		
		// arrays
		//declared and array of size 3
		int[] marks = new int[3];
		boolean[] results = new boolean[8];
		
		//assigned values to the individual elements of the array
		marks[0] = 30;
		marks[1] = 40;
		marks[2] = 35;
		
		//print the individual elements of the array to the console
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		
		System.out.println("----------------------------");
		System.out.println("length of the array: " + marks.length);
		//print the individual elements of the array using for loop
		//for(int i=0; i<=2; i++) {
		for(int i=0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		System.out.println("----------------------------");
		//initialize an array
		int[] myMarks = {1, 2, 3};
		for(int i=0; i<myMarks.length; i++) {
			System.out.println(myMarks[i]);
		}
		
		
	}

}
