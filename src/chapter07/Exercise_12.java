package chapter07;

import java.util.Random;
import java.util.Scanner;

/**
 * Reverse an array
 * The reverse method in Section 7.7 reverses an array by copying it to a new array. 
 * Rewrite the method that reverses the array passed in the argument and returns this array. 
 * Write a test program that prompts the user to enter ten numbers, invokes the method to reverse the numbers, and displays the numbers.
 * 
 * 05/12/2017   7:08:12 PM
 *  
 * @author roman
 *
 *
 * Exercise_12
 *
 */
public class Exercise_12 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] reverseArray = new int[10];
		insertNumbers(reverseArray);
		displayArray(reverseArray);
		
		reverseArray = reverseArr(reverseArray);
		displayArray(reverseArray);
	}
	
	/**
	 * Display every element in the array
	 * 
	 * @param reverseArray
	 */
	public static void displayArray(int[] reverseArray)
	{
		for (int i = 0; i < reverseArray.length; i++)
			System.out.print(reverseArray[i] + " ");
	}
	
	/**
	 * reverses the array passed in the argument and returns this array
	 * 
	 * @param reverseArray
	 * @return
	 */
	public static int[] reverseArr(int[] reverseArray)
	{
		int[] tempArray = new int[reverseArray.length];
		int counter = 0;
		
		for (int i = reverseArray.length - 1; i >= 0; i--)
		{
			tempArray[counter] = reverseArray[i];
			counter++;
		}
		
		return tempArray;
	}
	
	/**
	 * Insert 10 elements into the array
	 * 
	 * @param reverseArray
	 */
	public static void insertNumbers(int[] reverseArray)
	{
		System.out.print("Enter 10 integers: ");
		Random r = new Random();
		for (int i = 0; i < 10; i++)
			reverseArray[i] = r.nextInt(100);
		
		
	}
}
