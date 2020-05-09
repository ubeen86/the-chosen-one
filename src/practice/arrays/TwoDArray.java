package practice.arrays;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] dArray = new int[5][3];
		
		dArray [0][2] = 94; // Array 0 int 2
		dArray [0][1] = 93; // Array 0 int 1
		dArray [0][0] = 92; // Array 0 int 0
		
		dArray [1][2] = 5; //Array 1 int 2
		dArray [1][1] = 9; //Array 1 int 1
		dArray [1][0] = 1; //Array 1 int 0
		
		dArray [2][2] = 86; //Array 2 int 2
		dArray [2][1] = 85; //Array 2 int 1
		dArray [2][0] = 84; //Array 2 int 0
		
		dArray [3][2] = 99; //Array 3 int 2
		dArray [3][1] = 98; //Array 3 int 1
		dArray [3][0] = 97; //Array 3 int 0
		
		dArray [4][2] = 68; //Array 4 int 2
		dArray [4][1] = 67; //Array 4 int 1
		dArray [4][0] = 66; //Array 4 int 0
		
		System.out.println(Arrays.deepToString(dArray));
		
		
	}

}
