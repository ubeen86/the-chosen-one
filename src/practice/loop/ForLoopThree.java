package practice.loop;

public class ForLoopThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] dArray = new int[5][3];
		
		dArray [0][2] = 94;
		dArray [0][1] = 93; 
		dArray [0][0] = 92; 
		
		dArray [1][2] = 51; 
		dArray [1][1] = 91; 
		dArray [1][0] = 11; 
		
		dArray [2][2] = 86; 
		dArray [2][1] = 85; 
		dArray [2][0] = 84; 
		
		dArray [3][2] = 99; 
		dArray [3][1] = 98; 
		dArray [3][0] = 97; 
		
		dArray [4][2] = 68; 
		dArray [4][1] = 67; 
		dArray [4][0] = 66; 
		
		for(int i=0;i<dArray.length;i++){
			
			System.out.println();
			
			for(int h=0;h<dArray[i].length;h++){
				
				System.out.print(dArray[i][h] + "   ");	
			}
		
		}
	}

}
