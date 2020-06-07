/*
Create a looping application that takes user input.
The user must be allowed to enter the following commands:
"Show Months", "Show Name", "Show Cat", "Exit"

if "Show Months" is entered, the months of the year are displayed
if "Show Name" is entered, UBEEN86 is displayed
if "Show Cat" is entered, the following is displayed:
ლ(=ↀωↀ=)ლ
ฅ(*ΦωΦ*) ฅ

if "Exit" is entered, the program displays "Good Bye" and terminates.
The program should not terminate until this command is entered.

if anything other than these commands are entered, the program displays "Invalid Command"

Use of a switch statement is recommended!
 */
package practice.loop;
import java.util.Scanner;
public class LoopingCommandLinePractice 
{
	public static void main(String[] args) 
	{
		String guess = "default";
		boolean term = false;
		Scanner input = null;
		try
		{
			while(term == false)
			{
				input = new Scanner(System.in);
					System.out.println("Please enter a command");
					guess = input.nextLine();
					switch (guess)
					{
						case "show month": 
							System.out.println("January\nFebruary\nMarch\nApril\nMay\nJune\nJuly"
							+ "\nAugust\nSeptember\nOctober\nNovember\nDecember"); 
							break;
						
						case "show name":
							System.out.println("ubeen86");
							break;
						
						case "show cat": System.out.println("ლ(=ↀωↀ=)ლ\n" + 
								"ฅ(*ΦωΦ*) ฅ");
							break;
						
						case "end":
							term = true;
							break;
						
						default: 
							System.out.println("Invalid Command");
							break;
					
					}
					if( term == true )
					{
						System.out.println("GoodBye");
						break;
					}
			}//end of while
		}//end of try
		catch ( Exception s )
		{
			System.out.println("System Fail" );
		}
	}//end of void
}//end of public class
