package chapter08;

import java.util.Scanner;

/**
 *
 * 08/12/2017   1:13:57 PM
 *  
 * @author romani
 *
 *
 * CheckSudokuSolution
 *
 */
public class CheckSudokuSolution 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[][] grid = readASolution();
		System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
	}
	
	public static int[][] readASolution()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Sudoku puzzle solution: ");
		int[][] grid = new int[9][9];
		
		for (int r = 0; r < 9; r++)
		{
			for (int c = 0; c < 9; c++)
			{
				grid[r][c] = input.nextInt(); //(int) (Math.random() * 10);
			}
		}
		
		input.close();
		
		return grid;
	}
	
	public static boolean isValid(int[][] grid)
	{
		for (int r = 0; r < 9; r++)
			for (int c = 0; c < 9; c++)
				if (grid[r][c] < 1 || grid[r][c] > 9 || !isValid(r , c , grid))
					return false;
				
		return true;
	}
	
	public static boolean isValid(int row , int col , int[][] grid)
	{
		for (int c = 0; c < 9; c++)
			if (c != col && grid[row][c] == grid[row][col])
				return false;
		
		for (int r = 0; r < 9; r++)
			if (r != row && grid[r][col] == grid[row][col])
				return false;
		
		for (int r = (row / 3) * 3; r < (row / 3) * 3 + 3; r++)
			for (int c = (col / 3) * 3; c < (col / 3) * 3 + 3; c++)
				if (r != row && c != col && grid[r][c] == grid[row][col])
					return false;
		
		return true;
	}

}
