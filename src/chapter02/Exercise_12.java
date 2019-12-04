package chapter02;

import java.util.Scanner;

/**
 * Physics: finding runway length
 * Given an airplane’s acceleration a and take-off speed v, 
 * you can compute the minimum runway length needed for an airplane to take off using the following formula:
 * length = v^2 / 2a
 * Write a program that prompts the user to enter v in meters/second (m/s) 
 * and the acceleration a in meters/second squared (m/s2), and displays the minimum runway length.
 */
public class Exercise_12 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the airplane's acceleration and enter the take-off speed: ");
		double v = input.nextDouble();
		double a = input.nextDouble();
		
		double length = (v * v) / (2 * a);
		System.out.println("The minimum runaway length is " + length);
		
		input.close();
	}

}
