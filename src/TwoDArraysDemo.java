
public class TwoDArraysDemo {

	public static void main(String[] args) {
		
		int[][] matrixA = new int[2][3];
		
		matrixA[0][0] = 10;
		matrixA[0][1] = 20;
		matrixA[0][2] = 30;
		matrixA[1][0] = 40;
		matrixA[1][1] = 50;
		matrixA[1][2] = 60;
		
		for(int i=0; i<matrixA.length; i++) {
			for(int j=0; j<matrixA[i].length; j++) {
				System.out.print(matrixA[i][j] + "   ");
			}
			System.out.println();
		}
	}

}
