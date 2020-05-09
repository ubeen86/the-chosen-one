package practice.ifstatements;

import java.util.Scanner;

public class ifMonthPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("which month do you seek?");
		Scanner month = new Scanner(System.in);
		 try
		 { 
		int guess = month.nextInt();

			int jan =1;
			int feb =2;
			int mar =3;
			int apr =4;
			int may =5;
			int jun =6;
			int jul =7;
			int aug =8;
			int sep =9;
			int oct =10;
			int nov =11;
			int dec =12;

			String[] marray = {"January","Feburary","March","April","May","June","July","August","September","October","November","December"};

			  month.close();
			  
			  if(jan==guess) 
				{
					System.out.println(marray[0]);
				}
				else if(feb==guess)
				{
					System.out.println(marray[1]);	
				}
				else if(mar==guess) 
				{				
					System.out.println(marray[2]);			
				}
				else if(apr==guess)
				{
					System.out.println(marray[3]);		
				}
				else if(may==guess) 
				{				
					System.out.println(marray[4]);
				}
				else if(jun==guess)
				{
					System.out.println(marray[5]);
				}
				else if(jul==guess) 
				{
					System.out.println(marray[6]);			
				}
				else if(aug==guess)
				{
					System.out.println(marray[7]);
				}
				else if(sep==guess) {
					System.out.println(marray[8]);
				}
				else if(oct==guess)
				{
					System.out.println(marray[9]);
				}
				else if(nov==guess)
				{
					System.out.println(marray[10]);
				}
				else if(dec==guess)
				{
					System.out.println(marray[11]);
				}
				else
				{
					System.out.println("Invalid Data");
				}
			 }
			  catch ( Exception s )
			    { 
			      System.out.println("Invalid data entered" );
			      s.printStackTrace();
			    } 
				
		}
	}

