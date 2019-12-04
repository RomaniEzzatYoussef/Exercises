package chapter05;

import java.util.Scanner;

/**
 * Count positive and negative numbers and compute the average of numbers
 * Write a program that reads an unspecified number of integers, 
 * determines how many positive and negative values have been read, 
 * and computes the total and average of the input values (not counting zeros). 
 * Your program ends with the input 0. 
 * Display the average as a floating-point number.
 * 
 * 29/11/2017   8:12:05 AM
 *  
 * @author roman
 *
 *
 * Exercise_01
 *
 */
public class Exercise_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		float positiveSum = 0;
		float negativeSum = 0;
		
		int positiveCounter = 0;
		int negativeCounter = 0;
		
		System.out.print("Enter the number: ");
		float number = input.nextFloat();
		
		if (number == 0)
			System.out.println("No numbers are entered except 0");
		
		while (number != 0)
		{
			if (number > 0)
			{
				positiveSum += number;
				positiveCounter++;
			}
			else
			{
				negativeSum += number;
				negativeCounter++;
			}
			number = input.nextFloat();
		}
		
		System.out.print("The number of positives is " + positiveCounter
				+ "\nThe number of negative is " + negativeCounter
				+ "\nPositive sum: " + positiveSum
				+ "\nNegative sum: " + negativeSum
				+ "\nPositive average: " + positiveSum / positiveCounter
				+ "\nNegative average:: " + negativeSum / negativeCounter);
		
		input.close();
	}
}
