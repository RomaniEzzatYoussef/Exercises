package chapter07;

import java.util.Arrays;

/**
 *
 * 07/12/2017   6:53:22 AM
 *  
 * @author roman
 *
 *
 * Exercise_22_0
 *
 */
public class Exercise_22_0 
{
	static int[] queens = new int[8];
	final static int SIZE = 8;

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		search(0);
		System.out.println(Arrays.toString(queens));
	}
	
	public static boolean search(int row)
	{
		if (row == SIZE)
			return true;
		
		for (int col = 0; col < SIZE; col++)
		{
			queens[row] = col;
			
			if (isValid(row , col) && search(row + 1))
				return true;
		}
		
		return false;
	}
	
	public static boolean isValid(int row , int col)
	{
		for (int i = 1; i <= row; i++)
			if (queens[row - i] == col || queens[row - i] == col - i || queens[row - i] == col + i)
				return false;
		
		return true;
	}

}
