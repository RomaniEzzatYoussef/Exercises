package chapter05;

import java.util.Scanner;

/**
 * Statistics: compute mean and standard deviation
 * In business applications, you are often asked to compute the mean and standard deviation of data. 
 * The mean is simply the average of the numbers. The standard deviation is a statistic that tells
 * you how tightly all the various data are clustered around the mean in a set of data. 
 * For example, what is the average age of the students in a class? How close are the ages? 
 * If all the students are the same age, the deviation is 0.
 * Write a program that prompts the user to enter ten numbers, 
 * and displays the mean and standard deviations of these numbers using the following formula:
 * 
 * 30/11/2017   10:04:49 AM
 *  
 * @author roman
 *
 *
 * Exercise_45
 *
 */
public class Exercise_45 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double number;
		double total = 0;
		double dev = 0;
		
		System.out.print("Enter 10 numbers: ");
		
		for (int i = 0; i < 10; i++)
		{
			number = input.nextDouble();
			total += number;
			dev += (number * number);
		}
		
		System.out.printf("The mean is %.2f \n", (total / 10));
		dev = Math.sqrt(((dev - ((total * total) / 10)) / 9));
		System.out.printf("The standard deviation is %f", dev);
		
		input.close();
	}

}
