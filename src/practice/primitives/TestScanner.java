package practice.primitives;
import java.util.Scanner;

public class TestScanner {
	
	public static void main(String[] args) {
		System.out.println("what is your name?");
		try	(Scanner scanner = new Scanner(System.in)) {


	String name = scanner.nextLine();
	System.out.println("Hello " + name);
	
}	
	catch (Exception e) {
		
		System.out.println("Error Detected");
	}finally {
		System.out.println("Try Catch Concluded");
	}

}
}