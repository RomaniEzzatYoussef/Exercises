package chapter11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * 06/05/2019   4:10:36 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_09
 *
 */
public class Exercise_09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the size of the matrix: ");
		int[][] binaryMatrix = createMatrix(input.nextInt());
		displayMatrix(binaryMatrix);
		ArrayList<Integer> largestRowList = findLargestRow(binaryMatrix);
		ArrayList<Integer> largestColList = findLargestCol(binaryMatrix);
		
		System.out.println("Largest row is " + largestRowList.toString()
							+ "\nLargest column is " + largestColList.toString());
		
		input.close();
	}
	
	public static ArrayList<Integer> findLargestRow(int[][] binaryMatrix)
	{
		if (binaryMatrix.length == 0)
		{
			System.out.println("Matyrix is empty!");
			return new ArrayList<Integer>();
		}
		
		ArrayList<Integer> tempLargestRowList = new ArrayList<>();
		int largest = 0;
		
		for (int i = 0; i < binaryMatrix.length; i++)
		{
			int counter = 0;
			
			for (int j = 0; j < binaryMatrix[i].length; j++)
				if (binaryMatrix[i][j] == 1)
					counter++;
			
			if (counter > largest)
			{
				largest = counter;
				tempLargestRowList.clear();
				tempLargestRowList.add(i);
			}
			else if (counter == largest)
				tempLargestRowList.add(i);			
		}
		
		return tempLargestRowList;
	}
	
	public static ArrayList<Integer> findLargestCol(int[][] binaryMatrix)
	{
		if (binaryMatrix.length == 0)
		{
			System.out.println("Matyrix is empty!");
			return new ArrayList<Integer>();
		}
		
		ArrayList<Integer> tempLargestRowList = new ArrayList<>();
		int largest = 0;
		
		for (int i = 0; i < binaryMatrix.length; i++)
		{
			int counter = 0;
			
			for (int j = 0; j < binaryMatrix[i].length; j++)
				if (binaryMatrix[j][i] == 1)
					counter++;
			
			if (counter > largest)
			{
				largest = counter;
				tempLargestRowList.clear();
				tempLargestRowList.add(i);
			}
			else if (counter == largest)
				tempLargestRowList.add(i);			
		}
		
		return tempLargestRowList;
	}
	
	/**
	 * Display the matrix
	 * 
	 * @param binaryMatrix
	 */
	public static void displayMatrix(int[][] binaryMatrix)
	{
		for (int i = 0; i < binaryMatrix.length; i++)
		{
			for (int j = 0; j < binaryMatrix[i].length; j++)
				System.out.print(binaryMatrix[i][j] + " ");
			System.out.println();
		}
	}
	
	/**
	 * Create a n by n 2 dimensional array filled with 0s and 1s
	 * 
	 * @param size
	 * @return
	 */
	public static int[][] createMatrix(int size)
	{
		int[][] tempBinaryMatrix = new int[size][size];
		Random randBinary = new Random();
		
		for (int i = 0; i < tempBinaryMatrix.length; i++)
			for (int j = 0; j < tempBinaryMatrix[i].length; j++)
				tempBinaryMatrix[i][j] = randBinary.nextInt(2);
		
		return tempBinaryMatrix;
	}
}
