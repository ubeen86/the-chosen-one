package practice.loop;

import java.util.Scanner;

public class ForLoopFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("what number comes after 79?");
		Scanner fn = new Scanner(System.in);

		try { 
			for(int i = 0; i<5; i++ ) {
				
				int a = fn.nextInt();
			     System.out.println(a);

			}
			fn.close();
			
	
		 } catch ( Exception s ){ 
			  System.out.println("Invalid data entered" );
			  s.printStackTrace();
		 } 
			
	}
}