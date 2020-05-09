package practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Twodtest 
{
	public static void main(String[] args) 
	{
		Scanner player = new Scanner(System.in);
		char[][] gameboard = new char[3][3];		
		boolean r = false;
		char pone = 'x';
		char ptwo = 'o';
		boolean stalemate = false;
			// X booleans							// O booleans
		boolean eleven = false;					boolean twentyone = false;
		boolean twelve = false;					boolean twentytwo = false;
		boolean thirteen = false;				boolean twentythree = false;
		boolean fourteen = false;				boolean twentyfour = false;
		boolean fifteen = false;				boolean twentyfive = false;
		boolean sixteen = false;				boolean twentysix = false;
		boolean seventeen = false;				boolean twentyseven = false;
		boolean eightteen = false;				boolean twentyeight = false;
		boolean nineteen = false;				boolean twentynine = false;
		try
		{
			while(!r)
			{
				//Board Appearance
				for (char[] row: gameboard) 	
				{
					System.out.println(Arrays.toString(row));
				}
			System.out.println("Next Player");
			int play = player.nextInt();
//Start of Player Commands
				switch(play) 
				{				//X										//O
					case 11: eleven = true; break;			case 21: twentyone = true;  break;
					case 12: twelve = true; break;			case 22: twentytwo = true; break;
					case 13: thirteen = true; break;		case 23: twentythree = true; break;
					case 14: fourteen = true; break;		case 24:  twentyfour = true; break;
					case 15: fifteen = true; break;			case 25: twentyfive = true; break;
					case 16: sixteen = true; break;			case 26: twentysix = true; break;
					case 17: seventeen = true; break;		case 27:  twentyseven = true; break;		
					case 18: eightteen = true; break;		case 28: twentyeight = true; break;
					case 19: nineteen = true; break;		case 29: twentynine = true; break;
				}//End of Player Commands
//Player Debug
			//X
				if( gameboard[0][0] == '\u0000' && eleven == true)
				{
					gameboard [0][0] = pone;
				}
				if( gameboard[0][1] == '\u0000' && twelve == true)
				{
					gameboard [0][1] = pone;
				}
				if( gameboard[0][2] == '\u0000' && thirteen == true)
				{
					gameboard [0][2] = pone;
				}
				if( gameboard[1][0] == '\u0000' && fourteen == true)
				{
					gameboard [1][0] = pone;
				}
				if( gameboard[1][1] == '\u0000' && fifteen == true)
				{
					gameboard [1][1] = pone;
				}
				if( gameboard[1][2] == '\u0000' && sixteen == true)
				{
					gameboard [1][2] = pone;
				}
				if( gameboard[2][0] == '\u0000' && seventeen == true)
				{
					gameboard [2][0] = pone;
				}
				if( gameboard[2][1] == '\u0000' && eightteen == true)
				{
					gameboard [2][1] = pone;
				}
				if( gameboard[2][2] == '\u0000' && nineteen == true)
				{
					gameboard [2][2] = pone;
				}
			//O
				if( gameboard[0][0] == '\u0000' && twentyone == true)
				{
					gameboard [0][0] = ptwo;
				}
				if( gameboard[0][1] == '\u0000' && twentytwo == true)
				{
					gameboard [0][1] = ptwo;
				}
				if( gameboard[0][2] == '\u0000' && twentythree == true)
				{
					gameboard [0][2] = ptwo;
				}
				if( gameboard[1][0] == '\u0000' && twentyfour == true)
				{
					gameboard [1][0] = ptwo;
				}
				if( gameboard[1][1] == '\u0000' && twentyfive == true)
				{
					gameboard [1][1] = ptwo;
				}
				if( gameboard[1][2] == '\u0000' && twentysix == true)
				{
					gameboard [1][2] = ptwo;
				}
				if( gameboard[2][0] == '\u0000' && twentyseven == true)
				{
					gameboard [2][0] = ptwo;
				}
				if( gameboard[2][1] == '\u0000' && twentyeight == true)
				{
					gameboard [2][1] = ptwo;
				}
				if( gameboard[2][2] == '\u0000' && twentynine == true)
				{
					gameboard [2][2] = ptwo;
				}//End of player debug
//Start of Win Conditions
			//X
				if( (  gameboard [0][0] == pone && gameboard [0][1] == pone && gameboard [0][2] == pone) ||
					(  gameboard [0][2] == pone && gameboard [1][2] == pone && gameboard [2][2] == pone) ||
					(  gameboard [0][1] == pone && gameboard [1][1] == pone && gameboard [2][1] == pone) ||
					(  gameboard [1][0] == pone && gameboard [1][1] == pone && gameboard [1][2] == pone) ||
					(  gameboard [2][0] == pone && gameboard [2][1] == pone && gameboard [2][2] == pone) ||
					(  gameboard [0][0] == pone && gameboard [1][1] == pone && gameboard [2][2] == pone) ||
					(  gameboard [0][2] == pone && gameboard [1][1] == pone && gameboard [2][0] == pone) ||
					(  gameboard [0][0] == pone && gameboard [1][0] == pone && gameboard [2][0] == pone))
				{
				System.out.println("Player X Wins!");	
				for (char[] row: gameboard) 	
					{
					System.out.println(Arrays.toString(row));
					}
				System.out.println("Game Over");
				break;
				}
			//O
				if( (  gameboard [0][0] == ptwo && gameboard [0][1] == ptwo && gameboard [0][2] == ptwo) ||
					(  gameboard [0][2] == ptwo && gameboard [1][2] == ptwo && gameboard [2][2] == ptwo) ||
					(  gameboard [0][1] == ptwo && gameboard [1][1] == ptwo && gameboard [2][1] == ptwo) ||
					(  gameboard [1][0] == ptwo && gameboard [1][1] == ptwo && gameboard [1][2] == ptwo) ||
					(  gameboard [2][0] == ptwo && gameboard [2][1] == ptwo && gameboard [2][2] == ptwo) ||
					(  gameboard [0][0] == ptwo && gameboard [1][1] == ptwo && gameboard [2][2] == ptwo) ||
					(  gameboard [0][2] == ptwo && gameboard [1][1] == ptwo && gameboard [2][0] == ptwo) ||
					(  gameboard [0][0] == ptwo && gameboard [1][0] == ptwo && gameboard [2][0] == ptwo))
				{
					System.out.println("Player O Wins!");
					for (char[] row: gameboard) 	
					{
						System.out.println(Arrays.toString(row));
					}
					System.out.println("Game Over");
					break;
				}// End of Win Conditions				
//Start of Stale mate
				if( gameboard[0][0] != '\u0000' && gameboard[0][1] != '\u0000' && gameboard[0][2] != '\u0000' &&
					gameboard[1][0] != '\u0000' && gameboard[1][1] != '\u0000' && gameboard[1][2] != '\u0000' &&
					gameboard[2][0] != '\u0000' && gameboard[2][1] != '\u0000' && gameboard[2][2] != '\u0000' )
				{
					stalemate = true;
				}

				if ( stalemate == true) 
				{
					System.out.println("IT IS A DRAW!");
					for (char[] row: gameboard) 	
					{
						System.out.println(Arrays.toString(row));
					}
					System.out.println("Game Over!");
					break;
				}//End of Stale mate
			}//End of While Loop
		}//End of Try
		catch ( Exception s )
		{ 
			System.out.println("Invalid data entered" );
		}
		player.close();
	}//End of public static void
}//end of version one