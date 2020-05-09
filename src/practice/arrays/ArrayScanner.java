package practice.arrays;
import java.util.Scanner;
public class ArrayScanner {
	public static void main(String[] args) {

		System.out.println("Some True or False Questions");
		System.out.println("Your Hair is Blue?");
		Scanner as = new Scanner(System.in);
		try {

			boolean a = as.nextBoolean();
		
			System.out.println("Your good with Computers?");

			boolean b = as.nextBoolean();
		
			System.out.println("Your enjoying the Zelda Games?");

			boolean c = as.nextBoolean();
		
			System.out.println("No More Questions");

		
			boolean[] bArray = {a, b,c};
		
			System.out.println(bArray[0]);
			System.out.println(bArray[1]);
			System.out.println(bArray[2]);
		}
			catch(Exception bs){
			System.out.println("This is not True or False");
			
		}
			finally {
				System.out.println("Program Terminated");
				as.close();
					}

	}
}