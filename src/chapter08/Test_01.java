package chapter08;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * 07/12/2017   1:43:25 PM
 *  
 * @author roman
 *
 *
 * Test_01
 *
 */
public class Test_01 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[][] matrix = new int[10][10];
		
		// 01- Initializing arrays with random values
				for (int r = 0; r < matrix.length; r++)
					for (int c = 0; c < matrix[0].length; c++)
						matrix[r][c] = (int) (Math.random() * 100);
				
				for (int r = 0; r < matrix.length; r++)
				{
					for (int c = 0; c < matrix[0].length; c++)
						System.out.print(matrix[r][c] + " ");
					System.out.println();
				}
		
		// 02- Initializing arrays with input values
		Scanner input = new Scanner(System.in);
		System.out.print("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
		for (int r = 0; r < matrix.length; r++)
			for (int c = 0; c < matrix[0].length; c++)
				matrix[r][c] = input.nextInt();
		input.close();
		
		
		// 03- Printing arrays
		for (int r = 0; r < matrix.length; r++)
		{
			for (int c = 0; c < matrix[0].length; c++)
				System.out.print(matrix[r][c] + " ");
			System.out.println();
		}
		
		
		// 04- Summing all elements
		int sumOfAll = 0;
		for (int r = 0; r < matrix.length; r++)
			for (int c = 0; c < matrix[0].length; c++)
				sumOfAll += matrix[r][c];
		System.out.println("Sum is " + sumOfAll);
		
		
		// 05- Summing elements by column
		for (int c = 0; c < matrix[0].length; c++)
		{
			int total = 0;
			for (int r = 0; r < matrix.length; r++)
				total += matrix[r][c];
			System.out.println("Sum of Column " + c + " is " + total);
			
		}
		
		
		// 06- Which row has the largest sum?
		{
			int index = 0;
			int maxRow = 0;
			for (int c = 0; c < matrix[0].length; c++)
				maxRow = matrix[0][c];
			
			for (int r = 1; r < matrix.length; r++)
			{
				int sum = 0;
				for (int c = 0; c < matrix[0].length; c++)
					sum += matrix[r][c];
				if (maxRow < sum)
				{
					maxRow = sum;
					index = r;
				}
			}
			
			System.out.println("Row " + index + " has the maximum sum of " + maxRow);
		}
		
		// Romani's code wins............
		int[] sums = new int[matrix.length];
		for (int r = 0; r < matrix.length; r++)
			for (int c = 0; c < matrix[0].length; c++)
				sums[r] += matrix[r][c];
		
		int maxRow = sums[0];
		int row = 0;
		for (int i = 1; i < sums.length; i++)
			if (maxRow < sums[i])
			{
				maxRow = sums[i];
				row = i;
			}
		System.out.println("Row " + row + " has the maximum sum of " + maxRow);
		
		
		// 07- Random shuffling
		for (int r = 0; r < matrix.length; r++) 
		{
			for (int c = 0; c < matrix[r].length; c++) 
			{
				int r1 = (int)(Math.random() * matrix.length);
				int c1 = (int)(Math.random() * matrix[r].length);
				
				int temp = matrix[r][c];
				matrix[r][r] = matrix[r1][c1];
				matrix[r1][c1] = temp;
			}
		}
		
		for (int r = 0; r < matrix.length; r++)
		{
			for (int c = 0; c < matrix[0].length; c++)
				System.out.print(matrix[r][c] + " ");
			System.out.println();
		}
		
		System.out.println();
		
		//
		int[][] array = {{1, 2}, {3, 4}, {5, 6}};
		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = array[i].length - 1; j >= 0; j--)
				System.out.print(array[i][j] + " ");
			System.out.println();
		}
		
		int sum = 0;
		for (int i = 0; i < array.length; i++)
			sum += array[i][0];
		System.out.println(sum);
		
		// Ragged Arrays
		int[][] a = {{1 , 2 , 3 , 4 , 5} , 
				     {2 , 3 , 4 , 5} ,   
				     {3 , 4 , 5} ,
				     {4 , 5} , 
				     {5}};
		
		for (int i = 0; i < a.length; i++)
			System.out.println(Arrays.toString(a[i]));
		
		// If you don’t know the values, but do know the sizes
		int[][] b = new int[5][];
		b = new int[0][5];
		b = new int[1][4];
		b = new int[2][3];
		b = new int[4][2];
		b = new int[5][1];
		
		System.out.println(Arrays.toString(b));
		
		
		
	}

}
