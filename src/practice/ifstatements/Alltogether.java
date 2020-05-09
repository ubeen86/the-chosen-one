package practice.ifstatements;

import java.util.Scanner;

public class Alltogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("which month do you seek?");
		Scanner month = new Scanner(System.in);

		try { 
			int guess = month.nextInt();

			while (guess> 12||guess<=0)
			{	
				guess = month.nextInt();	
			}
			
			String[] marray = {"January","Feburary","March","April","May","June","July","August","September","October","November","December"};

			System.out.println(marray[guess-1]);
			month.close();
	
		 } catch ( Exception s ){ 
			  System.out.println("Invalid data entered" );
			  s.printStackTrace();
		 } 
			
	}
}

