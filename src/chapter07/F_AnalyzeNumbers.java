package chapter07;

import java.util.Scanner;

/**
 *
 * 03/12/2017   6:04:11 PM
 *  
 * @author roman
 *
 *
 * AnalyzeNumbers
 *
 */
public class F_AnalyzeNumbers 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of items: ");
		int n = input.nextInt();
		
		double[] numbers = new double[n];
		
		int sum = 0;
		
		//System.out.print("Enter the numbers: ");
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = Math.random() * 100 + 1;
			sum += numbers[i];
		}
		
		for (double e : numbers)
			System.out.println(e);
		
		double average = sum / n;
		
		int counter = 0;
		for (int i = 0; i < numbers.length; i++)
			if (numbers[i] > average)
				counter++;
		
		System.out.println("Average is " + average);
		System.out.println("Number of elements above the average is " + counter);
		
		input.close();
	}

}
