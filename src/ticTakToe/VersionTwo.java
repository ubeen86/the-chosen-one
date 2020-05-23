package ticTakToe;
import java.util.Scanner;
public class VersionTwo 
{
	public static void main(String[] args) 
	{
		Scanner in = null;
		char[][] gameboard = new char[3][3];				
		boolean run = false;
		boolean stalemate = false;	
		boolean one = false;					
		boolean two = false;
		boolean three = false;					
		boolean four = false;
		boolean five = false;				
		boolean six = false;
		boolean seven = false;				
		boolean eight = false;
		boolean nine = false;	
		boolean invalid = true;
		boolean playerOneWin = false;
		boolean playerTwoWin = false;
		String playerOne = "Player X";
		String playerTwo = "player O";
		String player = playerOne;
		char pOne = 'x';						
		char pTwo = 'o';
		int len = 3;
		int play = 0;
		System.out.println("Tic Tac Toe V2");
		System.out.println(" 1 | 2 | 3");
		System.out.println("-----------");
		System.out.println(" 4 | 5 | 6");
		System.out.println("-----------");
		System.out.println(" 7 | 8 | 9");
		System.out.println();
		try
		{//start try
			while(!run)
			{//start main while
				invalid = true;
				in = new Scanner(System.in);
				//game board
				System.out.println("  " + player);
				System.out.println();
				for(int i = 0; i < len; i++)
				{
					for(int j = 0; j < len; j++)
					{
						System.out.printf(" %c ",gameboard[i][j]);
						if(j < (len - 1))
						{
							System.out.print("|");
						}
					}
					System.out.println();
					if( i < (len -1))
					{
						System.out.println("-----------");
					}
				}//end of game board
				while(invalid)
				{
					if( in.hasNextInt() ) 
					{
						play = in.nextInt();
						if( play > 9 || play < 1 )
						{
							System.out.println("Valid Moves are 1-9 try again!" );
						}
					}//end of if has next int
					else
					{
						//game board
						System.out.println("  " + player);
						System.out.println();
						for(int i = 0; i < len; i++)
						{
							for(int j = 0; j < len; j++)
							{
								System.out.printf(" %c ",gameboard[i][j]);
								if(j < (len - 1))
								{
									System.out.print("|");
								}
							}
							System.out.println();
							if( i < (len -1))
							{
								System.out.println("-----------");
							}
						}//end of game board
						System.out.println("Thats not a number! Valid Moves are 1-9 try again!" );
						in.next();
					}
					invalid = false;
				}//end invalid while
				switch(play)
				{
				case 1: one = true; break;
				case 2: two = true; break;
				case 3: three =true; break;
				case 4: four = true; break;
				case 5: five = true; break;
				case 6: six = true; break;
				case 7: seven = true; break;
				case 8: eight = true; break;
				case 9: nine = true; break;
				}
					//Player Marking & swap
					if( player == playerOne && one == true && gameboard[0][0] == '\u0000')
					{
						gameboard[0][0] = pOne;				player = playerTwo;
					}
					else if( player == playerTwo && one == true && gameboard[0][0] == '\u0000')
					{
						gameboard[0][0] = pTwo;				player = playerOne;
					}
					//2
					if( player == playerOne && two == true && gameboard[0][1] == '\u0000')
					{
						gameboard[0][1] = pOne;				player = playerTwo;
					}
					else if( player == playerTwo && two == true && gameboard[0][1] == '\u0000')
					{
						gameboard[0][1] = pTwo;				player = playerOne;
					}
					//3
					if( player == playerOne && three == true && gameboard[0][2] == '\u0000')
					{
						gameboard[0][2] = pOne;				player = playerTwo;
					}
					else if( player == playerTwo && three == true && gameboard[0][2] == '\u0000')
					{
						gameboard[0][2] = pTwo;				player = playerOne;
					}
					//4
					if( player == playerOne && four == true && gameboard[1][0] == '\u0000')
					{
						gameboard[1][0] = pOne;				player = playerTwo;
					}
					else if( player == playerTwo && four == true && gameboard[1][0] == '\u0000')
					{
						gameboard[1][0] = pTwo;				player = playerOne;
					}
					//5
					if( player == playerOne && five == true && gameboard[1][1] == '\u0000')
					{
						gameboard[1][1] = pOne;				player = playerTwo;
					}
					else if( player == playerTwo && five == true && gameboard[1][1] == '\u0000')
					{
						gameboard[1][1] = pTwo;				player = playerOne;
					}
					//6
					if( player == playerOne && six == true && gameboard[1][2] == '\u0000')
					{
						gameboard[1][2] = pOne;				player = playerTwo;
					}
					else if( player == playerTwo && six == true && gameboard[1][2] == '\u0000')
					{
						gameboard[1][2] = pTwo;				player = playerOne;
					}
					//7
					if( player == playerOne && seven == true && gameboard[2][0] == '\u0000')
					{
						gameboard[2][0] = pOne;				player = playerTwo;
					}
					else if( player == playerTwo && seven == true && gameboard[2][0] == '\u0000')
					{
						gameboard[2][0] = pTwo;				player = playerOne;
					}
					//8
					if( player == playerOne && eight == true && gameboard[2][1] == '\u0000')
					{
						gameboard[2][1] = pOne;				player = playerTwo;
					}
					else if( player == playerTwo && eight == true && gameboard[2][1] == '\u0000')
					{
						gameboard[2][1] = pTwo;				player = playerOne;
					}
					//9
					if( player == playerOne && nine == true && gameboard[2][2] == '\u0000')
					{
						gameboard[2][2] = pOne;				player = playerTwo;
					}
					else if( player == playerTwo && nine == true && gameboard[2][2] == '\u0000')
					{
						gameboard[2][2] = pTwo;				player = playerOne;
					}//end of Player Marking & swap
				//X wins!
				if( 	(  gameboard [0][0] == pOne && gameboard [0][1] == pOne && gameboard [0][2] == pOne) ||
						(  gameboard [0][2] == pOne && gameboard [1][2] == pOne && gameboard [2][2] == pOne) ||
						(  gameboard [0][1] == pOne && gameboard [1][1] == pOne && gameboard [2][1] == pOne) ||
						(  gameboard [1][0] == pOne && gameboard [1][1] == pOne && gameboard [1][2] == pOne) ||
						(  gameboard [2][0] == pOne && gameboard [2][1] == pOne && gameboard [2][2] == pOne) ||
						(  gameboard [0][0] == pOne && gameboard [1][1] == pOne && gameboard [2][2] == pOne) ||
						(  gameboard [0][2] == pOne && gameboard [1][1] == pOne && gameboard [2][0] == pOne) ||
						(  gameboard [0][0] == pOne && gameboard [1][0] == pOne && gameboard [2][0] == pOne))
				{
					System.out.println("Player X Wins!");
					playerOneWin = true;
					//game board
					System.out.println();
					for(int i = 0; i < len; i++)
					{
						for(int j = 0; j < len; j++)
						{
							System.out.printf(" %c ",gameboard[i][j]);
							if(j < (len - 1))
							{
								System.out.print("|");
							}
						}
					System.out.println();
					if( i < (len -1))
					{
						System.out.println("-----------");
					}
					}//end of game board
					System.out.println("  Game Over!");
					break;
				}//end of X wins!
				// O wins!
				if( 	(  gameboard [0][0] == pTwo && gameboard [0][1] == pTwo && gameboard [0][2] == pTwo) ||
						(  gameboard [0][2] == pTwo && gameboard [1][2] == pTwo && gameboard [2][2] == pTwo) ||
						(  gameboard [0][1] == pTwo && gameboard [1][1] == pTwo && gameboard [2][1] == pTwo) ||
						(  gameboard [1][0] == pTwo && gameboard [1][1] == pTwo && gameboard [1][2] == pTwo) ||
						(  gameboard [2][0] == pTwo && gameboard [2][1] == pTwo && gameboard [2][2] == pTwo) ||
						(  gameboard [0][0] == pTwo && gameboard [1][1] == pTwo && gameboard [2][2] == pTwo) ||
						(  gameboard [0][2] == pTwo && gameboard [1][1] == pTwo && gameboard [2][0] == pTwo) ||
						(  gameboard [0][0] == pTwo && gameboard [1][0] == pTwo && gameboard [2][0] == pTwo))
					{
						System.out.println("Player O Wins!");
						playerTwoWin = true;
						//game board
						System.out.println();
						for(int i = 0; i < len; i++)
						{
							for(int j = 0; j < len; j++)
							{
								System.out.printf(" %c ",gameboard[i][j]);
								if(j < (len - 1))
								{
									System.out.print("|");
								}
							}
						System.out.println();
						if( i < (len -1))
						{
							System.out.println("-----------");
						}
						}//end of game board
						System.out.println("  Game Over!");
						break;
					}	
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
					//game board
					System.out.println();
					for(int i = 0; i < len; i++)
					{
						for(int j = 0; j < len; j++)
						{
							System.out.printf(" %c ",gameboard[i][j]);
							if(j < (len - 1))
							{
								System.out.print("|");
							}
						}
					System.out.println();
					if( i < (len -1))
					{
						System.out.println("-----------");
					}
					}//end of game board
					System.out.println("Game Over!");
					break;
				}//End of Stale mate

			}//end of main while
			in.close();
		}//end try
		catch ( Exception s )
		{
			if(in != null)
			{
				in.close();
			}
			System.out.println("Invalid!!!" );
		}
	}//static close
}//public close
