package ticTakToe;

import java.util.Arrays;

public class Gameboard 
{
	
	
	private char[][] gameboard;
	
	public Gameboard()
	{
		 gameboard = new char [3][3];
		
		for (int row = 0; row < gameboard.length; row++)
		{
			Arrays.fill(gameboard[row],  ' ');
		} 
	}
	public void displayboard()
	{
		for (int row=0; row < gameboard.length; row++) 
		{
			for (int col=0; col < gameboard[0].length; col++) 
			{
				System.out.print("\t"+gameboard[row] [col]);
					if (col == 0 || col ==1)
						System.out.print("|");
			}
			if (row ==0 || row == 1)
			System.out.print("\n----------------------------\n");
		}
		
	}
		

}
