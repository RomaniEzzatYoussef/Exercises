package chapter02;

import java.util.Scanner;

/**
 * Physics: acceleration
 * Write a program that prompts the user to enter the starting velocity v0 in meters/second, 
 * the ending velocity v1 in meters/second, 
 * and the time span t in seconds, and displays the average acceleration.
 * a = (v1 - v0) / t
 */
public class Exercise_09 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter v0, v1 and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		double a = (v1 - v0) / t;
		
		System.out.println("The average acceleration is: " + a);
		
		input.close();

	}

}
