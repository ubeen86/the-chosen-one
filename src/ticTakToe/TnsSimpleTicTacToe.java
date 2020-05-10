package ticTakToe;

import java.util.Scanner;

/**
 * Simulates a two-player game of tic-tac-toe
 * via the command-line
 * 
 * @author tausi
 *
 */
public class TnsSimpleTicTacToe {

	public static void main(String[] args) {

		Scanner userInput = null;

		boolean gameRunning = true;
		char[][] gameboard = new char[3][3];

		String playerOne = "Player One";
		String playerTwo = "Player Two";

		char playerOneMarker = 'X';
		char playerTwoMarker = 'O';

		String currentPlayer = playerOne;
		char currentPlayerMarker = playerOneMarker;


		try {
			userInput = new Scanner(System.in);
			
			System.out.println("TIC TAC TOE!\n");

			while(gameRunning) {
				// Using negative values as default values
				// to help with validity of input
				int row = -1;
				int column = -1;

				///////PRINT THE GAME BOARD ////////

				System.out.println(currentPlayer + "\n");
				System.out.println("  1   2   3");

				for(int i = 0, len = gameboard.length; i < len; i++) {
					System.out.print(i + 1);

					// going to assume this is a square board
					// so just using the length of the outer array
					for(int j = 0; j < len; j++) {
						System.out.printf(" %c ", gameboard[i][j]);

						if(j < (len - 1)) {
							System.out.print('|');
						}
					}

					System.out.println();

					// don't print line on bottom of board
					if(i < (len - 1)) {
						System.out.println("-----------");
					}
				}

				System.out.println();

				/////// PLAYER INPUT SECTION////////

				while(row < 0) {
					System.out.println("Enter a row:");

					if(userInput.hasNextInt()) {
						row = userInput.nextInt();

						if(row < 0 || row > gameboard.length) {
							System.out.println("Invalid Row\n");
							row = -1;
						} else {
							row--;
						}

					} else {
						System.out.println("That is not a number!\n");
						userInput.next();
					}
				}

				while(column < 0) {
					System.out.println("Enter a column:");

					if(userInput.hasNextInt()) {
						column = userInput.nextInt();

						if(column < 0 || column > gameboard.length) {
							System.out.println("Invalid Column\n");
							column = -1;
						} else {
							column--;
						}

					} else {
						System.out.println("That is not a number!\n");
						userInput.next();
					}
				}

				// make sure space hasn't already been taken
				if(gameboard[row][column] == '\u0000') {
					boolean stalemate = true;
					boolean gameWon = false;

					gameboard[row][column] = currentPlayerMarker;

					/////// CHECK WIN CONDITIONS /////////

					// check for row and column victories
					for(int i = 0, len = gameboard.length;(i < len) && !gameWon; i++) {
						boolean columnV = true;
						boolean rowV = true;

						for(int j = 0; j < len; j++) {
							columnV = columnV && (gameboard[j][i] == currentPlayerMarker);
							rowV = rowV && (gameboard[i][j] == currentPlayerMarker);

						}

						gameWon = gameWon || columnV || rowV;

					}

					// check for diagonal win
					boolean diagOneV = true;
					boolean diagTwoV = true;

					for(int i = 0, len = gameboard.length;(i < len) && !gameWon; i++) {

						diagOneV = diagOneV && (gameboard[i][i] == currentPlayerMarker);
						diagTwoV = diagTwoV && (gameboard[(len - 1) - i][i] == currentPlayerMarker);
					}

					gameWon = gameWon || diagOneV || diagTwoV;

					/////// CHECK STALEMATE /////////

					if(!gameWon) {
						for(int i = 0, len = gameboard.length; i < len; i++) {
							for(int j = 0; j < len; j++) {
								if(gameboard[i][j] == '\u0000') {
									stalemate = false;
									break;
								}

							}
						}
					}

					//// CHECK RESULTS ///////////

					if(gameWon || stalemate) {
						if(gameWon) {
							System.out.printf("\n%s wins!\n", currentPlayer);
						} else {
							System.out.println("Stalemate!");
						}

						gameRunning = false;
					}

					//// SWAP PLAYERS /////////

					if(currentPlayerMarker == playerOneMarker) {
						currentPlayerMarker = playerTwoMarker;
						currentPlayer = playerTwo;
					} else {
						currentPlayerMarker = playerOneMarker;
						currentPlayer = playerOne;
					}

					System.out.println();

				} else {
					System.out.println("This space has already been taken!");
				}


			}

			for(int i = 0, len = gameboard.length; i < len; i++) {
				System.out.print(i + 1);

				// going to assume this is a square board
				// so just using the length of the outer array
				for(int j = 0; j < len; j++) {
					System.out.printf(" %c ", gameboard[i][j]);

					if(j < (len - 1)) {
						System.out.print('|');
					}
				}

				System.out.println();

				// don't print line on bottom of board
				if(i < (len - 1)) {
					System.out.println("-----------");
				}
			}

			System.out.println("\nGame Over!");

		} catch(Exception e) {

			if(userInput != null) {
				userInput.close();
			}

			e.printStackTrace();
		}

	}

}
