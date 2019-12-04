package chapter03;

import java.util.Scanner;

/**
 * Geometry: point in a circle?
 * Write a program that prompts the user to enter a point (x, y) 
 * and checks whether the point is within the circle centered at (0, 0) with radius 10.
 * 
 * 12/10/2017   12:00:20 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_22
 *
 */
public class Exercise_22 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double distance = Math.pow((x * x) + (y * y), 0.5);
		
		if (distance <= 10)
			System.out.print("(" + x + ", " + y + ") is in the circle");
		else
			System.out.print("(" + x + ", " + y + ") is not in the circle");
		
		
		input.close();
	}

}
