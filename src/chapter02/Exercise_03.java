package chapter02;

import java.util.Scanner;

/**
 * Convert feet into meters 
 * Write a program that reads a number in feet, converts it to meters, and displays the result. 
 * One foot is 0.305 meter.
 */
public class Exercise_03 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the feet: ");
		double feet = input.nextDouble();
		double meter = feet * 0.305;
		
		System.out.println(feet + " feet = " + meter + " meter");
		
		input.close();
	}

}
