package chapter08;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Row sorting
 * Implement the following method to sort the rows in a two dimensional array. 
 * A new array is returned and the original array is intact. 
 * public static double[][] sortRows(double[][] m)
 * Write a test program that prompts the user to enter a 3 * 3 matrix of double values and displays a new row-sorted matrix.
 * 
 * 12/12/2017   12:39:10 PM
 *  
 * @author roman
 *
 *
 * Exercise_26
 *
 */
public class Exercise_26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double[][] matrix = enterMatrixValues();
		displayMatrix(sortRows(matrix));
	}
	
	/**
	 * Return a new row-sorted matrix
	 * 
	 * @param m
	 * @return
	 */
	public static double[][] sortRows(double[][] m)
	{
		double[][] tempMatrix = new double[m.length][m.length];
		System.arraycopy(m, 0, tempMatrix, 0, m.length);
		
		for (int i = 0; i < m.length; i++)
			Arrays.sort(tempMatrix[i]);
		
		return tempMatrix;
	}
	
	/**
	 * Displays the matrix
	 * 
	 * @param matrix
	 */
	public static void displayMatrix(double[][] matrix)
	{
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}
	
	/**
	 * Request user to enter the values for the matrix
	 * and returns the matrix
	 * 
	 * @return
	 */
	public static double[][] enterMatrixValues()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the values: ");
		
		double[][] matrix = new double[3][3];
		
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = input.nextDouble();
		
		input.close();
		return matrix;
	}
}
