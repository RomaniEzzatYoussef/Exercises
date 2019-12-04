package chapter07;

import java.util.Random;

/**
 * Count single digits
 * Write a program that generates 100 random integers between 0 and 9 and displays the count for each number. 
 * (Hint: Use an array of ten integers, say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 * 
 * 05/12/2017   6:14:01 PM
 *  
 * @author roman
 *
 *
 * Exercise_07
 *
 */
public class Exercise_07 
{
	final static int NUMBER = 10;

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] countDigitsArray = new int[NUMBER];
		
		generateRndNumbers(countDigitsArray);
		displayArray(countDigitsArray);
	}
	
	/**
	 * Display array with the counts for the appearance of each number
	 * from 0 to 9
	 * 
	 * @param countDigitsArray
	 */
	public static void displayArray(int[] countDigitsArray)
	{
		for (int i = 0; i < countDigitsArray.length; i++)
			System.out.println(i + " " + countDigitsArray[i]);
	}
	
	/**
	 * Generate numbers between 0 to 9, 100 times and store it in their 
	 * respective indexes
	 * 
	 * @param countDigitsArray
	 */
	public static void generateRndNumbers(int[] countDigitsArray)
	{
		Random random = new Random();
		int randomNumber = random.nextInt(10);
		
		for (int i = 1; i <= 100; i++)
		{
			countDigitsArray[randomNumber]++; 
			randomNumber = random.nextInt(10);
		}
	}
}
