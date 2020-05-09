package practice.primitives;

import java.util.Scanner;

public class Stringcompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Password = "code earth";
		
		System.out.println("Whats the password?");
		
		Scanner input = new Scanner(System.in);
		String guess = input.nextLine();
		
		System.out.println(Password.equals(guess));
		input.close();
		
		if(Password.equals(guess)) {
			
			System.out.println("You got it right! Good Work!");
			return;
			
		}else
		{
			System.out.println("You got it worng! You Suck!");
			return;
		}
		
	}

}
