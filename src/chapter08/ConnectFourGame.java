package chapter08;

import java.util.Scanner;

/**
 *
 * 11/12/2017   6:32:34 PM
 *  
 * @author roman
 *
 *
 * ConnectFourGame
 *
 */
public class ConnectFourGame {

	static Scanner input = new Scanner(System.in);
	static char[][] grid = new char[6][7];
	
	static int columnPosition = 0;
	static char chipColor;
	
	public static void main(String[] args) 
	{
		playGame();
	}
	
	public static void displayGrid()
	{
		for (int r = 0; r < grid.length; r++)
		{
			for (int c = 0; c < grid[r].length; c++)
				System.out.printf("| %s |" , grid[r][c]);
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
	}
	
	public static void playGame()
	{
		displayGrid();
		
		boolean gameOver = false;
		boolean playersTurn = true;
		
		while (!gameOver)
		{
			if (playersTurn)
			{
				System.out.print("Drop a red disk at column (0–6): ");
				chipColor = 'R';			
			}
			else
			{
				System.out.print("Drop a yellow disk at column (0–6): ");
				chipColor = 'Y';
			}
			
			columnPosition = input.nextInt();
			while (columnPosition < 0 || columnPosition > 6)
			{
				System.out.print("Column position must be between 0 to 6: ");
				columnPosition = input.nextInt();
			}
			
			playersTurn = !playersTurn;
			
			if (dropChip())
				playersTurn = !playersTurn;
			else
			{
				displayGrid();
				
				if (checkSolution())
				{
					gameOver = true;
					System.out.print(chipColor + " won! Game Over!");
				}
				else if (checkTie())
				{
					gameOver = true;
					System.out.print("It's a tie!");
				}
			}
		}
		
		input.close();
	}
	
	public static boolean dropChip()
	{
		for (int r = grid.length - 1; r >= 0; r--)
		{
			if (grid[r][columnPosition] == 0)
			{
				grid[r][columnPosition] = chipColor;
				return false;
			}
		}
		
		System.out.println("Column full, " + chipColor + " player, try again!");
		return true;
	}
	
	public static boolean checkTie()
	{
		for (int i = 0; i < grid[0].length; i++)
			if (grid[0][i] == 0)
				return false;
		
		return true;
	}
	
	public static boolean checkSolution()
	{
		for (int r = grid.length- 1; r >= 0; r--)
		{
			int cR = 0;
			int cY = 0;
			for (int c = 0; c < grid[r].length; c++)
			{
				if (grid[r][c] == 'R')
				{
					cR++;
				}
				
				if (grid[r][c] == 'Y')
				{
					cY++;
				}
			}
			
			if (cY == 4 || cR == 4)
				return true;
		}
		
		for (int c = 0; c <  grid[0].length; c++)
		{
			int cR = 0;
			int cY = 0;
			for (int r = grid.length - 1; r >= 0; r--)
			{
				if (grid[r][c] == 'R')
				{
					cR++;
				}
				
				if (grid[r][c] == 'Y')
				{
					cY++;
				}
			}
			
			if (cY == 4 || cR == 4)
				return true;
		}
		
		int cR = 0;
		int cY = 0;
		for (int i = 0; i < grid.length; i++)
		{
			if (grid[i][i] == 'R')
			{
				cR++;
			}
			
			if (grid[i][i] == 'Y')
			{
				cY++;
			}
		}
		
		if (cR == 4 || cY == 4)
			return true;
		
		int counterR = 0;
		int counterY = 0;
		for (int c = grid[0].length - 1 , r = 0; c > 0 && r < grid.length; c-- , r++)
		{
			if (grid[r][c] == 'X')
			{
				counterR++;
			}
			
			if (grid[r][c] == 'O')
			{
				counterY++;
			}
		}
		
		if (counterR == 4 || counterY == 4)
			return true;
		
		return false;
	}
}
