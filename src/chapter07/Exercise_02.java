package chapter07;

import java.util.Scanner;

/**
 * Reverse the numbers entered
 * Write a program that reads ten integers and displays them in the reverse of the order in which they were read.
 * 
 * 05/12/2017   4:55:45 PM
 *  
 * @author roman
 *
 *
 * Exercise_02
 *
 */
public class Exercise_02 
{
	static Scanner input = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] reverseNumbers = new int[10];
		
		System.out.print("Enter the number: ");
		inputIntegers(reverseNumbers);
		displayArray(reverseNumbers);
		
		input.close();
	}
	
	/**
	 * Display the array in reverse order
	 * 
	 * @param reverseNumber
	 */
	public static void displayArray(int[] reverseNumbers)
	{
		for (int i = reverseNumbers.length - 1; i >= 0; i--)
			System.out.print(reverseNumbers[i]);
	}
	
	/**
	 * Stores numbers into each element of the array
	 * 
	 * @param reverseNumbers
	 */
	public static void inputIntegers(int[] reverseNumbers)
	{
		for (int i = 0; i < reverseNumbers.length; i++)
			reverseNumbers[i] = input.nextInt();
	}
}
