package practice.arrays;

import java.util.Arrays;

public class Booleantwodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[][] kArray = new boolean[4][2];
		
		kArray [0][0] = true;
		kArray [0][1] = true;
		
		kArray [1][0] = true;
		kArray [1][1] = false;
		
		kArray [2][0] = false;
		kArray [2][1] = false;
		
		kArray [3][0] = true;
		kArray [3][1] = false;
		
		System.out.println(Arrays.deepToString(kArray));
		
	}

}
