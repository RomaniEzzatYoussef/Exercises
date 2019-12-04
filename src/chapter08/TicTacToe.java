package chapter08;

import java.util.Scanner;
/**
 *
 * 11/12/2017   9:43:20 AM
 *  
 * @author roman
 *
 *
 * TicTacToe
 *
 */
public class TicTacToe 
{
	static Scanner input = new Scanner(System.in);

	static char[][] board = new char[3][3];
	
	static int player = 2;
	public static void main(String[] args) 
	{
		while (checkSolution())
			playGame();
			
		if (!checkSolution())
		{
			displayBoard();
			
			if (player == 0)
				System.out.println("Player O wins.");
			else if (player == 1)
				System.out.println("Player X wins.");
			else
				System.out.println("No one wins.");
		}
	}
	
	public static boolean checkSolution()
	{
		for (int r = 0; r < board.length; r++)
		{
			int countX = 0;
			int countO = 0;
			for (int c = 0; c < board[r].length; c++)
			{
				if (board[r][c] == 'X')
				{
					countX++;
					player = 1;
				}
				
				if (board[r][c] == 'O')
				{
					countO++;
					player = 0;
				}
			}
			
			if (countO == board.length || countX == board.length)
				return false;
		}
		
		for (int c = 0; c < board[0].length; c++)
		{
			int countX = 0;
			int countO = 0;
			for (int r = 0; r < board.length; r++)
			{
				if (board[r][c] == 'X')
				{
					countX++;
					player = 1;
				}
				
				if (board[r][c] == 'O')
					countO++;
			}
			
			if (countX == board.length || countO == board.length)
				return false;
		}
		
		int countX = 0;
		int countO = 0;
		for (int i = 0; i < board.length; i++)
		{
			if (board[i][i] == 'X')
			{
				countX++;
				player = 1;
			}
			
			if (board[i][i] == 'O')
			{
				countO++;
				player = 0;
			}
		}
		
		if (countX == board.length || countO == board.length)
			return false;
		
		int counterX = 0;
		int counterO = 0;
		for (int c = board[0].length - 1 , r = 0; c > 0 && r < board.length; c-- , r++)
		{
			if (board[r][c] == 'X')
			{
				counterX++;
				player = 1;
			}
			
			if (board[r][c] == 'O')
			{
				counterO++;
				player = 0;
			}
		}
		
		if (counterX == board.length || counterO == board.length)
			return false;
		
		return true;
	}
	
	public static void playGame()
	{
		displayBoard();
		System.out.print("Enter a row (0, 1, or 2) and column (0, 1, or 2) for player X: ");
		board[input.nextInt()][input.nextInt()] = 'X';
		checkSolution();
		
		if (checkSolution())
		{
			displayBoard();
			System.out.print("Enter a row (0, 1, or 2) and column (0, 1, or 2) for player O: ");
			board[input.nextInt()][input.nextInt()] = 'O';	
			checkSolution();
		}
	}
	
	public static void displayBoard()
	{
		System.out.println("Tic Tac Toe Board");
		for (int r = 0; r < board.length; r++)
		{
			System.out.println("\n-------------------------");
			for (int c = 0; c < board[r].length; c++)
				System.out.printf("| %s |" , board[r][c]);
		}
		System.out.println("\n-------------------------\n\n");
	}
	
}
