package chapter08;

import java.util.Scanner;

/**
 *
 * 07/12/2017   10:49:12 PM
 *  
 * @author roman
 *
 *
 * PassTwoDimensionalArray
 *
 */
public class PassTwoDimensionalArray 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[][] m = getArray();
		System.out.println("\nSum of all elements is " + sum(m));
	}
	
	public static int[][] getArray()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter rows and columns for Two-Dimensional Array: ");
		int[][] m = new int[input.nextInt()][input.nextInt()];
		
		for (int r = 0; r < m.length; r++)
			for (int c = 0; c < m[r].length; c++)
				m[r][c] = (int)(Math.random() * 100);
		
		for (int r = 0; r < m.length; r++)
		{
			for (int c = 0; c < m[r].length; c++)
				System.out.print(m[r][c] + " ");
			System.out.println();
		}
				
		
		input.close();
		
		return m;
	}
	
	public static int sum(int[][] m)
	{
		int sum = 0;
		for (int r = 0; r < m.length; r++)
			for (int c = 0; c < m[r].length; c++)
				sum += m[r][c];
		
		return sum;
	}

}
